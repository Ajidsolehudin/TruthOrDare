package com.padahehegame.truthordare.activities;

import androidx.appcompat.app.AppCompatActivity;

import com.padahehegame.truthordare.R;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class ActivitySplashScreen extends AppCompatActivity {

    ImageView ic_logo;

    private int waktu_loading=3000;
    //3000 = 3 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //SETELAH SPLASH SCREEN SELESAI AKAN DIARAHKAN KE ACTIVITY LAIN
                Intent intent = new Intent(ActivitySplashScreen.this, ActivityMain.class);
                startActivity(intent);
                finish();
            }
        },waktu_loading);
        ic_logo = findViewById(R.id.logo);
    }
}