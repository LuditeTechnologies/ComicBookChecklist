package com.luditetechnologies.comicbookchecklist.classes;

import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.luditetechnologies.comicbookchecklist.R;
import com.luditetechnologies.comicbookchecklist.UI.AsyncResponse;
import com.luditetechnologies.comicbookchecklist.core.MarvelClientRequest;
import com.luditetechnologies.comicbookchecklist.core.MarvelContract;
import com.luditetechnologies.comicbookchecklist.core.Utils;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataLoader implements AsyncResponse {

    //<editor-fold desc="Variables">
    public static final int MAX_CHARACTER_INCREMENT = 50; //TODO: increase back to 100 after development
    private List<MarvelCharacter> _characters = new ArrayList<>();
    private int _offset = 0;
    private int _characterWebTotal = 0;
    private Context _context;
    //</editor-fold>


    //<editor-fold desc="Methods">

    public DataLoader(Context context){
        _context = context;
    }

    public void GetCharacters(int offset) throws Exception {

        long timeStamp = new java.util.Date().getTime();

        String hash;
        hash = Utils.generateMD5(String.valueOf(timeStamp) + _context.getString(R.string.marvel_private_key) + _context.getString(R.string.marvel_public_key));

        MarvelClientRequest mcr = new MarvelClientRequest();
        mcr.delegate = this;

        Log.i("url_to_marvel", _context.getString(R.string.marvel_characters_url_base) + "?offset=" + offset + "&limit=" + MAX_CHARACTER_INCREMENT + "&hash=" + hash + "&ts=" + timeStamp + "&apikey=" + _context.getString(R.string.marvel_public_key));
        mcr.execute(_context.getString(R.string.marvel_characters_url_base) + "?offset=" + offset + "&limit=" + MAX_CHARACTER_INCREMENT + "&hash=" + hash + "&ts=" + timeStamp + "&apikey=" + _context.getString(R.string.marvel_public_key));

    }

    private SQLiteDatabase GetMarvelDatabase() {
        MarvelContract.MarvelDbHelper mDbHelper = new MarvelContract.MarvelDbHelper(_context.getApplicationContext());
        return mDbHelper.getWritableDatabase();
    }

    private MarvelCharacter GenerateCharacter(Cursor c) throws Exception {
        MarvelCharacter m = null;

        try {
            if (c.moveToFirst()) {
                m = new MarvelCharacter(
                        c.getInt(c.getColumnIndex(MarvelContract.MarvelCharacter.COLUMN_NAME_MARVEL_ID)),
                        c.getString(c.getColumnIndex(MarvelContract.MarvelCharacter.COLUMN_NAME_NAME)),
                        c.getString(c.getColumnIndex(MarvelContract.MarvelCharacter.COLUMN_NAME_THUMBNAILPATH))
                );

                m.SetResourceUri(c.getString(c.getColumnIndex(MarvelContract.MarvelCharacter.COLUMN_NAME_RESOURCEURI)));
                m.SetDescription(c.getString(c.getColumnIndex(MarvelContract.MarvelCharacter.COLUMN_NAME_DESCRIPTION)));

            }
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
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

    //</editor-fold>

    @Override
    public void processFinish(String output) {
        if (output == null) {
            Log.i("output_is_null", "output is null");
            //ShowUi();
            return;
        }

        JSONObject base;
        JSONObject data;
        JSONArray results;

        try {
            SQLiteDatabase db = GetMarvelDatabase();

            base = new JSONObject(output);
            data = base.getJSONObject("data");
            results = data.getJSONArray("results");

            //SetMarvelAttribution(base.getString("attributionHTML"));

            if (_characterWebTotal != data.getInt("total")) {
                _characterWebTotal = data.getInt("total");
            }

            if (DatabaseUtils.queryNumEntries(db, MarvelContract.MarvelCharacter.TABLE_NAME) != _characterWebTotal) {
                for (int i = 0; i < results.length(); i++) {
                    long rowExists = DatabaseUtils.queryNumEntries(db, MarvelContract.MarvelCharacter.TABLE_NAME, MarvelContract.MarvelCharacter.COLUMN_NAME_MARVEL_ID + " = " + results.getJSONObject(i).getInt("id"));

                    if (rowExists == 0) {
                        Log.i("Adding character to database", results.getJSONObject(i).getString("name"));

                        ContentValues values = new ContentValues();
                        values.put(MarvelContract.MarvelCharacter.COLUMN_NAME_MARVEL_ID, results.getJSONObject(i).getInt("id"));
                        values.put(MarvelContract.MarvelCharacter.COLUMN_NAME_NAME, results.getJSONObject(i).getString("name"));
                        values.put(MarvelContract.MarvelCharacter.COLUMN_NAME_DESCRIPTION, results.getJSONObject(i).getString("description"));
                        values.put(MarvelContract.MarvelCharacter.COLUMN_NAME_MODIFIED, String.valueOf(GetDateFromJSON(results.getJSONObject(i).getString("modified"))));
                        values.put(MarvelContract.MarvelCharacter.COLUMN_NAME_RESOURCEURI, results.getJSONObject(i).getString("resourceURI"));

                        if (!results.getJSONObject(i).isNull("thumbnail")) {
                            values.put(MarvelContract.MarvelCharacter.COLUMN_NAME_THUMBNAILPATH, results.getJSONObject(i).getJSONObject("thumbnail").getString("path"));
                            values.put(MarvelContract.MarvelCharacter.COLUMN_NAME_THUMBNAILEXTENSION, results.getJSONObject(i).getJSONObject("thumbnail").getString("extension"));
                        } else {
                            values.put(MarvelContract.MarvelCharacter.COLUMN_NAME_THUMBNAILPATH, "null");
                        }

                        //Insert the new row, returning the primary key value of the new row
                        long newRowId = db.insert(
                                MarvelContract.MarvelCharacter.TABLE_NAME,
                                "null",
                                values);

                        Log.i("Character added to database", results.getJSONObject(i).getString("name"));
                    }

                    Cursor c = db.rawQuery("SELECT * FROM " + MarvelContract.MarvelCharacter.TABLE_NAME + " WHERE " + MarvelContract.MarvelCharacter.COLUMN_NAME_MARVEL_ID + " = " + results.getJSONObject(i).getInt("id"), null);
                    _characters.add(GenerateCharacter(c));

                }
            }

            //TODO: uncomment the next line to get everything. I commented it out during development
            if (_characters.size() < _characterWebTotal) {
                _offset += MAX_CHARACTER_INCREMENT;
                GetCharacters(_offset);
            } else {
                //ShowUi();
            }
        } catch (Exception e) {
            e.printStackTrace();
            //ShowUi();
        }
    }

}
