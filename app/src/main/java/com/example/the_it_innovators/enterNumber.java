package com.example.the_it_innovators;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class enterNumber extends AppCompatActivity {
Button sendOtpButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_number);
       sendOtpButton= findViewById(R.id.sendotpbutton);
       getSupportActionBar().hide();
        sendOtpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(enterNumber.this,otpVerification.class);
                startActivity(intent);
                finish();
            }
        });
    }
}