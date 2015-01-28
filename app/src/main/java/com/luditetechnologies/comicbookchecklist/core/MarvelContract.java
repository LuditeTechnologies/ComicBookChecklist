package com.luditetechnologies.comicbookchecklist.core;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public final class MarvelContract {
    public MarvelContract() {
    }

    public static final String DATABASE_NAME = "Marvel.db";

    //<editor-fold desc="SQL Commands">
    private static final String SQL_CREATE_CHARACTERS_TABLE =
            "CREATE TABLE " + MarvelCharacter.TABLE_NAME + " ("
                    + MarvelCharacter._ID + " INTEGER PRIMARY KEY, "
                    + MarvelCharacter.COLUMN_NAME_MARVEL_ID + " INTEGER NOT NULL, "
                    + MarvelCharacter.COLUMN_NAME_NAME + " TEXT NOT NULL, "
                    + MarvelCharacter.COLUMN_NAME_DESCRIPTION + " TEXT NULL, "
                    + MarvelCharacter.COLUMN_NAME_MODIFIED + " DATETIME NOT NULL, "
                    + MarvelCharacter.COLUMN_NAME_RESOURCEURI + " TEXT NULL, "
                    + MarvelCharacter.COLUMN_NAME_THUMBNAILPATH + " TEXT NULL, "
                    + MarvelCharacter.COLUMN_NAME_THUMBNAILEXTENSION + " TEXT NULL"
                    + " )";

    private static final String SQL_DELETE_CHARACTERS_TABLE = "DROP TABLE IF EXISTS " + MarvelCharacter.TABLE_NAME;
    //</editor-fold>

    public static class MarvelDbHelper extends SQLiteOpenHelper {
        public static final int DATABASE_VERSION = 1;
        public static final String DATABASE_NAME = MarvelContract.DATABASE_NAME;

        public MarvelDbHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(SQL_CREATE_CHARACTERS_TABLE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL(SQL_DELETE_CHARACTERS_TABLE);
            onCreate(db);
        }

        public void onDownGrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            onUpgrade(db, oldVersion, newVersion);
        }
    }

    public static abstract class MarvelCharacter implements BaseColumns {
        public static final String TABLE_NAME = "character";
        public static final String COLUMN_NAME_MARVEL_ID = "marvelid";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_DESCRIPTION = "description";
        public static final String COLUMN_NAME_MODIFIED = "modified";
        public static final String COLUMN_NAME_RESOURCEURI = "resourceuri";
        public static final String COLUMN_NAME_THUMBNAILPATH = "thumbnailpath";
        public static final String COLUMN_NAME_THUMBNAILEXTENSION = "thumbnailextension";
//        public static final String COLUMN_NAME_THUMBNAIL_XLARGE = "thumbnailxlarge";
//        public static final String COLUMN_NAME_THUMBNAIL_DETAIL = "thumbnaildetail";
    }

}