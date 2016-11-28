package com.example.user.day06_service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button start,stop;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        start.setOnClickListener(new ButtonListener());
        stop.setOnClickListener(new ButtonListener());
    }

    private void init() {
        start= (Button) findViewById(R.id.button1);
        stop= (Button) findViewById(R.id.button2);
        intent=new Intent();
        intent.setClass(MainActivity.this,MyService.class);


    }
    public class ButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.button1:
                    //开启服务
                    startService(intent);
                    break;
                case R.id.button2:
                    //关闭服务
                    stopService(intent);
                    break;
            }
        }
    }
}
