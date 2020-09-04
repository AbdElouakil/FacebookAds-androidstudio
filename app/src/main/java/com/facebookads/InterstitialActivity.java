package com.facebookads;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;

public class InterstitialActivity extends AppCompatActivity {

    private final String TAG = InterstitialActivity.class.getSimpleName();
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interstitial);

        // Load Interstitial AD
        LoadInterstitialAd();


        // Button to Show Interstitial AD
        Button showinterstitial = findViewById(R.id.showinterstitial);
        showinterstitial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowInterstitialAd();
            }
        });

    }


    // Method to load AD
    public void LoadInterstitialAd(){
        interstitialAd = new InterstitialAd(this, getResources().getString(R.string.Interstitial_id)); // Check Interstitial Id in Strings
        interstitialAd.setAdListener(new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                Log.e(TAG, "Interstitial ad displayed.");
            }
            @Override
            public void onInterstitialDismissed(Ad ad) {
                Log.e(TAG, "Interstitial ad dismissed.");
            }
            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(TAG, "Interstitial ad Error.");
            }
            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(TAG, "Interstitial ad is loaded and ready to be displayed!");

            }
            @Override
            public void onAdClicked(Ad ad) {
                Log.d(TAG, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.d(TAG, "Interstitial ad impression logged!");
            }
        });
        interstitialAd.loadAd();
    }

    // Method to Show AD
    private void ShowInterstitialAd() {
        if (interstitialAd != null && interstitialAd.isAdLoaded()) {
            interstitialAd.show();
        }
    }



}