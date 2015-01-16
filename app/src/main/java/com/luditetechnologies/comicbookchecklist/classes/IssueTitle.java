package com.luditetechnologies.comicbookchecklist.classes;


public class IssueTitle {

    public IssueTitle() {
    }

    public IssueTitle(String id, String title) {
        _id = id;
        _title = title;
    }

    //<editor-fold desc="Properties">

    private String _id;

    public String GetId() {
        return _id;
    }

    public void SetId(String id) {
        _id = id;
    }

    private String _title = "Title not set";

    public String GetTitle() {
        return _title;
    }

    public void SetTitle(String title) {
        _title = title;
    }

    private String _publisherName = "Publisher name not set";

    public String GetPublisher() {
        return _publisherName;
    }

    public void SetPublisher(String publisherName) {
        _publisherName = publisherName;
    }

    //</editor-fold>
}
