package com.luditetechnologies.comicbookchecklist.UI;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.luditetechnologies.comicbookchecklist.core.ImageLoader;
import com.luditetechnologies.comicbookchecklist.R;

public class SingleItemView_Marvel_Character extends Activity {

    String _name;
    String _imagePath;

    ImageLoader imageLoader = new ImageLoader(this);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singleitemview_marvel_character);

        Intent i = getIntent();
        _name = i.getStringExtra("name");
        _imagePath = i.getStringExtra("imagePath");

        TextView txtName = (TextView) findViewById(R.id.nameValue);
        ImageView thumbNail = (ImageView) findViewById(R.id.thumbNail);

        txtName.setText(_name);

        //try {
            if (_imagePath != "" || _imagePath != null) {
                imageLoader.DisplayImage(_imagePath, thumbNail);
            }
//        } catch (Exception e) {
//            Log.e("Error loading character thumbnail", e.getMessage());
//        }
    }
}