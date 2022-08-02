package com.example.the_it_innovators;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<ModelClass> userList;
    public Adapter(List<ModelClass>userList){
        this.userList=userList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.chapter_itemdesign,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        String name=userList.get(position).getTextview1();

        holder.setData(name);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            textview=itemView.findViewById(R.id.chapterName);



        }

        public void setData(String name) {

            textview.setText(name);

        }
    }
}
