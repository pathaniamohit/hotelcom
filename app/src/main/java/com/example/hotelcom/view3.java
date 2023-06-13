package com.example.hotelcom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class view3 extends AppCompatActivity {
    Button booknow;
    EditText noOfCustomer, noOfNights;
    int Customer,Nights;
    int cost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view3);
        booknow = findViewById(R.id.button3);
        noOfCustomer=findViewById(R.id.editTextText2);
        noOfNights=findViewById(R.id.editTextText3);
        Customer = Integer.parseInt(noOfCustomer.getText().toString());
        Nights = Integer.parseInt(noOfNights.getText().toString());


        booknow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view3.this , booking.class);
                startActivity(i);
            }
        });
    }
}