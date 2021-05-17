package com.covirakshak.covi_rakshak;

import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends states_list {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        float v= 0;
        SharedPreferences getShared = getSharedPreferences("demo", MODE_PRIVATE);
        String value1 = getShared.getString("str","States");
        TextView te = (TextView) findViewById(R.id.txt_states);
        te.setText(value1);


        SharedPreferences getShared_d = getSharedPreferences("district", MODE_PRIVATE);
        String value2 = getShared_d.getString("str_d","Districts");
        TextView td = (TextView) findViewById(R.id.district_txt);
        td.setText(value2);

        Button user = (Button) findViewById(R.id.searchbtn);
        user.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                if(te.getText().toString().equals("Uttar Pradesh") && (  td.getText().toString().equals("Ghaziabad") || td.getText().toString().equals("Meerut") || td.getText().toString().equals("GautamBuddh Nagar") || td.getText().toString().equals("Agra")  || td.getText().toString().equals("Prayagraj") || td.getText().toString().equals("Kanpur") ))
                {

                    Intent i_user = new Intent(MainActivity.this , users_mode.class);
                    startActivity(i_user);


                }
                else if(te.getText().toString().equals("Haryana") && (  td.getText().toString().equals("Faridabad") || td.getText().toString().equals("Gurgaon") ))
                {

                    Intent i_user = new Intent(MainActivity.this , users_mode.class);
                    startActivity(i_user);

                }
                else if(te.getText().toString().equals("Delhi") && (  td.getText().toString().equals("Delhi")  ))
                {

                    Intent i_user = new Intent(MainActivity.this , users_mode.class);
                    startActivity(i_user);

                }
                else
                {
                    Toast.makeText(MainActivity.this, "Select appropiate State and District",Toast.LENGTH_LONG).show();
                }

            }
        });


        CardView user1 = (CardView) findViewById(R.id.card_dev);
        user1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, developers_mode.class);
                startActivity(i);

            }
        });

        CardView c_s = (CardView)  findViewById(R.id.card_state);
        c_s.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, states_list.class);
                startActivity(i);

            }
        });



        CardView c_d = (CardView)  findViewById(R.id.card_district);
        c_d.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, districts_list.class);
                startActivity(i);

            }
        });



        //Animation of buttons
        TextView dev = (TextView) findViewById(R.id.dev_btn);
       // Button use = (Button) findViewById(R.id.us_btn);
        Button search = (Button) findViewById(R.id.searchbtn);
        //Button update = (Button) findViewById(R.id.updatebtn);

        dev.setTranslationY(300);
        //use.setTranslationY(300);
        search.setTranslationY(300);
        //update.setTranslationY(300);

        dev.setAlpha(v);
        //use.setAlpha(v);
        search.setAlpha(v);
        //update.setAlpha(v);

        dev.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        //use.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        search.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        //update.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();















    }//termination of on create method


    public void about(View v)
    {
        Intent s = new Intent(MainActivity.this, about.class);
        startActivity(s);




    }








}