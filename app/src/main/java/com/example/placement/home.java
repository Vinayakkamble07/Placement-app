package com.example.placement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class home extends AppCompatActivity {

    RecyclerView rcv;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rcv=(RecyclerView)findViewById(R.id.rclview);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter=new Adapter(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);









    }
    public ArrayList<Model> dataqueue(){
        ArrayList<Model> holder =new ArrayList<>();

        Model ob1= new Model();
        ob1.setImgname(R.drawable.logo1);
        holder.add(ob1);

        Model ob2= new Model();
        ob2.setImgname(R.drawable.logo2);
        holder.add(ob2);

        Model ob3= new Model();
        ob3.setImgname(R.drawable.logo3);
        holder.add(ob3);

        Model ob4= new Model();
        ob4.setImgname(R.drawable.logo4);
        holder.add(ob4);

        Model ob5= new Model();
        ob5.setImgname(R.drawable.logo5);
        holder.add(ob5);
        return holder;
    }
}