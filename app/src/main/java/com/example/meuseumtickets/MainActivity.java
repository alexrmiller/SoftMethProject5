package com.example.meuseumtickets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    public static String IMAGE;
    private Button natural;
    private Button AfricanHistory;
    private Button portrait;
    private Button spy;
    //public static final String IMAGE_natural = " https://naturalhistory.si.edu/ ";
   // public static final String IMAGE_portrait = " https://naturalhistory.si.edu/ ";
    public static final String IMAGE_AfricanAmericanHistory = " african_american_and_culture";
    public static final String IMAGE_spy = "spy_museum";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        natural = (Button) findViewById(R.id.natural);
        natural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNaturalActivity();}});
        AfricanHistory = (Button) findViewById(R.id.AfricanHistory);
        AfricanHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openAfricanHistoryActivity();}});
        portrait = (Button) findViewById(R.id.portrait);
        portrait.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openPortraitActivity();}});
        spy = (Button) findViewById(R.id.spy);
        spy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openSpyActivity();}});

    }

    private void openNaturalActivity() {
        IMAGE = " spy_museum";
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(IMAGE, R.drawable.spy_museum);
        startActivity(intent);
    }

    private void openAfricanHistoryActivity() {
        IMAGE = "african_american_and_culture";
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(IMAGE, R.drawable.spy_museum);
        startActivity(intent);
    }

    private void openPortraitActivity() {
        IMAGE = "african_american_and_culture";
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(IMAGE, R.drawable.spy_museum);
        startActivity(intent);
    }


    public void openSpyActivity() {
        IMAGE = IMAGE_spy;
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(IMAGE, R.drawable.spy_museum);
        startActivity(intent);

    }



}