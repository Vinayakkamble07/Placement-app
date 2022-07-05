package com.example.placement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class interview_cse extends AppCompatActivity {

    TextView int1,int2,int3,int4,int5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview_cse);

        int1=findViewById(R.id.int1);
        int1.setMovementMethod(LinkMovementMethod.getInstance());

        int2=findViewById(R.id.int2);
        int2.setMovementMethod(LinkMovementMethod.getInstance());

        int3=findViewById(R.id.int3);
        int3.setMovementMethod(LinkMovementMethod.getInstance());

        int4=findViewById(R.id.int4);
        int4.setMovementMethod(LinkMovementMethod.getInstance());

        int5=findViewById(R.id.int5);
        int5.setMovementMethod(LinkMovementMethod.getInstance());


    }
}