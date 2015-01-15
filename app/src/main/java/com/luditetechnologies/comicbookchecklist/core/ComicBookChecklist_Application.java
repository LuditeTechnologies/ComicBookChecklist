package com.luditetechnologies.comicbookchecklist.core;

import android.app.Application;

import com.luditetechnologies.comicbookchecklist.R;
import com.parse.Parse;

/**
 * Created by arichardson on 1/13/2015.
 */
public class ComicBookChecklist_Application extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        try {
            // Enable Local Datastore.
            Parse.enableLocalDatastore(this);
            Parse.initialize(this, getString(R.string.ParseAppId), getString(R.string.ParseClientKey));
        } catch (Exception ex) {
        }
    }
}

