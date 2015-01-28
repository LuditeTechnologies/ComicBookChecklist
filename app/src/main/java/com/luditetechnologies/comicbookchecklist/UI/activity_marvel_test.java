package com.luditetechnologies.comicbookchecklist.UI;

import android.app.Application;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.luditetechnologies.comicbookchecklist.R;
import com.luditetechnologies.comicbookchecklist.classes.MarvelCharacter;
import com.luditetechnologies.comicbookchecklist.core.CharacterListViewAdapter;
import com.luditetechnologies.comicbookchecklist.core.ComicBookChecklist_Application;
import com.luditetechnologies.comicbookchecklist.core.MarvelClientRequest;
import com.luditetechnologies.comicbookchecklist.core.MarvelContract;
import com.luditetechnologies.comicbookchecklist.core.Utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.luditetechnologies.comicbookchecklist.core.MarvelContract.*;


public class activity_marvel_test extends ActionBarActivity implements AsyncResponse {

    //<editor-fold desc="Variables">
    public static final int MAX_CHARACTER_INCREMENT = 100; //TODO: increase back to 100 after development
    private List<MarvelCharacter> _characters = new ArrayList<>();
    protected ProgressDialog proDialog;
    private int _offset = 0;
    private int _characterTotal = 0;
    //</editor-fold>

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_marvel_test);

        GetAllCharacters();

    }


    //<editor-fold desc="Methods">
    protected void startLoading(String message) {
        proDialog = new ProgressDialog(this);
        proDialog.setTitle(getString(R.string.app_name));
        proDialog.setMessage(message);
        proDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        proDialog.setCancelable(false);
        proDialog.show();
    }

    protected void stopLoading() {
        try {
            proDialog.dismiss();
            proDialog = null;
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
        }
    }

    private void GetAllCharacters() {
        startLoading("Hold on. Loading Marvel characters");

        try {
            GetCharacters(_offset);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void GetCharacters(int offset) throws Exception {

        long timeStamp = new java.util.Date().getTime();

        String hash;
        hash = Utils.generateMD5(String.valueOf(timeStamp) + getString(R.string.marvel_private_key) + getString(R.string.marvel_public_key));

        MarvelClientRequest mcr = new MarvelClientRequest();
        mcr.delegate = this;

        Log.i("url_to_marvel", getString(R.string.marvel_characters_url_base) + "?offset=" + offset + "&limit=" + MAX_CHARACTER_INCREMENT + "&hash=" + hash + "&ts=" + timeStamp + "&apikey=" + getString(R.string.marvel_public_key));
        mcr.execute(getString(R.string.marvel_characters_url_base) + "?offset=" + offset + "&limit=" + MAX_CHARACTER_INCREMENT + "&hash=" + hash + "&ts=" + timeStamp + "&apikey=" + getString(R.string.marvel_public_key));

    }

    private void ShowUi() {
        ListView lstCharacters = (ListView) findViewById(R.id.lstCharacters);
        CharacterListViewAdapter adapter = new CharacterListViewAdapter(activity_marvel_test.this, _characters);
        lstCharacters.setAdapter(adapter);

        stopLoading();
    }

    private void SetMarvelAttribution(String attributionText) {
        TextView txtMarvelAttribute = (TextView) findViewById(R.id.txtMarvelAttrib);

        if (txtMarvelAttribute.getText() == attributionText) {
            return;
        }

        txtMarvelAttribute.setText(Html.fromHtml(attributionText));
        txtMarvelAttribute.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private MarvelCharacter GenerateCharacter(JSONObject o) throws JSONException {
        MarvelCharacter m = null;
        try {
            if (!o.isNull("thumbnail")) {
                m = new MarvelCharacter(o.getInt("id"), o.getString("name"), o.getJSONObject("thumbnail").getString("path"));

                if (m.GetImageBasePath() != null) {
                    try {
                        m.GetImage(MarvelCharacter.ImageSize.PortraitXlarge);
                        //m.GetImage(MarvelCharacter.ImageSize.Detail);
                    } catch (Exception e) {
                        Log.e("Error", "Error getting character images");
                    }
                }
            } else {
                m = new MarvelCharacter(o.getInt("id"), o.getString("name"), null);
                //TODO: since there isn't a thumbnail path, should I call a default image?
            }
        } catch (Exception e) {
            Log.i("Character generation failed", e.getMessage());
        }

        try {
            if (!o.isNull("thumbnail")) {
                m.SetImageExtension(o.getJSONObject("thumbnail").getString("extension"));
            }

        } catch (Exception e) {
            Log.i("No thumbnail extension", m.GetName());
            m.SetImageExtension(null);
        }

        return m;
    }

    private Date GetDateFromJSON(String input) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss-SSSS");
        Date rtn = null;
        try {
            rtn = sdf.parse(input);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return rtn;
    }

    @Override
    public void processFinish(String output) {

        if (output == null) {
            Log.i("output_is_null", "output is null");
            ShowUi();
            return;
        }

        JSONObject base;
        JSONObject data;
        JSONArray results;

        try {
            MarvelDbHelper mDbHelper = new MarvelDbHelper(getApplicationContext());

            SQLiteDatabase db = mDbHelper.getWritableDatabase();

            base = new JSONObject(output);
            data = base.getJSONObject("data");
            results = data.getJSONArray("results");

            if (_characterTotal != data.getInt("total")) {
                _characterTotal = data.getInt("total");
            }

            SetMarvelAttribution(base.getString("attributionHTML"));

            for (int i = 0; i < results.length(); i++) {
                ContentValues values = new ContentValues();
                values.put(MarvelContract.MarvelCharacter.COLUMN_NAME_MARVEL_ID, results.getJSONObject(i).getInt("id"));
                values.put(MarvelContract.MarvelCharacter.COLUMN_NAME_NAME, results.getJSONObject(i).getString("name"));
                values.put(MarvelContract.MarvelCharacter.COLUMN_NAME_DESCRIPTION, results.getJSONObject(i).getString("description"));
                values.put(MarvelContract.MarvelCharacter.COLUMN_NAME_MODIFIED, String.valueOf(GetDateFromJSON(results.getJSONObject(i).getString("modified"))));
                values.put(MarvelContract.MarvelCharacter.COLUMN_NAME_RESOURCEURI, results.getJSONObject(i).getString("resourceURI"));

                try {
                    values.put(MarvelContract.MarvelCharacter.COLUMN_NAME_THUMBNAILPATH, results.getJSONObject(i).getJSONObject("thumbnail").getString("path"));
                    values.put(MarvelContract.MarvelCharacter.COLUMN_NAME_THUMBNAILEXTENSION, results.getJSONObject(i).getJSONObject("thumbnail").getString("extension"));
                } catch (Exception e) {
                    values.put(MarvelContract.MarvelCharacter.COLUMN_NAME_THUMBNAILPATH, "null");
                    values.put(MarvelContract.MarvelCharacter.COLUMN_NAME_THUMBNAILEXTENSION, "null");
                }


                // Insert the new row, returning the primary key value of the new row
                long newRowId = db.insert(
                        MarvelContract.MarvelCharacter.TABLE_NAME,
                        "null",
                        values);
                Log.i("new character added", results.getJSONObject(i).getString("name"));

                _characters.add(GenerateCharacter(results.getJSONObject(i)));

            }

            //TODO: uncomment the next line to get everything. I commented it out during development
            if (_characters.size() < _characterTotal) {
                _offset += MAX_CHARACTER_INCREMENT;
                GetCharacters(_offset);
            } else {
                stopLoading();
                ShowUi();
            }
        } catch (Exception e) {
            e.printStackTrace();
            stopLoading();
            ShowUi();
        }
    }

    //</editor-fold>

}
