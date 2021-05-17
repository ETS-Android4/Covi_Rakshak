package com.covirakshak.covi_rakshak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);




        ImageView user1= (ImageView) findViewById(R.id.in1);
        user1.setOnClickListener(new View.OnClickListener()
        {
            String d="https://www.linkedin.com/in/soumen-paul-0b3915204/";
            @Override
            public void onClick(View v) {
                Intent i_user = new Intent(Intent.ACTION_VIEW);
                i_user.setData(Uri.parse(d));
                startActivity(i_user);
            }
        });



        ImageView user2= (ImageView) findViewById(R.id.in2);
        user2.setOnClickListener(new View.OnClickListener()
        {
            String e="https://www.linkedin.com/in/yash-tyagi-7273b6201/";
            @Override
            public void onClick(View v) {
                Intent i_user = new Intent(Intent.ACTION_VIEW);
                i_user.setData(Uri.parse(e));
                startActivity(i_user);
            }
        });




    }
}