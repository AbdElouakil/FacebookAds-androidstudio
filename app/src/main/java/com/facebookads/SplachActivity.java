package com.facebookads;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import com.facebook.ads.AudienceNetworkAds;

public class SplachActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Initialize the audience natwork Sdk ' Recommended in splash screen '
        AudienceNetworkAds.initialize(this);


        // Splash Time
        int SPLASH_TIME_OUT = 3000;
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent homeintent = new Intent(SplachActivity.this, MainActivity.class);
                startActivity(homeintent);
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}