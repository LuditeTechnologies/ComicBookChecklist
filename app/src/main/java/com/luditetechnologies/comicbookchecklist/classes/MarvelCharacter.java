package com.luditetechnologies.comicbookchecklist.classes;

import android.media.Image;

public class MarvelCharacter {

    public MarvelCharacter(int marvelId, String resourceUri, String name){
        _marvelId = marvelId;
        _resourceUri = resourceUri;
        _name = name;
    }

    private int _marvelId;
    public int GetMarvelId(){return _marvelId;}
    public void SetMarvelId(int value){_marvelId = value; }

    private String _name;
    public String GetName(){return _name;}
    public void SetName(String value){_name = value; }

    private String _thumbnailPath;
    public String GetThumbnailPath(){return _thumbnailPath;}
    public void SetThumbnailPath(String value){ _thumbnailPath = value;}

    private Image _thumbnail;
    public Image GetThumbnail(){return _thumbnail;}
    public void SetThumbnail(Image value){_thumbnail=value;}

    private String _thumbnailExtension;
    public String GetThumbnailExtension(){return _thumbnailExtension;}
    public void SetThumbnailExtension(String value){_thumbnailExtension = value; }

    private String _resourceUri;
    public String GetResourceUri(){return _resourceUri;}
    public void SetResourceUri(String value){_resourceUri = value; }

}
