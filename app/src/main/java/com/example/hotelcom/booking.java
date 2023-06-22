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

    ImageButton home, user;
    Button pay;
    EditText showAmount;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        home = findViewById(R.id.imageButton14);
        user =findViewById(R.id.imageButton15);
        pay = findViewById(R.id.button3);
        showAmount = findViewById(R.id.editTextText);
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
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(booking.this, "Payment Accepted", Toast.LENGTH_LONG).show();
            }
        });
    }
}