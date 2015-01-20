package com.luditetechnologies.comicbookchecklist.classes;

public class MarvelCharacter {

    public MarvelCharacter(int marvelId, String resourceUri, String name){//
        _marvelId = marvelId;
        _resourceUri = resourceUri;
        _name = name;
    }

    private int _marvelId;
    public int GetMarvelId(){return _marvelId;}
    public void SetMarvelId(int marvelId){_marvelId = marvelId; }

    private String _name;
    public String GetName(){return _name;}
    public void SetName(String name){_name = name; }

    private String _thumbnailPath;
    public String GetThumbnailPath(){return _thumbnailPath;}
    public void SetThumbnailPath(String thumbnailPath){_thumbnailPath = thumbnailPath; }

    private String _thumbnailExtension;
    public String GetThumbnailExtension(){return _thumbnailExtension;}
    public void SetThumbnailExtension(String thumbnailExtension){_thumbnailExtension = thumbnailExtension; }

    private String _resourceUri;
    public String GetResourceUri(){return _resourceUri;}
    public void SetResourceUri(String resourceUri){_resourceUri = resourceUri; }


    //resourceURI
}
