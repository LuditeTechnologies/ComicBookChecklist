package com.luditetechnologies.comicbookchecklist.classes;

/**
 * Created by arichardson on 1/9/2015.
 */
public class Publisher {

    public Publisher(){}
    public Publisher(String id){
        _id = id;
    }

    private String _id;
    public String get_id() {return _id; }
    public void set_id(String id) { _id = id;}

    private String _name;
    public String get_name() {return _name; }
    public void set_name(String name) { _name = name;}
}
