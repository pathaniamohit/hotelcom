package com.example.hotelcom;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class view3 extends AppCompatActivity {
    Button booknow;
    EditText noOfCustomer, noOfNights;
    int Customer,Nights;
    int guess;
    ImageButton user;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view3);
        booknow = findViewById(R.id.button3);
        user  = findViewById(R.id.imageButton14);
        noOfCustomer=findViewById(R.id.editTextText2);
        noOfNights=findViewById(R.id.editTextText3);
        Customer = Integer.parseInt(noOfCustomer.getText().toString());
        Nights = Integer.parseInt(noOfNights.getText().toString());
        guess=Nights*Customer;
        booknow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view3.this , booking.class);
                startActivity(i);
            }
        });
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(view3.this, "Payment Accepted", Toast.LENGTH_LONG).show();
            }
        });
    }
}