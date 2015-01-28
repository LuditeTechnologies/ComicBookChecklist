package com.luditetechnologies.comicbookchecklist.classes;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;

import com.luditetechnologies.comicbookchecklist.core.ComicBookChecklist_Application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class MarvelCharacter {

    //<editor-fold desc="Enums">

    public enum ImageSize {
        PortraitSmall,
        PortraitMedium,
        PortraitXlarge,
        PortraitUncanny,
        PortraitFantastic,
        StandardSmall,
        StandardMedium,
        StandardLarge,
        StandardXlarge,
        StandardFantastic,
        StandardAmazing,
        LandscapeSmall,
        LandscapeMedium,
        LandscapeLarge,
        LandscapeXlarge,
        LandscapeAmazing,
        LandscapeIncredible,
        Detail,
        FullSize
    }

    //</editor-fold>


    //<editor-fold desc="Constructors">

    public MarvelCharacter(int marvelId, String name, String imageBasePath) {
        _marvelId = marvelId;
        _name = name;
        _imageBasePath = imageBasePath;

        if (_imageBasePath != null) {
            try {
//                GetImage(ImageSize.PortraitXlarge);
//                GetImage(ImageSize.Detail);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
            }
        }
    }

    //</editor-fold>


    //<editor-fold desc="Variables">

    private int _marvelId;
    private String _name;
    private String _imageBasePath;
    private String _imageExtension = "jpg";

    private Bitmap _image_portrait_small = null;
    private Bitmap _image_portrait_medium = null;
    private Bitmap _image_portrait_xlarge = null;
    private Bitmap _image_portrait_uncanny = null;
    private Bitmap _image_portrait_incredible = null;
    private Bitmap _image_portrait_fantastic = null;

    private Bitmap _image_standard_small = null;
    private Bitmap _image_standard_medium = null;
    private Bitmap _image_standard_large = null;
    private Bitmap _image_standard_xlarge = null;
    private Bitmap _image_standard_fantastic = null;
    private Bitmap _image_standard_amazing = null;

    private Bitmap _image_landscape_small = null;
    private Bitmap _image_landscape_medium = null;
    private Bitmap _image_landscape_large = null;
    private Bitmap _image_landscape_xlarge = null;
    private Bitmap _image_landscape_amazing = null;
    private Bitmap _image_landscape_incredible = null;

    private Bitmap _image_detail = null;
    private Bitmap _image_fullSize = null;

    private String _resourceUri;
    //private int _parcelData;

    //</editor-fold>


    //<editor-fold desc="Properties">

    //<editor-fold desc="Marvel Id">
    public int GetMarvelId() {
        return _marvelId;
    }

    public void SetMarvelId(int value) {
        _marvelId = value;
    }

    //</editor-fold>
    //<editor-fold desc="Name">
    public String GetName() {
        return _name;
    }

    public void SetName(String value) {
        _name = value;
    }

    //</editor-fold>
    //<editor-fold desc="Image Base Path">
    public String GetImageBasePath() {
        return _imageBasePath;
    }

    public void SetImageBasePath(String value) {
        _imageBasePath = value;

    }

    //</editor-fold>
    //<editor-fold desc="Image Extension">
    public String GetImageExtension() {
        return _imageExtension;
    }

    public void SetImageExtension(String value) {
        _imageExtension = value;
    }

    //</editor-fold>
    //<editor-fold desc="Image URL">
    public String GetUrlForImage(ImageSize imageSize) {

        String path;

        switch (imageSize) {
            case PortraitXlarge:
                path = "/portrait_xlarge.";
                break;

            case Detail:
                path = "/detail.";
                break;

            default: //default will be the fullsize image
                path = ".";

        }

        return _imageBasePath + path + _imageExtension;
    }

    //</editor-fold>
    //<editor-fold desc="Xlarge Image">
//    private Bitmap GetImage_xlarge() throws Exception {
//        Log.i("Info", "Getting " + _name + " image: Size: xlarge");
//
//        if (_image_portrait_xlarge == null) {
//            if (_imageBasePath == null) {
//                Log.e("Error", "Image base path is not set");
//                throw new Exception("You must set the image base path before getting any images");
//            }
//
//            try {
//                //new DownloadImageTask(_image_portrait_xlarge, PortraitXlarge).execute(GetUrlForImage(PortraitXlarge));
//            } catch (Exception e) {
//                Log.e("Error", e.getMessage());
//            }
//        }
//
//        return _image_portrait_xlarge;
//    }

    private void SetImage_xlarge(Bitmap value) {
        _image_portrait_xlarge = value;
    }

    //</editor-fold>
    //<editor-fold desc="Detail Image">
//    private Bitmap GetImage_detail() throws Exception {
//        Log.i("Info", "Getting " + _name + " image: Size: detail");
//
//        if (_image_detail == null) {
//            if (_imageBasePath == null) {
//                Log.e("Error", "Image base path is not set");
//                throw new Exception("You must set the image base path before getting any images");
//            }
//
//            try {
//                new DownloadImageTask(_image_detail, Detail).execute(GetUrlForImage(Detail));
//            } catch (Exception e) {
//                Log.e("Error", e.getMessage());
//            }
//        }
//
//        return _image_detail;
//    }

    private void SetImage_detail(Bitmap value) {
        _image_detail = value;
    }

    //</editor-fold>
    //<editor-fold desc="Resource URI">
    public String GetResourceUri() {
        return _resourceUri;
    }

    public void SetResourceUri(String value) {
        _resourceUri = value;
    }
    //</editor-fold>

//</editor-fold>


    //<editor-fold desc="Methods">

    private void StoreImage(Bitmap image, ImageSize imageSize) {
        File pictureFile = getOutputMediaFile(imageSize);
        if (pictureFile == null) {
            Log.d("storeImage", "Error creating media file. Check storage permission:");
            return;
        }

        try {
            FileOutputStream fos = new FileOutputStream(pictureFile);

            image.compress(Bitmap.CompressFormat.PNG, 90, fos);
            fos.close();
        } catch (FileNotFoundException e) {
            Log.d("File not found", "File not found: " + e.getMessage());
        } catch (IOException e) {
            Log.d("IO Exception", "Error accessing file: " + e.getMessage());
        }
    }

    private File getOutputMediaFile(ImageSize imageSize) {
        File mediaStorageDir = new File(Environment.getExternalStorageDirectory() + "/Android/data/" + ComicBookChecklist_Application.getContext().getPackageName() + "/Files");

        if (!mediaStorageDir.exists()) {
            if (!mediaStorageDir.mkdirs()) {
                Log.e("Directory creation", "Could not create directory for images");
                return null;
            }
        }

        File mediaFile;
        String imageName = "MarvelCharacter_" + _marvelId + "_" + imageSize + "." + _imageExtension;
        mediaFile = new File(mediaStorageDir.getPath() + File.separator + imageName);
        return mediaFile;
    }

    public Bitmap GetImage(ImageSize imageSize) throws Exception {
        Log.i("Info", "Getting " + _name + " image: Size: " + imageSize);
        if (_imageBasePath == null) {
            Log.e("Error", "Image base path is not set");
            throw new Exception("You must set the image base path before getting any images");
        }

        Bitmap image = null;

        try {
            switch (imageSize) {
                case PortraitXlarge:
                    new DownloadImageTask(_image_portrait_xlarge, imageSize).execute(GetUrlForImage(imageSize));
                    image = _image_portrait_xlarge;
                    break;

                case Detail:
                    new DownloadImageTask(_image_detail, imageSize).execute(GetUrlForImage(imageSize));
                    image = _image_detail;
                    break;

                case FullSize:
                    new DownloadImageTask(_image_fullSize, imageSize).execute(GetUrlForImage(imageSize));
                    image = _image_fullSize;
                    break;

            }
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
        }

        return image;
    }

    //</editor-fold>




    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        Bitmap _bitmap;
        ImageSize _imageSize;

        public DownloadImageTask(Bitmap bitmap, ImageSize imageSize) {
            _bitmap = bitmap;
            _imageSize = imageSize;
        }

        protected Bitmap doInBackground(String... urls) {
            String url = urls[0];
            Bitmap bitmap = null;
            try {
                InputStream in = new java.net.URL(url).openStream();
                bitmap = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
            }
            return bitmap;
        }

        protected void onPostExecute(Bitmap result) {

            try {
                StoreImage(result, _imageSize);
            } catch (Exception e) {
                Log.e("Store Image Error", _name + ": " + e.getMessage());
            }

            //TODO: this seems hokey to me. How can I make this better?
            switch (_imageSize) {
                case PortraitXlarge:
                    _bitmap = result;
                    _image_portrait_xlarge = result;
                    break;
                case Detail:
                    _image_detail = result;
                    break;
                case FullSize:
                    _image_fullSize = result;
                    break;
            }

        }
    }
}
