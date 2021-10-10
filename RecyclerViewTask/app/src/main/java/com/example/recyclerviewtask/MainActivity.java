package com.example.recyclerviewtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<card> cards = populate();
        adapter myadapter = new adapter(cards);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(myadapter);


    }
    private List<card> populate(){
        ArrayList<card> cards = new ArrayList<>();
        cards.add(new card(R.drawable.image,"Image0"));
        cards.add(new card(R.drawable.image1,"Image1"));
        cards.add(new card(R.drawable.image2,"Image2"));
        cards.add(new card(R.drawable.image3,"Image3"));
        cards.add(new card(R.drawable.image4,"Image4"));
        cards.add(new card(R.drawable.image5,"Image5"));
        cards.add(new card(R.drawable.image6,"Image6"));
        cards.add(new card(R.drawable.image7,"Image7"));
        cards.add(new card(R.drawable.image8,"Image8"));
        cards.add(new card(R.drawable.image9,"Image9"));
        return cards;
    }
}