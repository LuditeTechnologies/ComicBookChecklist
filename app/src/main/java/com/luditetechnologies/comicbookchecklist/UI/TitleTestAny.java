package com.luditetechnologies.comicbookchecklist.UI;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.luditetechnologies.comicbookchecklist.R;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;


public class TitleTestAny extends ActionBarActivity {

    private String _titleClassName;
    private static List<ParseObject> allObjects;
    private int _queryLimit = 1000;
    private int _querySkip = 0;
    protected ProgressDialog proDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_test_any);

        _titleClassName = getString(R.string.TitleClassName);

        final Button btnGo = (Button) findViewById(R.id.btnGo);
        final EditText txtTitlesAnySearch = (EditText) findViewById(R.id.txtTitlesAnySearch);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    startLoading();

                    allObjects = new ArrayList<>();
                    ParseQuery<ParseObject> query3 = ParseQuery.getQuery(_titleClassName);
                    query3.whereContains("name", String.valueOf(txtTitlesAnySearch.getText()));
                    query3.setLimit(_queryLimit);
                    query3.findInBackground(getallobjects());


                } catch (Exception e) {
                    Vibrator vibratorDildo = (Vibrator) getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                    vibratorDildo.vibrate(1000);

                    Toast.makeText(getApplicationContext(), "Testing Any Titles failed!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });


    }

    private FindCallback<ParseObject> getallobjects() {
        return new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> list, ParseException e) {
                allObjects.addAll(list);
                if (list.size() == _queryLimit) {
                    _querySkip += _queryLimit;
                    ParseQuery<ParseObject> query = ParseQuery.getQuery(_titleClassName);
                    query.setSkip(_querySkip);
                    query.setLimit(_queryLimit);
                    query.findInBackground(getallobjects());
                } else {
                    TextView titles = (TextView) findViewById(R.id.txtTitlesAny);
                    String text = "";

                    for (ParseObject o : allObjects) {
                        text += o.getString("name") + "\n";
                    }
                    stopLoading();

                    titles.setText(text);

                }

            }
        };
    }

    protected void startLoading() {
        proDialog = new ProgressDialog(this);
        proDialog.setMessage("Loading. Please wait...");
        proDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        proDialog.setCancelable(false);
        proDialog.show();
    }

    protected void stopLoading() {
        proDialog.dismiss();
        proDialog = null;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_title_test_any, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
