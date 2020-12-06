package com.example.meuseumtickets;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private ImageView MuseumImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        MuseumImage= (ImageView) findViewById(R.id.MuseumImage);
        MuseumImage.setImageResource(getIntent().getIntExtra(MainActivity.IMAGE, 0));



        Spinner spinner1 = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.mySpinner, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(this);
        Spinner spinner2 = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.mySpinner2, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);
        spinner2.setOnItemSelectedListener(this);
        Spinner spinner3 = findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.mySpinner3, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter);
        spinner3.setOnItemSelectedListener(this);
    }

    public void getWebsite(View view) {
        //second screen navigator
        String url = (String)view.getTag();
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse(url));

        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    public void CalculateTotal(View view) {
        DecimalFormat df = new DecimalFormat("##.##");

        Spinner sp1 = findViewById(R.id.spinner1);
        Spinner sp2 = findViewById(R.id.spinner2);
        Spinner sp3 = findViewById(R.id.spinner3);
        int AmountOfTickets = Integer.parseInt(sp1.getSelectedItem().toString()) + Integer.parseInt(sp2.getSelectedItem().toString()) + Integer.parseInt(sp3.getSelectedItem().toString());
        if (AmountOfTickets > 5) {
            Toast.makeText(this, R.string.too_many_tickets, Toast.LENGTH_SHORT).show();
        } else {
            int ticketPrice = (Integer.parseInt(sp1.getSelectedItem().toString()) * 5) + (Integer.parseInt(sp2.getSelectedItem().toString()) * 10) + (Integer.parseInt(sp3.getSelectedItem().toString()) * 5);

            TextView TicketPriceText = findViewById(R.id.ticketPrice);
            TicketPriceText.setText("Ticket Price: \t $" + ticketPrice);

            double salesTax = ticketPrice * .08875;
            TextView SalesTaxText = findViewById(R.id.salesTax);
            SalesTaxText.setText("Sales Tax: \t $" + df.format(salesTax));

            double totalPrice = salesTax + ticketPrice;
            TextView TotalPriceText = findViewById(R.id.totalPrice);
            TotalPriceText.setText("Total Price: \t $" + df.format(totalPrice));
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}