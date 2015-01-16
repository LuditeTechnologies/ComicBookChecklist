package com.luditetechnologies.comicbookchecklist.UI;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.luditetechnologies.comicbookchecklist.core.ImageLoader;
import com.luditetechnologies.comicbookchecklist.R;

public class SingleItemView extends Activity {

    String title;
    String publisher;

    //ImageLoader imageLoader = new ImageLoader(this);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singleitemview);

        Intent i = getIntent();
        title = i.getStringExtra("title");
        publisher = i.getStringExtra("publisher");

        TextView txtTitle = (TextView) findViewById(R.id.titleValue);
        TextView txtPublisher = (TextView) findViewById(R.id.publisherValue);

        txtTitle.setText(title);
        txtPublisher.setText(publisher);

    }
}
