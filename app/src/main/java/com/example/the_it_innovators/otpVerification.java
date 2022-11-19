package com.example.the_it_innovators;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

public class otpVerification extends AppCompatActivity {
    TextView mchangenumber;
    EditText mgetotp;
    Button mverifyotp;
    String enterotp;
    FirebaseAuth firebaseAuth;
    ProgressBar mprogressbarofotpauth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);
        getSupportActionBar().hide();

        mverifyotp=findViewById(R.id.buttonVerifyOTP);
        mgetotp=findViewById(R.id.editTextOTP);
        mprogressbarofotpauth=findViewById(R.id.progressbarofOTPVerification);
        firebaseAuth=FirebaseAuth.getInstance();


        mverifyotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterotp=mgetotp.getText().toString();
                if(enterotp.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Enter opt first", Toast.LENGTH_SHORT).show();
                }
                else{
                    mprogressbarofotpauth.setVisibility(View.VISIBLE);
                    String coderecieved=getIntent().getStringExtra("otp");
                    PhoneAuthCredential credential= PhoneAuthProvider.getCredential(coderecieved,enterotp);
                    signInWithPhoneAuthCredential(credential);

                }


            }
        });


    }


    private void signInWithPhoneAuthCredential(PhoneAuthCredential credential){
        firebaseAuth.signInWithCredential(credential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    mprogressbarofotpauth.setVisibility(View.INVISIBLE);
                    Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(otpVerification.this,Home_screen.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    if(task.getException() instanceof FirebaseAuthInvalidCredentialsException){
                        mprogressbarofotpauth.setVisibility(View.INVISIBLE);
                        Toast.makeText(getApplicationContext(), "Login Failed", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }


    }
