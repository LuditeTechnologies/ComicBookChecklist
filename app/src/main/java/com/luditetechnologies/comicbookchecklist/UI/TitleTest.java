package com.luditetechnologies.comicbookchecklist.UI;

import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
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


public class TitleTest extends ActionBarActivity implements SwipeRefreshLayout.OnRefreshListener {

    private String _titleClassName;
    private static List<ParseObject> allObjects;
    private int _queryLimit = 1000;
    private int _querySkip = 0;
    protected ProgressDialog proDialog;
    private SwipeRefreshLayout swipeLayout;
    ListView listview;
    ListViewAdapter adapter;
    private List<IssueTitle> titleList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titles_test);

        _titleClassName = getString(R.string.TitleClassName);

        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_container);
        swipeLayout.setOnRefreshListener(this);
        swipeLayout.setColorScheme(android.R.color.holo_green_dark,
                android.R.color.holo_green_light,
                android.R.color.black,
                android.R.color.holo_green_light,
                android.R.color.holo_green_dark);

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
                    query.orderByAscending("name");
                    query.setSkip(_querySkip);
                    query.setLimit(_queryLimit);
                    query.findInBackground(getAllTitles());
                } else {
                    titleList = new ArrayList<>();
                    for (ParseObject title : allObjects) {
                        IssueTitle t = new IssueTitle((String) title.get("objectId"), (String) title.get("name"));
                        titleList.add(t);
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

    @Override
    public void onRefresh() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                allObjects = new ArrayList<>();
                ParseQuery<ParseObject> query3 = ParseQuery.getQuery(_titleClassName);
                query3.setLimit(_queryLimit);
                query3.findInBackground(getAllTitles());
                swipeLayout.setRefreshing(false);
            }
        }, 0);
    }
}
