/*
Authors: Alex Miller, Maudiel Romero
 */
package com.example.meuseumtickets;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    public static String IMAGE;
    public static String NAME;
    public static String IMGLINK;
    private Button guggenheim;
    private Button met;
    private Button momaID;
    private Button whitney;

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
        IMGLINK="https://www.guggenheim.org/";
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(NAME, getResources().getString(R.string.Gug_name));
        intent.putExtra(IMAGE, R.drawable.guggenheim);
        startActivity(intent);
    }

    private void openAfricanHistoryActivity() {
        IMAGE = "MuseumImage";
        IMGLINK="https://www.metmuseum.org/visit/plan-your-visit/met-cloisters";
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(NAME, getResources().getString(R.string.Met_name));
        intent.putExtra(IMAGE, R.drawable.met);
        startActivity(intent);
    }

    private void openPortraitActivity() {
        IMAGE = "MuseumImage";
        IMGLINK="https://www.moma.org/";
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(NAME, getResources().getString(R.string.MoMA_name));
        intent.putExtra(IMAGE, R.drawable.moma);
        startActivity(intent);
    }

    public void openSpyActivity() {
        IMAGE = "MuseumImage";
        IMGLINK="https://whitney.org/";
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(NAME, getResources().getString(R.string.Whitney_name));
        intent.putExtra(IMAGE, R.drawable.whitney);
        startActivity(intent);

    }



}