package com.example.placement;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ftab1 extends Fragment  {

CardView cv1,cv2,cv3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment

        View v=inflater.inflate(R.layout.fragment_ftab1, container, false);

        cv1=v.findViewById(R.id.cv1);
        cv2=v.findViewById(R.id.cv2);
        cv3=v.findViewById(R.id.cv3);


        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(getActivity(),apti_cse.class);
                startActivity(intent);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),pgm_cse.class);
                startActivity(intent);
            }

        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),interview_cse.class);
                startActivity(intent);
            }
        });
        return v;





    }


    }
