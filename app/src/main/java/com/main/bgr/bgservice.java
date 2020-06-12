package com.main.bgr;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.Timer;
import java.util.TimerTask;

public class bgservice extends Service
{
    private static Timer timer = new Timer();
    private Context ctx;

    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }
    public void onCreate()

    {
        super.onCreate();

        ctx = this;

        startService();
    }

    private void startService()
    {
        timer.scheduleAtFixedRate(new mainTask(), 0, 5000);
        Toast.makeText(this, "Service Started...", Toast.LENGTH_SHORT).show();
    }
    private class mainTask extends TimerTask

    {

        public void run()

        {

            toastHandler.sendEmptyMessage(0);

        }

    }

    private final Handler toastHandler = new Handler()

    {
        @Override

        public void handleMessage(Message msg)
        {

            Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();



        }

    };

}

