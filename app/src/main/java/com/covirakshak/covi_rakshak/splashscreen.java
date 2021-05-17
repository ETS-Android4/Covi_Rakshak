package com.covirakshak.covi_rakshak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashscreen extends AppCompatActivity {
    private static int SPLASH=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intents=new Intent(splashscreen.this,MainActivity.class);
                startActivity(intents);
                finish();
            }
        },SPLASH);

    }
}