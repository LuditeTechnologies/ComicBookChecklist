package com.luditetechnologies.comicbookchecklist.UI;

import android.app.ProgressDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.luditetechnologies.comicbookchecklist.R;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;


public class PublisherTest extends ActionBarActivity {

    private String _publisherClassName;
    private static List<ParseObject> allObjects;
    int _queryLimit = 1000;
    int _querySkip = 0;
    protected ProgressDialog proDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publisher_test);

        _publisherClassName = getString(R.string.PublisherClassName);

        startLoading();

        allObjects = new ArrayList<>();
        ParseQuery<ParseObject> query3 = ParseQuery.getQuery(_publisherClassName);
        //query3.whereExists("Tag");
        query3.setLimit(_queryLimit);
        query3.findInBackground(getallobjects());
    }

    private FindCallback<ParseObject> getallobjects() {
        return new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> list, ParseException e) {
                allObjects.addAll(list);
                if (list.size() == _queryLimit) {
                    _querySkip += _queryLimit;
                    ParseQuery<ParseObject> query = ParseQuery.getQuery(_publisherClassName);
                    query.setSkip(_querySkip);
                    query.setLimit(_queryLimit);
                    query.findInBackground(getallobjects());
                } else {
                    //you have full data in allobjects
                    TextView pubs = (TextView) findViewById(R.id.txtPublishers);
                    String text = "";

                    for (ParseObject o : allObjects) {
                        text += o.getString("name") + "\n";
                    }

                    stopLoading();

                    pubs.setText(text);

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
        getMenuInflater().inflate(R.menu.menu_publisher_test, menu);
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
