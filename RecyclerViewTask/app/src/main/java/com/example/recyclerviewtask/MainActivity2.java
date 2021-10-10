package com.example.recyclerviewtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        card c = getIntent().getParcelableExtra("Card");

        ImageView img = findViewById(R.id.imageview);
        TextView text = findViewById(R.id.name);

        img.setImageResource(c.image);
        text.setText(c.name);
    }
}