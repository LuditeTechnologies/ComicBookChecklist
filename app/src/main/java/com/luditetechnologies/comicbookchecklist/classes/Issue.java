package com.luditetechnologies.comicbookchecklist.classes;

import android.media.Image;

/**
 * Created by arichardson on 1/9/2015.
 */
public class Issue {

    public Issue() { }

    public Issue(String title, String issueNumber, int issueMonth, int issueYear) {
        _title = title;
        _issueNumber = issueNumber;
        _issueMonth = issueMonth;
        _issueYear = issueYear;
    }

    //<editor-fold desc="Properties">

    private String _title;
    public String GetTitle() { return _title;}
    public void SetTitle(String title) { _title = title; }

    private String _issueNumber; //NOTE: this cannot be int since some issue numbers have letters in them
    public String GetIssueNumber() {return _issueNumber;}
    public void SetIssueNumber(String issueNumber) { _issueNumber = issueNumber;}

    private int _issueMonth;
    public int get_issueMonth() { return _issueMonth;}
    public void set_issueMonth(int issueMonth) { _issueMonth = issueMonth;}

    private int _issueYear;
    public int get_issueYear() { return _issueYear; }
    public void set_issueYear(int issueYear) { _issueYear = issueYear;}

    private Image _coverImage;
    public Image GetCover() {return _coverImage;}
    public void SetCover(Image coverImage) { _coverImage = coverImage; }

    //</editor-fold>
}
