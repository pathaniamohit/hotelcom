package com.example.hotelcom;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class booking extends AppCompatActivity {

    ImageButton home;
    Button pay;
    EditText user;
    EditText showAmount;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        home = findViewById(R.id.imageButton14);
        pay = findViewById(R.id.button3);
        showAmount = findViewById(R.id.editTextText);
        user = findViewById(R.id.editTextText4);
        String passedArg = getIntent().getExtras().getString("arg");
        user.setText(passedArg);
        int cost = Integer.parseInt(getIntent().getExtras().getString("arg2"));
        showAmount.setText(cost);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(booking.this, "Payment Accepted", Toast.LENGTH_LONG).show();
                Intent i = new Intent(booking.this , view2.class);
                startActivity(i);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(booking.this , view2.class);
                startActivity(i);
            }
        });
    }
}