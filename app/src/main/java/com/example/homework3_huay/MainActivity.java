package com.example.homework3_huay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Random2=(Button) findViewById(R.id.button_Random2);
        Button Random3=(Button) findViewById(R.id.button2_Ramdom3);
        assert Random2 != null;
        assert Random3 != null;


        Random2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("ฺBai_main","2");
                startActivity(intent);
            }
        });

        Random3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("ฺBai_main","3");
                startActivity(intent);
            }
        });

    }
}
