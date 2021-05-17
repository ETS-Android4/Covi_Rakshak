package com.covirakshak.covi_rakshak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class districts_list extends AppCompatActivity {

    public ArrayList<String> check_name_district = new ArrayList<String>();
    public ArrayList<String> district_name = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_districts_list);

        district_name.add("Ghaziabad");
        district_name.add("Meerut");
        district_name.add("GautamBuddh Nagar");
        district_name.add("Agra");
        district_name.add("Prayagraj");
        district_name.add("Kanpur");

        district_name.add("Faridabad");
        district_name.add("Gurgaon");




        check_name_district.add("false_U");
        check_name_district.add("false_U");
        check_name_district.add("false_U");
        check_name_district.add("false_U");
        check_name_district.add("false_U");
        check_name_district.add("false_U");
        check_name_district.add("false_U");
        check_name_district.add("false_U");


        //extracting state information from share preferneces
        SharedPreferences getshared = getSharedPreferences("demo", MODE_PRIVATE);
        String store = getshared.getString("str", "States");

        if(store.equals("Uttar Pradesh"))
        {

            for(int i=0;i<6;i++)
            {
                LinearLayout l = (LinearLayout) findViewById(R.id.d);
                CheckBox chk = new CheckBox(this);
                chk.setText(district_name.get(i));
                chk.setTextSize(20);
                chk.setBackground(ContextCompat.getDrawable(this, R.drawable.space));
                chk.setPadding(40,40,40,40);
                chk.setTextAppearance(districts_list.this, R.style.newfont);
                chk.setId(100+i);
                l.addView(chk);
                //txt.setBackground(android.graphics.drawable.);







            }



        }
        else if(store.equals("Haryana"))
        {
            for(int i=6;i<8;i++)
            {
                LinearLayout l = (LinearLayout) findViewById(R.id.d);
                CheckBox chk = new CheckBox(this);
                chk.setText(district_name.get(i));
                chk.setTextSize(20);
                chk.setBackground(ContextCompat.getDrawable(this, R.drawable.space));
                chk.setTextAppearance(districts_list.this, R.style.newfont);
                chk.setPadding(40,40,40,40);
                chk.setId(100+i);
                l.addView(chk);







            }


        }
        else if(store.equals("Delhi"))
        {
            LinearLayout l = (LinearLayout) findViewById(R.id.d);
            TextView chk = new TextView(this);
            chk.setText("We will show data across whole Delhi");
            chk.setTextSize(20);

            chk.setTextAppearance(districts_list.this, R.style.newfont);
            chk.setPadding(20,20,20,20);
            l.addView(chk);
            //txt.setBackground(android.graphics.drawable.);

        }




        //Storing check boxes ticks
        SharedPreferences shrd_d = getSharedPreferences("district", MODE_PRIVATE);
        SharedPreferences.Editor editor = shrd_d.edit();









        Button pr_d = (Button)  findViewById(R.id.proceed_d);
        pr_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(store.equals("Uttar Pradesh"))
                {

                    for(int i=100;i<106;i++)
                    {

                        CheckBox c = (CheckBox) findViewById(i);

                        if(c.isChecked())
                        {
                            check_name_district.set(i-100,"true");
                        }
                        else
                        {
                            check_name_district.set(i-100,"false");
                        }


                    }



                    int store = 0;
                    int count = 0;
                    for(int a = 0;a<6;a++)
                    {

                        count = 0;
                        if(check_name_district.get(a).equals("true"))
                        {

                            for(int s=0;s<6;s++)
                            {

                                if(s!=a && check_name_district.get(s).equals("true"))
                                {
                                    count++;
                                    break;
                                }
                                else
                                {

                                }

                            }

                            if(count==0)
                            {
                                store++;
                                editor.putString("str_d", district_name.get(a));
                                editor.apply();

                                Intent i = new Intent(districts_list.this, MainActivity.class);
                                startActivity(i);

                            }
                            else
                            {
                                //Toast.makeText(districts_list.this, "Check only 1 Box to proceed",Toast.LENGTH_SHORT).show();
                            }


                        }
                        else
                        {
                            //

                        }






                    }

                    if(store!=1)
                    {
                        Toast.makeText(districts_list.this, "Check only 1 Box to proceed",Toast.LENGTH_SHORT).show();
                    }



                }
                else if(store.equals("Haryana"))
                {
                    for(int i=106;i<108;i++)
                    {

                        CheckBox c = (CheckBox) findViewById(i);

                        if(c.isChecked())
                        {
                            check_name_district.set(i-100,"true");
                        }
                        else
                        {
                            check_name_district.set(i-100,"false kdm");
                        }

                    }



                    int store = 0;
                    int count = 0;
                    for(int a = 6;a<8;a++)
                    {

                        count = 0;
                        if(check_name_district.get(a).equals("true"))
                        {

                            for(int s=6;s<8;s++)
                            {

                                if(s!=a && check_name_district.get(s).equals("true"))
                                {
                                    count++;
                                    break;
                                }
                                else
                                {

                                }

                            }

                            if(count==0)
                            {
                                store++;
                                editor.putString("str_d", district_name.get(a));
                                editor.apply();

                                Intent i = new Intent(districts_list.this, MainActivity.class);
                                startActivity(i);

                            }
                            else
                            {
                                //Toast.makeText(districts_list.this, "Check only 1 Box to proceed",Toast.LENGTH_SHORT).show();
                            }


                        }
                        else
                        {
                            //

                        }






                    }

                    if(store!=1)
                    {
                        Toast.makeText(districts_list.this, "Check only 1 Box to proceed",Toast.LENGTH_SHORT).show();
                    }


                }

                else if(store.equals("Delhi"))
                {
                    editor.putString("str_d", "Delhi");
                    editor.apply();

                    Intent i = new Intent(districts_list.this, MainActivity.class);
                    startActivity(i);
                }







                /*TextView ted1 = (TextView) findViewById(R.id.d1);
                ted1.setText(check_name_district.get(0));

                TextView ted2 = (TextView) findViewById(R.id.d2);
                ted2.setText(check_name_district.get(1));

                TextView ted3 = (TextView) findViewById(R.id.d3);
                ted3.setText(check_name_district.get(2));

                TextView ted4 = (TextView) findViewById(R.id.d4);
                ted4.setText(check_name_district.get(3));

                TextView ted5 = (TextView) findViewById(R.id.d5);
                ted5.setText(check_name_district.get(4));

                TextView ted6 = (TextView) findViewById(R.id.d6);
                ted6.setText(check_name_district.get(5));

                TextView ted7 = (TextView) findViewById(R.id.d7);
                ted7.setText(check_name_district.get(6));

                TextView ted8 = (TextView) findViewById(R.id.d8);
                ted8.setText(check_name_district.get(7));*/

            }
        });















    }//terminations of On create method
}