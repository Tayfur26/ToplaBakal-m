package com.example.toplabakalm;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;



public class Main2Activity extends AppCompatActivity {


    public int a1;
    public String basamak;
    public  String adet;
    String saniye2;

    public int a2;
    public int a3;

    EditText bas;
    EditText san;
    EditText aded;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);






        btn =(Button)findViewById(R.id.button);

        //saniye2=;


        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                bas = (EditText)findViewById(R.id.editText2);
                san = (EditText)findViewById(R.id.editText3);
                aded = (EditText)findViewById(R.id.editText4);
                a2=Integer.parseInt(san.getText().toString());
                a1= Integer.parseInt(bas.getText().toString());
                a3=Integer.parseInt(aded.getText().toString());
                Intent i=new Intent(getApplicationContext(),Main3Activity.class);
                i.putExtra("basamak1",a1);
                i.putExtra("adet1",a3);
                i.putExtra("saniye1",a2);
                //SystemClock.sleep(3000);
                startActivity(i);

            }
        });


    }

}
