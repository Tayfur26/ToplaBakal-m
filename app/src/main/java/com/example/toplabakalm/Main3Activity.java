package com.example.toplabakalm;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Random;

public class Main3Activity extends AppCompatActivity {

    CountDownTimer countDownTimer;


    public int a4;
    public int basamak;
    public int adet;
    public int saniye;
    TextView text1;
    //TextView text2;
    //TextView text3;



    Random random = new Random();
    Integer k;
    Integer sayac=0;
    Integer degisken;
    Integer saniye1;


    Long saniye2;
    Long basamak1;
    Long adet1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        /*

        adet = i.getStringExtra("adet1");
        saniye = i.getStringExtra("saniye1");

        */
        Intent i = getIntent();

        saniye1=getIntent().getExtras().getInt("saniye1");
        adet=getIntent().getExtras().getInt("adet1");
        basamak=getIntent().getExtras().getInt("basamak1");
        text1 = (TextView) findViewById(R.id.textView3);
        //san=Integer.parseInt(basamak);



        //text2=(TextView)findViewById(R.id.textView6);
        //text3=(TextView)findViewById(R.id.textView7);








        saniye2=Long.valueOf(saniye1*1000);
        //basamak1=Long.valueOf(basamak);
        adet1=Long.valueOf((adet+1)*1000);

        if(basamak==1)
        {
            a4=10;
        }
        else if(basamak==2)
        {
            a4=100;
        }
        else if(basamak==3)
        {
            a4=1000;
        }
        // text2.setText(adet);
        // text3.setText(saniye);

        countDownTimer = new CountDownTimer(adet1, saniye2) {
            @Override
            public void onTick(long millisUntilFinished) {
                text1.setText("");
                 degisken = random.nextInt(a4) + 1;
                //text1.setText(String.valueOf(millisUntilFinished / 1000));
                text1.setText(String.valueOf(degisken));
                sayac=sayac+degisken;
            }

            @Override
            public void onFinish() {

                Intent i=new Intent(getApplicationContext(),Main4Activity.class);
                i.putExtra("deger",sayac);
                //SystemClock.sleep(3000);
                startActivity(i);
                text1.setText("");

                text1.setText(String.valueOf(sayac));
               // SystemClock.sleep(3000);



            }
        }.start();


    }

}

