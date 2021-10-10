package com.example.recyclerviewtask;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.viewHolder> {

    List<card> cards;

    public adapter(List<card> cards) {
        this.cards = cards;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,
                parent, false);

        return new viewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.populateCard(cards.get(position));
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private final ImageView imageV;
        private final TextView textV;
        Intent intent = new Intent(itemView.getContext(), MainActivity2.class);


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageV = itemView.findViewById(R.id.card_Icon);
            textV = itemView.findViewById(R.id.card_text);
            itemView.setOnClickListener(this);
        }

        public void populateCard(card c){
            imageV.setImageResource(c.image);
            textV.setText(c.name);
            intent.putExtra("Card", c);

        }

        @Override
        public void onClick(View view) {
            if(view.getId() == itemView.getId()){
                itemView.getContext().startActivity(intent);
            }
        }
    }
}
