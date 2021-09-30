package com.example.registerationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView name = findViewById(R.id.name_tv);
        TextView email = findViewById(R.id.email_tv);
        TextView phone = findViewById(R.id.phone_tv);
        name.setText(getIntent().getBundleExtra("bundle").getString("name"));
        email.setText(getIntent().getBundleExtra("bundle").getString("email"));
        phone.setText(getIntent().getBundleExtra("bundle").getString("phone"));

    }
}