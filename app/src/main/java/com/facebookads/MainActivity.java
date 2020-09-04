package com.facebookads;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Button to launch BannerActivity
        Button banner = (Button) findViewById(R.id.banner);
        banner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, BannerActivity.class);
                startActivity(i);
            }
        });


        // Button to launch InterstitialActivity
        Button interstitial = (Button) findViewById(R.id.interstitial);
        interstitial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, InterstitialActivity.class);
                startActivity(i);
            }
        });


        // Button to launch NativeAdsActivity
        Button nativeads = (Button) findViewById(R.id.nativeads);
        nativeads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, NativeAdsActivity.class);
                startActivity(i);
            }
        });


        // Button to launch NativeBannerActivity
        Button nativebanner = (Button) findViewById(R.id.nativebanner);
        nativebanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, NativeBannerActivity.class);
                startActivity(i);
            }
        });



        // Button to launch NativeBannerActivity
        TextView contact = (TextView) findViewById(R.id.contact);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContactMe();
            }
        });

    }

    private void ContactMe() {
        Intent contact = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/abdelouakil.arhilass"));
        startActivity(contact);
    }

}