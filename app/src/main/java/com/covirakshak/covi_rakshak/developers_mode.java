package com.covirakshak.covi_rakshak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class developers_mode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers_mode);

        EditText pass = (EditText) findViewById(R.id.edit_password);
        EditText mail = (EditText) findViewById(R.id.edit_mail);


        LinearLayout user = (LinearLayout) findViewById(R.id.login_btn);
        user.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                if(pass.getText().toString().equals("soumen0610yash2309") && (mail.getText().toString().equals("soumenkp2@gmail.com") || mail.getText().toString().equals("tyagi11000@gmail.com")))
                {
                    Intent i = new Intent(developers_mode.this , ui_dev_mode.class);
                    startActivity(i);

                }
                else
                {
                    Toast.makeText(developers_mode.this, "Oops! Seems like you aren't a developer",Toast.LENGTH_LONG).show();
                }




            }
        });
        Button user2= (Button) findViewById(R.id.button);
        user2.setOnClickListener(new View.OnClickListener()
        {
            String d="https://docs.google.com/forms/d/e/1FAIpQLSfwjDIOsRXeCFs8-fm5B3D8nXvkC3aP5utHpSW-u3nU_IJzGQ/viewform?usp=pp_url";
            @Override
            public void onClick(View v) {
                Intent i_user = new Intent(Intent.ACTION_VIEW);
                i_user.setData(Uri.parse(d));
                startActivity(i_user);
            }
        });



        Button user3= (Button) findViewById(R.id.privacy);
        user3.setOnClickListener(new View.OnClickListener()
        {
            String e="https://www.freeprivacypolicy.com/live/c091d64a-d634-4131-8a2d-dfb7706b4c22";
            @Override
            public void onClick(View v) {
                Intent i_user = new Intent(Intent.ACTION_VIEW);
                i_user.setData(Uri.parse(e));
                startActivity(i_user);
            }
        });




    }

}