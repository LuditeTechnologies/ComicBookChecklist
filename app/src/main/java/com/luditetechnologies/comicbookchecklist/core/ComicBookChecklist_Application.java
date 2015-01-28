package com.luditetechnologies.comicbookchecklist.core;

import android.app.Application;
import android.content.Context;
import com.parse.Parse;


public class ComicBookChecklist_Application extends Application {

    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();

        sContext = getApplicationContext();

//        try {
//            // Enable Local Datastore.
//            Parse.enableLocalDatastore(this);
//            Parse.initialize(this, getString(R.string.ParseAppId), getString(R.string.ParseClientKey));
//        } catch (Exception ex) {
//        }
    }

    public static Context getContext() {
        return sContext;
    }
}

