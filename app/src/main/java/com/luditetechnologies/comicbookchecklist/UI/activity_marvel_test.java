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
    public static final int MAX_CHARACTER_INCREMENT = 100;
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
        ListView listview = (ListView) findViewById(R.id.listview);
        CharacterListViewAdapter adapter = new CharacterListViewAdapter(activity_marvel_test.this, _characters);
        listview.setAdapter(adapter);

        stopLoading();
    }

    private void SetAttrib(String attribText) {
        TextView txtMarvelAttrib;
        txtMarvelAttrib = (TextView) findViewById(R.id.txtMarvelAttrib);
        txtMarvelAttrib.setText(Html.fromHtml(attribText));
        txtMarvelAttrib.setMovementMethod(LinkMovementMethod.getInstance());
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

            SetAttrib(base.getString("attributionHTML"));

            for (int i = 0; i < results.length(); i++) {
                String thumbnailPath = results.getJSONObject(i).getJSONObject("thumbnail").getString("path");
                _characters.add(new MarvelCharacter(results.getJSONObject(i).getString("name"), thumbnailPath));
            }

            if (_characters.size() < _characterTotal) {
                _offset += MAX_CHARACTER_INCREMENT;

                GetCharacters(_offset);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ShowUi();
            stopLoading();
        }


    }

    //</editor-fold>

}
