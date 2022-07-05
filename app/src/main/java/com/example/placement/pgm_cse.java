package com.example.placement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class pgm_cse extends AppCompatActivity {

    TextView tx1,tx2,tx3,tx4,tx5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pgm_cse);

        tx1=findViewById(R.id.text1);
        tx1.setMovementMethod(LinkMovementMethod.getInstance());

        tx2=findViewById(R.id.text2);
        tx2.setMovementMethod(LinkMovementMethod.getInstance());

        tx3=findViewById(R.id.text3);
        tx3.setMovementMethod(LinkMovementMethod.getInstance());

        tx4=findViewById(R.id.text4);
        tx4.setMovementMethod(LinkMovementMethod.getInstance());

        tx5=findViewById(R.id.text5);
        tx5.setMovementMethod(LinkMovementMethod.getInstance());



    }
}