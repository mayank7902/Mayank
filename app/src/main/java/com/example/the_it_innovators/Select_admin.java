package com.example.the_it_innovators;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class Select_admin extends AppCompatActivity {
CardView student,teacher;
TextView selectTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_admin);
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);

        student=findViewById(R.id.cardstudent);
        teacher=findViewById(R.id.cardteacher);
        selectTV=findViewById(R.id.textViewAdmin);
        selectTV.setOnClickListener(v -> Toast.makeText(Select_admin.this, "clicked tv", Toast.LENGTH_SHORT).show());
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Select_admin.this, "clicked", Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(Select_admin.this,enterNumber.class);
                startActivity(intent);
                finish();
            }
        });

    }


}