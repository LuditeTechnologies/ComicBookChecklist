package com.luditetechnologies.comicbookchecklist.UI;

import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.luditetechnologies.comicbookchecklist.R;


public class Dashboard extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        DisableButtons();

        SetupButtonClicks();

    }

    private void DisableButtons() {
        Button uploadPublishers = (Button) findViewById(R.id.btnUploadPublishers);
        Button uploadTitles = (Button) findViewById(R.id.btnUploadTitles);

        uploadPublishers.setEnabled(false);
        uploadTitles.setEnabled(false);
    }

    private void SetupButtonClicks() {

        Button uploadPublishers = (Button) findViewById(R.id.btnUploadPublishers);
        uploadPublishers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent uploadPublishersIntent = new Intent(Dashboard.this, AddPublishersActivity.class);
                    startActivity(uploadPublishersIntent);
                } catch (Exception e) {
                    Vibrator vibratorDildo = (Vibrator) getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                    vibratorDildo.vibrate(1000);

                    Toast.makeText(getApplicationContext(), "Uploading Publishers failed!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });

        Button testPublishers = (Button) findViewById(R.id.btnTestPublishersGet);
        testPublishers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent testPublishersIntent = new Intent(Dashboard.this, PublisherTest.class);
                    startActivity(testPublishersIntent);
                } catch (Exception e) {
                    Vibrator vibratorDildo = (Vibrator) getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                    vibratorDildo.vibrate(1000);

                    Toast.makeText(getApplicationContext(), "Testing Publishers failed!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });

        Button uploadTitles = (Button) findViewById(R.id.btnUploadTitles);
        uploadTitles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent uploadTitlesIntent = new Intent(Dashboard.this, AddTitlesActivity.class);
                    startActivity(uploadTitlesIntent);
                } catch (Exception e) {
                    Vibrator vibratorDildo = (Vibrator) getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                    vibratorDildo.vibrate(1000);

                    Toast.makeText(getApplicationContext(), "Uploading Titles failed!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });

        Button testTitles = (Button) findViewById(R.id.btnTestTitlesGetAll);
        testTitles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent testTitlesIntent = new Intent(Dashboard.this, TitleTest.class);
                    startActivity(testTitlesIntent);
                } catch (Exception e) {
                    Vibrator vibratorDildo = (Vibrator) getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                    vibratorDildo.vibrate(1000);

                    Toast.makeText(getApplicationContext(), "Testing Titles failed!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });

        Button testGetBatmanTitles = (Button) findViewById(R.id.btnTestTitlesGetBatman);
        testGetBatmanTitles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent testBatmanTitlesIntent = new Intent(Dashboard.this, TitleTestBatman.class);
                    startActivity(testBatmanTitlesIntent);
                } catch (Exception e) {
                    Vibrator vibratorDildo = (Vibrator) getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                    vibratorDildo.vibrate(1000);

                    Toast.makeText(getApplicationContext(), "Testing Batman Titles failed!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });

        Button testGetSpidermanTitles = (Button) findViewById(R.id.btnTestTitlesGetSpiderman);
        testGetSpidermanTitles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent testSpidermanTitlesIntent = new Intent(Dashboard.this, TitleTestSpiderman.class);
                    startActivity(testSpidermanTitlesIntent);
                } catch (Exception e) {
                    Vibrator vibratorDildo = (Vibrator) getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                    vibratorDildo.vibrate(1000);

                    Toast.makeText(getApplicationContext(), "Testing Spiderman Titles failed!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });

        Button testGetAnyTitles = (Button) findViewById(R.id.btnTestTitlesGetAny);
        testGetAnyTitles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent testAnyTitlesIntent = new Intent(Dashboard.this, TitleTestAny.class);
                    startActivity(testAnyTitlesIntent);
                } catch (Exception e) {
                    Vibrator vibratorDildo = (Vibrator) getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                    vibratorDildo.vibrate(1000);

                    Toast.makeText(getApplicationContext(), "Testing Any Titles failed!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });

        Button testMarvel = (Button) findViewById(R.id.btnTestMarvel);
        testMarvel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent testMarvel = new Intent(Dashboard.this, activity_marvel_test.class);
                    startActivity(testMarvel);
                } catch (Exception e) {
                    Vibrator vibratorDildo = (Vibrator) getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                    vibratorDildo.vibrate(1000);

                    Toast.makeText(getApplicationContext(), "Testing Marvel failed!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
