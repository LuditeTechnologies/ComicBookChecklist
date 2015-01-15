package com.luditetechnologies.comicbookchecklist.UI;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.luditetechnologies.comicbookchecklist.core.ImageLoader;
import com.luditetechnologies.comicbookchecklist.R;

public class SingleItemView extends Activity {
    // Declare Variables
    String title;
    //String publisher;
    //String population;
    //String flag;
    //String position;
    ImageLoader imageLoader = new ImageLoader(this);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from singleitemview.xml
        setContentView(R.layout.singleitemview);

        Intent i = getIntent();
        // Get the result of rank
        title = i.getStringExtra("name");
        // Get the result of country
        //country = i.getStringExtra("country");
        // Get the result of population
        //population = i.getStringExtra("population");
        // Get the result of flag
        //flag = i.getStringExtra("flag");

        // Locate the TextViews in singleitemview.xml
        TextView txtTitle = (TextView) findViewById(R.id.titleValue);
        //TextView txtPublisher = (TextView) findViewById(R.id.publisher);

        // Locate the ImageView in singleitemview.xml
        //ImageView imgflag = (ImageView) findViewById(R.id.flag); TODO: this is causing the app to crash!
        // TODO: also, uncomment this line below: imageLoader.DisplayImage(flag, imgflag)

        // Set results to the TextViews
        txtTitle.setText(title);
        //txtPublisher.setText(country);

        // Capture position and set results to the ImageView
        // Passes flag images URL into ImageLoader.class
        //imageLoader.DisplayImage(flag, imgflag); TODO: uncomment this after the other TODO is taken care of
    }
}
