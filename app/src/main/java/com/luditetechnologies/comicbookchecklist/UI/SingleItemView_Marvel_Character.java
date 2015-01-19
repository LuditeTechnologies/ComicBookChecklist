package com.luditetechnologies.comicbookchecklist.UI;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.luditetechnologies.comicbookchecklist.core.ImageLoader;
import com.luditetechnologies.comicbookchecklist.R;

public class SingleItemView_Marvel_Character extends Activity {

    String name;
    Image coverImage;

    ImageLoader imageLoader = new ImageLoader(this);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singleitemview_marvel_character);

        Intent i = getIntent();
        name = i.getStringExtra("name");

        TextView txtName = (TextView) findViewById(R.id.nameValue);
        ImageView imgCover = (ImageView) findViewById(R.id.coverImage);

        txtName.setText(name);

    }
}