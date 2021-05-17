package com.covirakshak.covi_rakshak;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class hospitals extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);



        SharedPreferences getShared_s = getSharedPreferences("demo", MODE_PRIVATE);
        String state = getShared_s.getString("str","States");


        LinearLayout l = (LinearLayout) findViewById(R.id.linear_papa);
        //TextView txt_h = (TextView) findViewById(R.id.txt);

        SharedPreferences shrd = getSharedPreferences("district", MODE_PRIVATE);
        String dis = shrd.getString("str_d","Districts");
        //to count
        db.collection("Covi Rakshak Hospitals")
                .whereEqualTo("District", dis)
                .get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {

                int i=0;
                for(QueryDocumentSnapshot documentSnapshot : queryDocumentSnapshots)
                {


                    if(documentSnapshot.getString("Verification").equals("v"))
                    {

                        LinearLayout l = (LinearLayout) findViewById(R.id.linear_papa);
                        CardView crd = new CardView(hospitals.this);
                        LinearLayout lc = new LinearLayout(hospitals.this);
                        lc.setOrientation(LinearLayout.HORIZONTAL);

                        crd.setBackground(ContextCompat.getDrawable(hospitals.this, R.drawable.table));

                        LinearLayout lcchild = new LinearLayout(hospitals.this);
                        lcchild.setOrientation(LinearLayout.VERTICAL);

                        LinearLayout l1 = new LinearLayout(hospitals.this);
                        l1.setOrientation(LinearLayout.HORIZONTAL);

                        TextView add = new TextView(hospitals.this);
                        add.setText(documentSnapshot.getString("Add"));
                        add.setTextSize(17);
                        add.setPadding(0,40,20,20);
                        add.setTextAppearance(hospitals.this, R.style.fontForNotificationLandingPage);
                        add.setTextColor(getResources().getColor(R.color.white));

                        ImageView add_i = new ImageView(hospitals.this);
                        add_i.setImageDrawable(ContextCompat.getDrawable(hospitals.this, R.drawable.map));
                        LinearLayout.LayoutParams parms = new LinearLayout.LayoutParams(180,180);
                        add_i.setPadding(0,35,20,0);
                        add_i.setLayoutParams(parms);
                        l1.addView(add_i);
                        l1.addView(add);



                        LinearLayout l2 = new LinearLayout(hospitals.this);
                        l2.setOrientation(LinearLayout.HORIZONTAL);

                        TextView num = new TextView(hospitals.this);
                        num.setText(documentSnapshot.getString("Phone"));
                        num.setTextSize(17);
                        num.setPadding(30,40,20,20);
                        num.setTextAppearance(hospitals.this, R.style.fontForNotificationLandingPage);
                        num.setTextColor(getResources().getColor(R.color.white));

                        ImageView phone = new ImageView(hospitals.this);
                        phone.setImageDrawable(ContextCompat.getDrawable(hospitals.this, R.drawable.phone1));;
                        LinearLayout.LayoutParams set_phone = new LinearLayout.LayoutParams(150,150);
                        phone.setLayoutParams(set_phone);
                        l2.addView(phone);
                        l2.addView(num);






                        TextView chk = new TextView(hospitals.this);
                        chk.setText(documentSnapshot.getString("Name"));
                        chk.setTextSize(22);
                        chk.setTextAppearance(hospitals.this, R.style.newfont);
                        chk.setPadding(20,35,50,20);
                        chk.setTextColor(getResources().getColor(R.color.white));

                        ImageView doc = new ImageView(hospitals.this);
                        doc.setPadding(10,130,0,0);
                        doc.setImageDrawable(ContextCompat.getDrawable(hospitals.this, R.drawable.doctorfinal));
                        LinearLayout.LayoutParams set_addi = new LinearLayout.LayoutParams(430,430);
                        doc.setLayoutParams(set_addi);

                        add_i.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri gmmIntentUri = Uri.parse(documentSnapshot.getString("geo"));
                                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                                mapIntent.setPackage("com.google.android.apps.maps");
                                startActivity(mapIntent);
                            }
                        });

                        phone.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(Intent.ACTION_DIAL);
                                intent.setData(Uri.parse("tel:"+documentSnapshot.getString("Phone")));
                                startActivity(intent);
                            }
                        });
                        //lc.addView(locate);
                        lcchild.addView(chk);
                        lcchild.addView(l1);
                        lcchild.addView(l2);
                        lc.addView(doc);
                        lc.addView(lcchild);
                        //lc.addView(pic);


                        crd.addView(lc);
                        l.addView(crd);




                    }
                    else if(documentSnapshot.getString("Verification").equals("pv"))
                    {

                        LinearLayout l = (LinearLayout) findViewById(R.id.linear_papa);
                        CardView crd = new CardView(hospitals.this);
                        LinearLayout lc = new LinearLayout(hospitals.this);
                        lc.setOrientation(LinearLayout.HORIZONTAL);

                        crd.setBackground(ContextCompat.getDrawable(hospitals.this, R.drawable.table_pv));

                        LinearLayout lcchild = new LinearLayout(hospitals.this);
                        lcchild.setOrientation(LinearLayout.VERTICAL);

                        LinearLayout l1 = new LinearLayout(hospitals.this);
                        l1.setOrientation(LinearLayout.HORIZONTAL);

                        TextView add = new TextView(hospitals.this);
                        add.setText(documentSnapshot.getString("Add"));
                        add.setTextSize(17);
                        add.setPadding(0,40,20,20);
                        add.setTextAppearance(hospitals.this, R.style.fontForNotificationLandingPage);
                        add.setTextColor(getResources().getColor(R.color.white));

                        ImageView add_i = new ImageView(hospitals.this);
                        add_i.setImageDrawable(ContextCompat.getDrawable(hospitals.this, R.drawable.map));
                        LinearLayout.LayoutParams parms = new LinearLayout.LayoutParams(180,180);
                        add_i.setPadding(0,35,20,0);
                        add_i.setLayoutParams(parms);
                        l1.addView(add_i);
                        l1.addView(add);



                        LinearLayout l2 = new LinearLayout(hospitals.this);
                        l2.setOrientation(LinearLayout.HORIZONTAL);

                        TextView num = new TextView(hospitals.this);
                        num.setText(documentSnapshot.getString("Phone"));
                        num.setTextSize(17);
                        num.setPadding(30,40,20,20);
                        num.setTextAppearance(hospitals.this, R.style.fontForNotificationLandingPage);
                        num.setTextColor(getResources().getColor(R.color.white));

                        ImageView phone = new ImageView(hospitals.this);
                        phone.setImageDrawable(ContextCompat.getDrawable(hospitals.this, R.drawable.phone1));;
                        LinearLayout.LayoutParams set_phone = new LinearLayout.LayoutParams(150,150);
                        phone.setLayoutParams(set_phone);
                        l2.addView(phone);
                        l2.addView(num);






                        TextView chk = new TextView(hospitals.this);
                        chk.setText(documentSnapshot.getString("Name"));
                        chk.setTextSize(22);
                        chk.setTextAppearance(hospitals.this, R.style.newfont);
                        chk.setPadding(20,35,50,20);
                        chk.setTextColor(getResources().getColor(R.color.white));

                        ImageView doc = new ImageView(hospitals.this);
                        doc.setPadding(10,130,0,0);
                        doc.setImageDrawable(ContextCompat.getDrawable(hospitals.this, R.drawable.doctorfinal));
                        LinearLayout.LayoutParams set_addi = new LinearLayout.LayoutParams(430,430);
                        doc.setLayoutParams(set_addi);

                        add_i.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri gmmIntentUri = Uri.parse(documentSnapshot.getString("geo"));
                                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                                mapIntent.setPackage("com.google.android.apps.maps");
                                startActivity(mapIntent);
                            }
                        });

                        phone.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(Intent.ACTION_DIAL);
                                intent.setData(Uri.parse("tel:"+documentSnapshot.getString("Phone")));
                                startActivity(intent);
                            }
                        });
                        //lc.addView(locate);
                        lcchild.addView(chk);
                        lcchild.addView(l1);
                        lcchild.addView(l2);
                        lc.addView(doc);
                        lc.addView(lcchild);
                        //lc.addView(pic);


                        crd.addView(lc);
                        l.addView(crd);




                    }

                    else
                    {

                        LinearLayout l = (LinearLayout) findViewById(R.id.linear_papa);
                        CardView crd = new CardView(hospitals.this);
                        LinearLayout lc = new LinearLayout(hospitals.this);
                        lc.setOrientation(LinearLayout.HORIZONTAL);

                        crd.setBackground(ContextCompat.getDrawable(hospitals.this, R.drawable.table_nv));

                        LinearLayout lcchild = new LinearLayout(hospitals.this);
                        lcchild.setOrientation(LinearLayout.VERTICAL);

                        LinearLayout l1 = new LinearLayout(hospitals.this);
                        l1.setOrientation(LinearLayout.HORIZONTAL);

                        TextView add = new TextView(hospitals.this);
                        add.setText(documentSnapshot.getString("Add"));
                        add.setTextSize(17);
                        add.setPadding(0,40,20,20);
                        add.setTextAppearance(hospitals.this, R.style.fontForNotificationLandingPage);
                        add.setTextColor(getResources().getColor(R.color.white));

                        ImageView add_i = new ImageView(hospitals.this);
                        add_i.setImageDrawable(ContextCompat.getDrawable(hospitals.this, R.drawable.map));
                        LinearLayout.LayoutParams parms = new LinearLayout.LayoutParams(180,180);
                        add_i.setPadding(0,35,20,0);
                        add_i.setLayoutParams(parms);
                        l1.addView(add_i);
                        l1.addView(add);



                        LinearLayout l2 = new LinearLayout(hospitals.this);
                        l2.setOrientation(LinearLayout.HORIZONTAL);

                        TextView num = new TextView(hospitals.this);
                        num.setText(documentSnapshot.getString("Phone"));
                        num.setTextSize(17);
                        num.setPadding(30,40,20,20);
                        num.setTextAppearance(hospitals.this, R.style.fontForNotificationLandingPage);
                        num.setTextColor(getResources().getColor(R.color.white));

                        ImageView phone = new ImageView(hospitals.this);
                        phone.setImageDrawable(ContextCompat.getDrawable(hospitals.this, R.drawable.phone1));;
                        LinearLayout.LayoutParams set_phone = new LinearLayout.LayoutParams(150,150);
                        phone.setLayoutParams(set_phone);
                        l2.addView(phone);
                        l2.addView(num);






                        TextView chk = new TextView(hospitals.this);
                        chk.setText(documentSnapshot.getString("Name"));
                        chk.setTextSize(22);
                        chk.setTextAppearance(hospitals.this, R.style.newfont);
                        chk.setPadding(20,35,50,20);
                        chk.setTextColor(getResources().getColor(R.color.white));

                        ImageView doc = new ImageView(hospitals.this);
                        doc.setPadding(10,130,0,0);
                        doc.setImageDrawable(ContextCompat.getDrawable(hospitals.this, R.drawable.nurse));
                        LinearLayout.LayoutParams set_addi = new LinearLayout.LayoutParams(430,430);
                        doc.setLayoutParams(set_addi);

                        add_i.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri gmmIntentUri = Uri.parse(documentSnapshot.getString("geo"));
                                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                                mapIntent.setPackage("com.google.android.apps.maps");
                                startActivity(mapIntent);
                            }
                        });

                        phone.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(Intent.ACTION_DIAL);
                                intent.setData(Uri.parse("tel:"+documentSnapshot.getString("Phone")));
                                startActivity(intent);
                            }
                        });

                        lcchild.addView(chk);
                        lcchild.addView(l1);
                        lcchild.addView(l2);
                        lc.addView(doc);
                        lc.addView(lcchild);



                        crd.addView(lc);
                        l.addView(crd);


                    }



                }

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {



            }
        });


















    }
}