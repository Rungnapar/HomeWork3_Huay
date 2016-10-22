package com.example.homework3_huay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity2 extends  AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        Huay ha=new Huay();
        Intent intent=getIntent();
        String bai=intent.getStringExtra("ฺBai_main");
        TextView baiTextviwe1 =(TextView) findViewById(R.id.textView1_Random_Bai);
        TextView baiTextviwe2 = (TextView) findViewById(R.id.textView2_Random_Bai);
        if(bai.equals("2")){
            baiTextviwe1.setText("เลขท้าย 2 ตัว");
            baiTextviwe2.setText(ha.getRandomTwoDigits());
        }else if(bai.equals("3")){
            baiTextviwe1.setText("เลขท้าย 3 ตัว");
            baiTextviwe2.setText(ha.getRandomThreeDigits());
        }





    }
}