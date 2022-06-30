package com.example.placement;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewholder extends RecyclerView.ViewHolder
{
    ImageView img;
    public myviewholder(@NonNull View itemView) {
        super(itemView);
        img=(ImageView)itemView.findViewById(R.id.image);
    }
}
