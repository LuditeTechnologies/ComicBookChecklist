package com.luditetechnologies.comicbookchecklist.UI;

import android.app.ProgressDialog;
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
import com.luditetechnologies.comicbookchecklist.core.MarvelClientRequest;
import com.luditetechnologies.comicbookchecklist.core.Utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


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

    //    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_activity_marvel_test, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }


    //<editor-fold desc="Methods">
    protected void startLoading() {
        proDialog = new ProgressDialog(this);
        proDialog.setTitle(getString(R.string.app_name));
        proDialog.setMessage(getString(R.string.loadingMessage));
        proDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        proDialog.setCancelable(false);
        proDialog.show();
    }

    protected void stopLoading() {
        proDialog.dismiss();
        proDialog = null;
    }

    private void GetAllCharacters() {
        startLoading();

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
            m = new MarvelCharacter(o.getInt("id"), o.getString("resourceURI"), o.getString("name"));
        } catch (Exception e) {
            Log.i("Character generation failed", e.getMessage());
        }

        try {
            m.SetThumbnailPath(o.getJSONObject("thumbnail").getString("path"));
        } catch (Exception e) {
            Log.i("No thumbnail", m.GetName());
            m.SetThumbnailPath(null);
        }

        try {
            m.SetThumbnailExtension(o.getJSONObject("thumbnail").getString("extension"));
        } catch (Exception e) {
            Log.i("No thumbnail extension", m.GetName());
            m.SetThumbnailExtension(null);
        }

        return m;
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
            base = new JSONObject(output);
            data = base.getJSONObject("data");
            results = data.getJSONArray("results");

            if (_characterTotal != data.getInt("total")) {
                _characterTotal = data.getInt("total");
            }

            SetMarvelAttribution(base.getString("attributionHTML"));

            for (int i = 0; i < results.length(); i++) {
                _characters.add(GenerateCharacter(results.getJSONObject(i)));
            }

            //TODO: uncomment the next line to get everything. I commented it out during development
           if (_characters.size() < _characterTotal) {
               _offset += MAX_CHARACTER_INCREMENT;
               GetCharacters(_offset);
           } else {
             ShowUi();
           }
        } catch (Exception e) {
            e.printStackTrace();
            stopLoading();
        }
    }

    //</editor-fold>

}
