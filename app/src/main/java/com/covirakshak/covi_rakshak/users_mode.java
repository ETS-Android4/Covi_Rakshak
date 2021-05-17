package com.covirakshak.covi_rakshak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class users_mode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_mode);


        //float v= 0;


        CardView user = (CardView) findViewById(R.id.card_hospitals);
        user.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(users_mode.this , hospitals.class);
                startActivity(i);
            }
        });

        CardView user1 = (CardView) findViewById(R.id.card_plasma);
        user1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent ic = new Intent(users_mode.this , plasma.class);
                startActivity(ic);
            }
        });


        CardView user2 = (CardView) findViewById(R.id.card_oxygen);
        user2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent ic = new Intent(users_mode.this , oxygen.class);
                startActivity(ic);
            }
        });


        CardView user3 = (CardView) findViewById(R.id.card_selfcare);
        user3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent ic = new Intent(users_mode.this , self.class);
                startActivity(ic);
            }
        });

        SharedPreferences getShared = getSharedPreferences("demo", MODE_PRIVATE);
        String value1 = getShared.getString("str","States");


        SharedPreferences getShared_d = getSharedPreferences("district", MODE_PRIVATE);
        String value2 = getShared_d.getString("str_d","Districts");

        TextView t = (TextView) findViewById(R.id.welcome_text);
        t.append(" ");
        t.append(value2);
        t.setTextAppearance(users_mode.this, R.style.newfont);
        t.append(", ");
        t.append(value1);
        t.setTextAppearance(users_mode.this, R.style.newfont);







       /* CardView hosp = (CardView) findViewById(R.id.card_hospitals);
        CardView ox = (CardView) findViewById(R.id.card_oxygen);
        CardView pl = (CardView) findViewById(R.id.card_plasma);
        CardView in = (CardView) findViewById(R.id.card_injections);
        CardView sc = (CardView) findViewById(R.id.card_selfcare);


        hosp.setTranslationY(300);
        pl.setTranslationY(300);
        ox.setTranslationY(300);
        in.setTranslationY(300);
        sc.setTranslationY(300);

        hosp.setAlpha(v);
        pl.setAlpha(v);
        ox.setAlpha(v);
        in.setAlpha(v);
        sc.setAlpha(v);


        hosp.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        pl.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        ox.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(300).start();
        in.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(200).start();
        sc.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(100).start();*/


    }


    





}