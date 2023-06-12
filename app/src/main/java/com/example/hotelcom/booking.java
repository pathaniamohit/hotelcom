package com.example.hotelcom;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class booking extends AppCompatActivity {

    TextView home, user;
    Button pay;
    EditText showAmount;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        home = findViewById(R.id.Home);
        user = findViewById(R.id.User);
        pay = findViewById(R.id.pay);
        showAmount = findViewById(R.id.editTextText);

        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(booking.this, "Payment Accepted", Toast.LENGTH_LONG).show();
                Intent i = new Intent(booking.this , MainActivity.class);
                startActivity(i);
            }
        });
    }
}