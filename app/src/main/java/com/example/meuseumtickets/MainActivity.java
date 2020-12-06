package com.example.meuseumtickets;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    public static String IMAGE;
    private Button guggenheim;
    private Button met;
    private Button momaID;
    private Button whitney;
    //public static final String IMAGE_natural = " https://naturalhistory.si.edu/ ";
   // public static final String IMAGE_portrait = " https://naturalhistory.si.edu/ ";
    //public static final String IMAGE_AfricanAmericanHistory = " african_american_and_culture";
    //public static final String IMAGE_spy = "spy_museum";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        guggenheim = (Button) findViewById(R.id.guggenheim);
        guggenheim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNaturalActivity();}});
        met = (Button) findViewById(R.id.met);
        met.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openAfricanHistoryActivity();}});
        momaID = (Button) findViewById(R.id.momaID);
        momaID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openPortraitActivity();}});
        whitney = (Button) findViewById(R.id.whitney);
        whitney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openSpyActivity();}});

    }

    private void openNaturalActivity() {
        IMAGE = "MuseumImage";
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(IMAGE, R.drawable.guggenheim);
        startActivity(intent);
    }

    private void openAfricanHistoryActivity() {
        IMAGE = "MuseumImage";
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(IMAGE, R.drawable.met);
        startActivity(intent);
    }

    private void openPortraitActivity() {
        IMAGE = "MuseumImage";
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(IMAGE, R.drawable.moma);
        startActivity(intent);
    }

    public void openSpyActivity() {
        IMAGE = "MuseumImage";
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(IMAGE, R.drawable.whitney);
        startActivity(intent);

    }



}