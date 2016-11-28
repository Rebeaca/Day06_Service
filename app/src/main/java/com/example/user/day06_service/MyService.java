package com.example.user.day06_service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        Log.e("SRL","bind");
        throw new UnsupportedOperationException("Not yet implemented");

    }

    @Override
    public void onCreate() {
        super.onCreate();
        delayTask();
        Log.e("SRL","创建");

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("SRL","开始");

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("SRL","销毁");
    }
    public void delayTask(){
        //
        new Thread(){
            @Override
            public void run() {
                super.run();
                for(int i=0;i<5;i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Log.e("SRL","耗时====="+i);
                }

            }
        }.start();

    }
}
