package com.example.hotelcom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class view2 extends AppCompatActivity {
    Button more1,more2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view2);
        more1 = findViewById(R.id.more1);
        more2 = findViewById(R.id.more3);
        more1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view2.this , view3.class);
                startActivity(i);
            }
        });
        more2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view2.this , view4.class);
                startActivity(i);
            }
        });
        return 0;
    }
}