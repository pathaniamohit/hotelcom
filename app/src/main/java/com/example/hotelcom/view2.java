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

public class view2 extends AppCompatActivity {
    public static final String ARG_FROM_MAIN = "arg";
    ImageButton more1, more2;
    TextView user;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view2);
        more1 = findViewById(R.id.imageButton12);
        more2 = findViewById(R.id.imageButton13);
        user = findViewById(R.id.editTextText4);
        String passedArg = null;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            passedArg = extras.getString("arg");
        }
        if (passedArg != null) {
            user.setText(passedArg);
        }
        more1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(view2.this, view3.class);
                in.putExtra(ARG_FROM_MAIN, user.getText().toString());
                startActivity(in);
            }
        });
        more2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view2.this, view4.class);
                i.putExtra(ARG_FROM_MAIN, user.getText().toString());
                startActivity(i);
            }
        });
    }
}