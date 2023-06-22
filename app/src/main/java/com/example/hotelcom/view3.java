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
    EditText user;
    int Customer,Nights;
    int guess;
    public static final String ARG_FROM_MAIN = "arg2";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view3);
        booknow = findViewById(R.id.button3);
        noOfCustomer=findViewById(R.id.editTextText2);
        noOfNights=findViewById(R.id.editTextText3);
        user = findViewById(R.id.editTextText4);
        String passedArg = getIntent().getExtras().getString("arg2");
        user.setText(passedArg);
        booknow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view3.this , booking.class);
                i.putExtra("arg", getCost());
                startActivity(i);
            }
        });
    }
    public  int getCost(){
        Customer = Integer.parseInt(noOfCustomer.getText().toString());
        Nights = Integer.parseInt(noOfNights.getText().toString());
        guess=Nights*Customer*100;
        return guess;
    }
}