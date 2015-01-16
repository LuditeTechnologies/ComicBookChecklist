package com.luditetechnologies.comicbookchecklist.UI;

import android.app.ProgressDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.luditetechnologies.comicbookchecklist.core.ListViewAdapter;
import com.luditetechnologies.comicbookchecklist.R;
import com.luditetechnologies.comicbookchecklist.classes.IssueTitle;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;


public class TitleTest extends ActionBarActivity {

    private String _titleClassName;
    private static List<ParseObject> allObjects;
    private int _queryLimit = 1000;
    private int _querySkip = 0;
    protected ProgressDialog proDialog;

    ListView listview;
    ListViewAdapter adapter;
    private List<IssueTitle> titleList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titles_test);

        _titleClassName = getString(R.string.TitleClassName);

        startLoading();

        allObjects = new ArrayList<>();
        ParseQuery<ParseObject> query3 = ParseQuery.getQuery(_titleClassName);
        query3.setLimit(_queryLimit);
        query3.findInBackground(getAllTitles());
    }

    private FindCallback<ParseObject> getAllTitles() {
        return new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> list, ParseException e) {
                allObjects.addAll(list);

                if (list.size() == _queryLimit) {
                    _querySkip += _queryLimit;
                    ParseQuery<ParseObject> query = ParseQuery.getQuery(_titleClassName);
                    query.setSkip(_querySkip);
                    query.setLimit(_queryLimit);
                    query.findInBackground(getAllTitles());
                } else {
                    titleList = new ArrayList<IssueTitle>();
                    for (ParseObject title : allObjects) {
//                        IssueTitle map = new IssueTitle();
                        IssueTitle map = new IssueTitle((String) title.get("objectId"), (String) title.get("name"));
                        //map.SetTitle((String) title.get("name"));
                        titleList.add(map);
                    }

                    listview = (ListView) findViewById(R.id.listview);
                    adapter = new ListViewAdapter(TitleTest.this, titleList);
                    listview.setAdapter(adapter);
                    stopLoading();

                }
            }
        };


    }

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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_title_test, menu);
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
