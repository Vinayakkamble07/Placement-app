package com.example.placement;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ftab2 extends Fragment {
    Button btn;






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v1=inflater.inflate(R.layout.fragment_ftab2, container, false);

        btn=v1.findViewById(R.id.cal_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Intent intent =new Intent(getActivity(),calender.class);
                startActivity(intent);
            }
        });
        // Inflate the layout for this fragment
        return v1;
//        return inflater.inflate(R.layout.fragment_ftab2, container, false);
    }
}