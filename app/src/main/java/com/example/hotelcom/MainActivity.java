package com.example.hotelcom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hotelcom.view2;

public class MainActivity extends AppCompatActivity {
    EditText User,Password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         User =findViewById(R.id.username);
         Password = findViewById(R.id.password);
        login =  findViewById(R.id.loginButton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (User.getText().toString().equals("") || Password.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Field Required!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login Successfully!", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this , view2.class);
                    i.putExtra("arg", getText());
                    startActivity(i);
                }

            }
        });
    }
    public String getText(){
        String Data = User.getText().toString();
        return Data;
    }
}