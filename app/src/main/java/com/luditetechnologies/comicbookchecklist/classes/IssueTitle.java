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

    private String _title;

    public String GetTitle() {
        return _title;
    }

    public void SetTitle(String title) {
        _title = title;
    }

    private Publisher _publisher;

    public Publisher GetPublisher() {
        return _publisher;
    }

    public void SetPublisher(Publisher publisher) {
        _publisher = publisher;
    }

    //</editor-fold>
}
