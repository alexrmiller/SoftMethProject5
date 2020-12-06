package com.example.meuseumtickets;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private ImageView MuseumPhoto;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        MuseumPhoto = (ImageView) findViewById(R.id.MuseumPhoto);
        MuseumPhoto.setImageResource(getIntent().getIntExtra(MainActivity.IMAGE, R.drawable.spy_museum));

    }

}