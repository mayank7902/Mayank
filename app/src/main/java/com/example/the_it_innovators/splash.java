package com.example.the_it_innovators;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
getSupportActionBar().hide();

        Animation topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        Animation botAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        ImageView logo=findViewById(R.id.imageViewLogo);
        TextView appname=findViewById(R.id.appName);

        logo.setAnimation(topAnim);
        appname.setAnimation(botAnim);
        Intent intent =new Intent(splash.this,enterNumber.class);
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}