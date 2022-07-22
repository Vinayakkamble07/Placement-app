package com.example.placement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signIn extends AppCompatActivity {

    private EditText mEmail,mPass ;
    private TextView mTextView;
    private Button signInbtn;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        mEmail=findViewById(R.id.email_reg);
        mPass=findViewById(R.id.pass_reg);
        mTextView=findViewById(R.id.textView2);
        signInbtn=findViewById(R.id.signin_btn);
        mAuth=FirebaseAuth.getInstance();

        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(signIn.this,MainActivity.class));
            }
        });
        signInbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });
    }
    private void loginUser(){
        String email=mEmail.getText().toString();
        String pass=mPass.getText().toString();
        String adminEmail="adminsgbit@gmail.com";
        String adminPass="admin123";

        if(email.equals(adminEmail) && pass.equals(adminPass))
        {
//       {    Intent intent=new Intent(signIn.this,adminPage.class);
//            startActivity(intent);
            mAuth.signInWithEmailAndPassword(email,pass).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {
                    Intent intent=new Intent(signIn.this,adminPage.class);
                    startActivity(intent);
                }
            });
        }

        if(!email.isEmpty()&& Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            if (!pass.isEmpty()){
                mAuth.signInWithEmailAndPassword(email,pass).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        Toast.makeText(signIn.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(signIn.this , home.class));
                        finish();
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(signIn.this, "Login Failed !!", Toast.LENGTH_SHORT).show();
                    }
                });

            }
            else{
                mPass.setError("Empty fields not allowed");
            }


        }
        else if (email.isEmpty()){
            mEmail.setError("Empty fields are not allowed");

        }
        else{
            mEmail.setError("Please enter Correct Email");
        }

    }
}