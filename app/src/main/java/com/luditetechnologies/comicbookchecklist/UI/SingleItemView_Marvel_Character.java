package com.luditetechnologies.comicbookchecklist.UI;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.luditetechnologies.comicbookchecklist.R;

public class SingleItemView_Marvel_Character extends Activity {

    private String _characterName;
    private Bitmap _characterImage;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singleitemview_marvel_character);

        Intent i = getIntent();
        _characterName = i.getStringExtra("name");
        _characterImage = i.getParcelableExtra("characterImage");

        TextView txtName = (TextView) findViewById(R.id.nameValue);
        ImageView thumbNail = (ImageView) findViewById(R.id.image);

        try {
            txtName.setText(_characterName);
            thumbNail.setImageBitmap(_characterImage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}