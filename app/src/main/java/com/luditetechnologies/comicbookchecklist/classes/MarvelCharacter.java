package com.luditetechnologies.comicbookchecklist.classes;

public class MarvelCharacter {

    public MarvelCharacter(String name, String thumbnailPath){
        _name = name;
        _thumbnailPath=thumbnailPath;
    }

    private String _name;
    public String GetName(){return _name;}
    public void SetName(String name){_name = name; }

    private String _thumbnailPath;
    public String GetThumbnailPath(){return _thumbnailPath;}
    public void SetThumbnailPath(String thumbnailPath){_thumbnailPath = thumbnailPath; }

    private String _thumbnailExtension;
    public String GetThumbnailExtension(){return _thumbnailExtension;}
    public void SetThumbnailExtension(String thumbnailExtension){_thumbnailExtension = thumbnailExtension; }

}
