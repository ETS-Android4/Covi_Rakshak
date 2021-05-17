package com.covirakshak.covi_rakshak;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class states_list extends districts_list {

    public ArrayList<String> check_name = new ArrayList<String>();
    public ArrayList<Boolean> check_store = new ArrayList<Boolean>();
    public ArrayList<String> state_name = new ArrayList<String>();



    public states_list() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_states_list);





        //Initializing names of states in state_name Array list
        state_name.add("Uttar Pradesh");
        state_name.add("Haryana");
        state_name.add("Delhi");

        check_name.add("false U");
        check_name.add("false U");
        check_name.add("false U");

        ////////////////////////////////////////////////////////








        //After proceed button click
        Button pr = (Button)  findViewById(R.id.proceed);
        pr.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                //int j=1;



                CheckBox a = (CheckBox) findViewById(R.id.c1);
                CheckBox b = (CheckBox) findViewById(R.id.c2);
                CheckBox c = (CheckBox) findViewById(R.id.c3);

                if(a.isChecked())
                {
                    check_name.set(0,"true");
                }
                else
                {

                    check_name.set(0,"false");
                }


                if(b.isChecked())
                {

                    check_name.set(1,"true");
                }
                else
                {

                    check_name.set(1,"false");
                }

                if(c.isChecked())
                {

                    check_name.set(2,"true");
                }
                else
                {
                    check_name.set(2,"false");
                }



                SharedPreferences shrd = getSharedPreferences("demo", MODE_PRIVATE);
                SharedPreferences.Editor editor = shrd.edit();

                if(  (check_name.get(0).equals("true") && check_name.get(1).equals("true")) || (check_name.get(0).equals("true") && check_name.get(2).equals("true")) || (check_name.get(1).equals("true") && check_name.get(2).equals("true")) )
                {

                    Toast.makeText(states_list.this, "Check only 1 Box to proceed",Toast.LENGTH_LONG).show();
                }
                else if(check_name.get(0).equals("true"))
                {
                    editor.putString("str", state_name.get(0));
                    editor.apply();

                    Intent i = new Intent(states_list.this, MainActivity.class);
                    startActivity(i);

                }
                else if(check_name.get(1).equals("true"))
                {
                    editor.putString("str", state_name.get(1));
                    editor.apply();

                    Intent i = new Intent(states_list.this, MainActivity.class);
                    startActivity(i);
                }
                else if(check_name.get(2).equals("true"))
                {
                    editor.putString("str", state_name.get(2));
                    editor.apply();

                    Intent i = new Intent(states_list.this, MainActivity.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(states_list.this, "Check only 1 Box to proceed",Toast.LENGTH_SHORT).show();
                }



            }
        });
        //////////////////////////////////////////////////////

        /*SharedPreferences getShared = getSharedPreferences("demo", MODE_PRIVATE);
        String value1 = getShared.getString("str1","Save a note and it will show up here");*/





    }



}