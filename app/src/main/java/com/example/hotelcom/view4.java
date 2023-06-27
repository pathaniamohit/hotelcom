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

public class view4 extends AppCompatActivity {
    Button booknow;
    EditText noOfCustomer, noOfNights;
    TextView user;
    public static final String ARG_FROM_MAIN1 = "arg2";
    public static final String ARG_FROM_MAIN = "arg";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view4);
        booknow = findViewById(R.id.button3);
        noOfCustomer = findViewById(R.id.editTextText2);
        noOfNights = findViewById(R.id.editTextText3);
        user = findViewById(R.id.editTextText4);
        String passedArg = null;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            passedArg = extras.getString("arg");
        }
        if (passedArg != null) {
            user.setText(passedArg);
        }
        booknow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (noOfCustomer.getText().toString().equals("") || noOfNights.getText().toString().equals("")) {
                    Toast.makeText(view4.this, "Fill Required Details!", Toast.LENGTH_LONG).show();
                } else {
                    Intent ind = new Intent(view4.this, booking.class);
                    ind.putExtra(ARG_FROM_MAIN, user.getText().toString());
                    ind.putExtra(ARG_FROM_MAIN1, getCost());
                    startActivity(ind);
                }
            }
        });
    }

    public double getCost() {
        double customer = Double.parseDouble(noOfCustomer.getText().toString());
        double nights = Double.parseDouble(noOfNights.getText().toString());
        return nights * customer * 75.0;
    }

}