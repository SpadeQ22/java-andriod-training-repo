package com.example.a2butons_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView label = findViewById(R.id.username);
        ImageView image = findViewById(R.id.profile_image);


        Button changeImageBtn = findViewById(R.id.change_image_btn);
        Button changeUsernameBtn = findViewById(R.id.change_name_btn);


        changeUsernameBtn.setOnClickListener( view -> {
            label.setText("Welcome to my app");

        });

        changeImageBtn.setOnClickListener(view -> {
            image.setImageDrawable(getDrawable(R.drawable.avatar2));
        });

    }
}