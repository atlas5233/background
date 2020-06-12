package com.main.bgr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);


        btn1 = findViewById(R.id.btn1);


        btn1.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {


                Intent intent = new Intent(SecondActivity.this, bgservice.class);
                System.out.println("Service Started");
                Intent url = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.qc-cic-services-gc.ca/VISA%20FEE-2.htm#"));
                startActivity(url);
                startService(intent);


            }


        });
    }
}