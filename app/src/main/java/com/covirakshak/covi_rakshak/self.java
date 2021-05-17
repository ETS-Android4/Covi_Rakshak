package com.covirakshak.covi_rakshak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class self extends AppCompatActivity {

    public int score = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self);




        ImageView i = (ImageView) findViewById(R.id.self_care);
        i.setBackground(ContextCompat.getDrawable(self.this, R.drawable.soumen1));

        //i.setBackground(ContextCompat.getDrawable(self.this, R.drawable.soumen1));
        TextView t = (TextView) findViewById(R.id.heading_self);
        t.setText("What is herbal tea or kadha?\n" +
                "It is a traditional, homemade, aromatic drink that has numerous healing properties. Different medicinal ingredients are used to make this kadha. It is used in India since ancient times but currently, it comes into the limelight due to the corona pandemic 2020. Apart from boosting your immunity, this kadha will relax your body, decrease body temperature, improve skin quality, strengthen your stomach health, and much more.");

        ImageView i1 = (ImageView) findViewById(R.id.image1);
        i1.setBackground(ContextCompat.getDrawable(self.this, R.drawable.prone));
        i1.setVisibility(View.INVISIBLE);

        ImageView i11 = (ImageView) findViewById(R.id.image11);
        i11.setBackground(ContextCompat.getDrawable(self.this, R.drawable.water));
        i11.setVisibility(View.VISIBLE);

        TextView t1 = (TextView) findViewById(R.id.self_descript1);
        t1.setText("Herbal tea is full of antioxidants and vitamins that are very essential to enhance your immune system. Antioxidants help to reduce internal infection by destroying free radicles. It protects against the risk of chronic diseases like cancer, diabetes. Some of the best herbal teas to boost your immunity are elderberry, echinacea, and ginger.");


        TextView t2 = (TextView)findViewById(R.id.heading_self2);
        t2.setText("Giloy is known for its health benefits such as diabetes control, weight management and othersKnow how the herb can help boost immunity, and how you can incorporate it in your diet to stay safe from diseases such as COVID-19");


        ImageView i2 = (ImageView) findViewById(R.id.image2);
        i2.setBackground(ContextCompat.getDrawable(self.this, R.drawable.plant));




        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;


                if(score==1)
                {
                    i.setBackground(ContextCompat.getDrawable(self.this, R.drawable.soumen1));
                    TextView t = (TextView) findViewById(R.id.heading_self);
                    t.setText("What is herbal tea or kadha?\n" +
                            "It is a traditional, homemade, aromatic drink that has numerous healing properties. Different medicinal ingredients are used to make this kadha. It is used in India since ancient times but currently, it comes into the limelight due to the corona pandemic 2020. Apart from boosting your immunity, this kadha will relax your body, decrease body temperature, improve skin quality, strengthen your stomach health, and much more.");

                    ImageView i1 = (ImageView) findViewById(R.id.image1);
                    i1.setBackground(ContextCompat.getDrawable(self.this, R.drawable.prone));
                    i1.setVisibility(View.INVISIBLE);

                    ImageView i11 = (ImageView) findViewById(R.id.image11);
                    i11.setBackground(ContextCompat.getDrawable(self.this, R.drawable.water));
                    i11.setVisibility(View.VISIBLE);

                    TextView t1 = (TextView) findViewById(R.id.self_descript1);
                    t1.setText("Herbal tea is full of antioxidants and vitamins that are very essential to enhance your immune system. Antioxidants help to reduce internal infection by destroying free radicles. It protects against the risk of chronic diseases like cancer, diabetes. Some of the best herbal teas to boost your immunity are elderberry, echinacea, and ginger.");


                    TextView t2 = (TextView)findViewById(R.id.heading_self2);
                    t2.setText("Giloy is known for its health benefits such as diabetes control, weight management and othersKnow how the herb can help boost immunity, and how you can incorporate it in your diet to stay safe from diseases such as COVID-19");


                    ImageView i2 = (ImageView) findViewById(R.id.image2);
                    i2.setBackground(ContextCompat.getDrawable(self.this, R.drawable.plant));

                }
                else if(score == 2)
                {
                    i.setBackground(ContextCompat.getDrawable(self.this, R.drawable.self11));

                    TextView t = (TextView) findViewById(R.id.heading_self);
                    t.setText("Proning position is proven to be the finest way to increase the oxygen level");

                    ImageView i1 = (ImageView) findViewById(R.id.image1);
                    i1.setBackground(ContextCompat.getDrawable(self.this, R.drawable.prone));
                    i1.setVisibility(View.VISIBLE);

                    ImageView i11 = (ImageView) findViewById(R.id.image11);
                    i11.setBackground(ContextCompat.getDrawable(self.this, R.drawable.yogaa));
                    i11.setVisibility(View.INVISIBLE);


                    TextView t1 = (TextView) findViewById(R.id.self_descript1);
                    t1.setText("1) Open pillow below the neck\n2) One or two pillows below the chest\n3) Two pillows below the shins");

                    TextView t2 = (TextView)findViewById(R.id.heading_self2);
                    t2.setText("Applying gentle pressure and massaging on accupressure points with your fingers is believed to help alleviate respiratory and breathing problems");

                    ImageView i2 = (ImageView) findViewById(R.id.image2);
                    i2.setBackground(ContextCompat.getDrawable(self.this, R.drawable.accu));

                }
                else if(score==3)
                {
                    i.setBackground(ContextCompat.getDrawable(self.this, R.drawable.self22));
                    TextView t = (TextView) findViewById(R.id.heading_self);
                    t.setText("More commonly known as alternate nostril breathing, it is a prevalent Pranayama and has been spoken about in the Hatha Yoga literature. This exercise helps clear out the nasal passage and improves respiratory muscle strength");

                    ImageView i1 = (ImageView) findViewById(R.id.image1);
                    i1.setBackground(ContextCompat.getDrawable(self.this, R.drawable.prone));
                    i1.setVisibility(View.INVISIBLE);

                    ImageView i11 = (ImageView) findViewById(R.id.image11);
                    i11.setBackground(ContextCompat.getDrawable(self.this, R.drawable.yogaa));
                    i11.setVisibility(View.VISIBLE);

                    TextView t1 = (TextView) findViewById(R.id.self_descript1);
                    t1.setText("With your right thumb, close your right nostril and inhale through the left nostril. Release your right nostril and with your middle and ring finger, close your left nostril exhaling through the right nostril\n" +
                            "\n" +
                            "Inhale through the right nostril, then release the fingers, closing the right nostril and exhaling through the left nostril");

                    TextView t2 = (TextView)findViewById(R.id.heading_self2);
                    t2.setText("When you know how to breathe correctly with diaphragmatic momentum, you reap multiple benefits. Most importantly, deeper diaphragm breathing can slow down your heart rate. This should help you feel calmer and less stressed.");


                    ImageView i2 = (ImageView) findViewById(R.id.image2);
                    i2.setBackground(ContextCompat.getDrawable(self.this, R.drawable.bely));
                    score= 0;

                }
                else
                {
                    score=0;
                }
            }
        });






    }
}