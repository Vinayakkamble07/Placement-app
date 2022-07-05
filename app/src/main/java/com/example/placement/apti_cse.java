package com.example.placement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class apti_cse extends AppCompatActivity {
    TextView linkTextView1,linkTextView2,linkTextView3,linkTextView4,linkTextView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apti_cse);

        linkTextView1=findViewById(R.id.linktv1);
        linkTextView1.setMovementMethod(LinkMovementMethod.getInstance());

        linkTextView2=findViewById(R.id.linktv2);
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance());

        linkTextView3=findViewById(R.id.linktv3);
        linkTextView3.setMovementMethod(LinkMovementMethod.getInstance());

        linkTextView4=findViewById(R.id.linktv4);
        linkTextView4.setMovementMethod(LinkMovementMethod.getInstance());

        linkTextView5=findViewById(R.id.linktv5);
        linkTextView5.setMovementMethod(LinkMovementMethod.getInstance());


    }
}