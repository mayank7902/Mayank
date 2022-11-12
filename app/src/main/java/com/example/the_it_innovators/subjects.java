package com.example.the_it_innovators;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class subjects extends AppCompatActivity {
    ImageView subject = findViewById(R.id.profilelogo);
    FloatingActionButton floatingActionButtonsubjects;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);
        subject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(subjects.this,chapters.class);
                startActivity(intent);
            }
        });
        floatingActionButtonsubjects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(subjects.this,askquestion.class);
                startActivity(intent);
            }
        });


    }
}