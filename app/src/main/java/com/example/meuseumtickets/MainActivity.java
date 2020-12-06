package com.example.meuseumtickets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button natural;
    private Button AfricanHistory;
    private Button portrait;
    private Button spy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        natural = (Button) findViewById(R.id.natural);
        natural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openOnNaturalHistory();}});
        AfricanHistory = (Button) findViewById(R.id.AfricanHistory);
        AfricanHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openOnAfricanHistory();}});
        portrait = (Button) findViewById(R.id.portrait);
        portrait.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openOnPortrait();}});
        spy = (Button) findViewById(R.id.spy);
        spy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openOnSpy();}});
    }

    public void openOnNaturalHistory() {
        Intent intent = new Intent(this, NaturalHistory.class);
        startActivity(intent);
    }
    public void openOnAfricanHistory() {
        Intent intent = new Intent(this, AfricanAmericanHistory.class);
        startActivity(intent);
    }
    public void openOnPortrait() {
        Intent intent = new Intent(this, NationalProtraitGaller.class);
        startActivity(intent);
    }
    public void openOnSpy() {
        Intent intent = new Intent(this, SpyMuseum.class);
        startActivity(intent);
    }


}