package com.luditetechnologies.comicbookchecklist.classes;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;

import com.luditetechnologies.comicbookchecklist.core.ComicBookChecklist_Application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

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
                GetImage(ImageSize.PortraitXlarge);
                GetImage(ImageSize.Detail);
            } catch (Exception e) {
                Log.e("Constructor Error", e.getMessage());
            }
        }
    }

    //</editor-fold>


    //<editor-fold desc="Variables">

    private int _marvelId;
    private String _name;
    private String _imageBasePath;
    private String _imageExtension = "jpg";
    private String _description;

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

    public final static String _fullImageDirectoryPath = Environment.getExternalStorageDirectory() + "/Android/data/" + ComicBookChecklist_Application.getContext().getPackageName() + "/Files";

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
    //<editor-fold desc="Description">
    public String GetDescription() {
        return _description;
    }

    public void SetDescription(String value) {
        _description = value;
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
            Log.e("storeImage", "Error creating media file. Check storage permission:");
            return;
        }

        try {
            FileOutputStream fos = new FileOutputStream(pictureFile);

            image.compress(Bitmap.CompressFormat.PNG, 90, fos);
            fos.close();
        } catch (FileNotFoundException e) {
            Log.e("File not found", "File not found: " + e.getMessage());
        } catch (IOException e) {
            Log.e("IO Exception", "Error accessing file: " + e.getMessage());
        }
    }

    private File getOutputMediaFile(ImageSize imageSize) {
        File mediaStorageDir = new File(_fullImageDirectoryPath);

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

    public Bitmap GetImageFromDevice(String filename) {

        Bitmap thumbnail = null;

        try {
            Log.i("GetImageFromDevice() A: ",_fullImageDirectoryPath + "/" + filename);
            thumbnail = BitmapFactory.decodeFile(_fullImageDirectoryPath + "/" + filename);
        } catch (Exception e) {
            Log.e("GetImageFromDevice() on external storage", e.getMessage());
        }

        if (thumbnail == null) {
            try {
                Log.i("GetImageFromDevice() B: ", ComicBookChecklist_Application.getContext().getFileStreamPath(filename).toString());
                File filePath = ComicBookChecklist_Application.getContext().getFileStreamPath(filename);
                FileInputStream fi = new FileInputStream(filePath);
                thumbnail = BitmapFactory.decodeStream(fi);
            } catch (Exception ex) {
                Log.e("GetImageFromDevice()", ex.getMessage());
            }
        }
        return thumbnail;
    }

    public Bitmap GetImage(ImageSize imageSize) throws Exception {
        //try to get the image from the device first
        Bitmap image = GetImageFromDevice("MarvelCharacter_" + _marvelId + "_" + imageSize + "." + _imageExtension);

        //if the image wasn't found, download it to the device
        if (image == null) {
            Log.i("Character image not on device", "Starting download for " + _name + ", image size " + imageSize);

            if (_imageBasePath == null) {
                Log.e("Error", "Image base path is not set");
                throw new Exception("You must set the image base path before getting any images");
            }

            try {
                new DownloadImageTask(imageSize).execute(GetUrlForImage(imageSize));

                switch (imageSize) {
                    case PortraitXlarge:
                        image = _image_portrait_xlarge;
                        break;

                    case Detail:
                        image = _image_detail;
                        break;

                    case FullSize:
                        image = _image_fullSize;
                        break;
                }
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
            }
        }

        return image;
    }

    //</editor-fold>


    //<editor-fold desc="Classes">

    private  class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageSize _imageSize;

        public DownloadImageTask(ImageSize imageSize) {
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

    //</editor-fold>

}