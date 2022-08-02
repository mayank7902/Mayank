package com.example.the_it_innovators;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class chapters extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapters);
        initData();
        initRecyclerView();

    }

    @SuppressLint({"WrongViewCast", "NotifyDataSetChanged"})
    private void initRecyclerView() {

        recyclerView=findViewById(R.id.chapterName);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    private void initData() {
        userList=new ArrayList<>();
        userList.add(new ModelClass("chapter 1:"));
        userList.add(new ModelClass("chapter 2:"));
        userList.add(new ModelClass("chapter 3:"));
        userList.add(new ModelClass("chapter 4:"));




    }
}