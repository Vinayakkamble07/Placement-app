package com.example.placement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class adminPage extends AppCompatActivity {
    EditText company,date1,branch1;
    Button notify1;
    FirebaseFirestore dbroot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);

        company=findViewById(R.id.comp);
        date1=findViewById(R.id.date);
        branch1=findViewById(R.id.branch);
        notify1=findViewById(R.id.notify);
        dbroot=FirebaseFirestore.getInstance();

        notify1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertdata();
            }
        });
    }

    public void insertdata()
    {
        Map<String,String> items=new HashMap<>();
        items.put("name",company.getText().toString().trim());
        items.put("date",date1.getText().toString().trim());
        items.put("branch",branch1.getText().toString().trim());

        dbroot.collection("schedule").add(items).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                company.setText("");
                date1.setText("");
                branch1.setText("");
                Toast.makeText(getApplicationContext(),"inserted Successfully",Toast.LENGTH_LONG).show();
            }
        });

    }
}