package com.example.registerationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button register_btn = findViewById(R.id.register_btn);
        TextInputLayout name_layout = findViewById(R.id.name_et);
        TextInputLayout email_layout = findViewById(R.id.email_et);
        TextInputLayout phone_layout = findViewById(R.id.phone_et);


        register_btn.setOnClickListener(view -> {
            String name = name_layout.getEditText().getText().toString();
            String email = email_layout.getEditText().getText().toString();
            String phone = phone_layout.getEditText().getText().toString();
            Intent intent = new Intent(this, MainActivity3.class);
            Bundle bundle = new Bundle();
            bundle.putString("name", name);
            bundle.putString("email", email);
            bundle.putString("phone", phone);
            intent.putExtra("bundle", bundle);
            startActivity(intent);
        });




    }
}