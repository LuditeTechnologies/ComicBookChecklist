package com.luditetechnologies.comicbookchecklist.classes;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;

import java.io.InputStream;

public class MarvelCharacter {

    //<editor-fold desc="Constructors">

    public MarvelCharacter(int marvelId, String resourceUri, String name){
        _marvelId = marvelId;
        _resourceUri = resourceUri;
        _name = name;
    }

    //</editor-fold>


    //<editor-fold desc="Variables">

    private int _marvelId;
    private String _name;
    private String _thumbnailPath_xlarge;
    private Bitmap _thumbnail_xlarge;
    private String _thumbnailExtension = "jpg";
    private String _resourceUri;

    //</editor-fold>


    //<editor-fold desc="Properties">

    public int GetMarvelId(){return _marvelId;}
    public void SetMarvelId(int value){_marvelId = value; }

    public String GetName(){return _name;}
    public void SetName(String value){_name = value; }

    //TODO: implement a way for callers to declare the size they need/want
    public String GetThumbnailPath_xlarge(){return _thumbnailPath_xlarge;}
    public void SetThumbnailPath_xlarge(String value){ _thumbnailPath_xlarge = value;}

    //TODO: I'm unsure if I should make this a readonly property or not
    //TODO: I want to store the thumbnails in a local database for better retrieval after the first time
    public Bitmap GetThumbnail_xlarge() throws Exception {
        if(_thumbnail_xlarge == null ) {
            if( _thumbnailPath_xlarge != null) {
                try {new DownloadImageTask(_thumbnail_xlarge).execute(_thumbnailPath_xlarge + "/portrait_xlarge." + _thumbnailExtension); }
                catch (Exception e) {} //TODO: The extension could be incorrect. Do nothing for now.
            }
            else{ throw new Exception("You must set the thumbnail path before getting the thumbnail"); }
        }

        return _thumbnail_xlarge;
    }
    public void SetThumbnail_xlarge(Bitmap value){ _thumbnail_xlarge = value; }

    public String GetThumbnailExtension(){return _thumbnailExtension;}
    public void SetThumbnailExtension(String value){ _thumbnailExtension = value;}

    public String GetResourceUri(){return _resourceUri;}
    public void SetResourceUri(String value){_resourceUri = value; }

    //</editor-fold>



    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        Bitmap bmImage;

        public DownloadImageTask(Bitmap bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) { _thumbnail_xlarge = result; }
    }

}
