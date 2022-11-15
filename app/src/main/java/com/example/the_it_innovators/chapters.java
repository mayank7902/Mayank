package com.example.the_it_innovators;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class chapters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapters);
        getSupportActionBar().hide();
        FloatingActionButton floatingActionButtonChapters=findViewById(R.id.floatingActionButtonChapters);
        floatingActionButtonChapters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(chapters.this,askquestion.class);
                startActivity(intent);
            }
        });


    }
}