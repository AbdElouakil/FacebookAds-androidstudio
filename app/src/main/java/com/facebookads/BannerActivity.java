package com.facebookads;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class BannerActivity extends AppCompatActivity {

    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);

        // Button to Show Banner or you can directly add (LoadBannerAd();) inside onCreate to show banner automatically
        Button showbanner = findViewById(R.id.showbanner);
        showbanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoadBannerAd();
            }
        });


    }


    // Outside onCreate
    private void LoadBannerAd() {
        LinearLayout adContainer = findViewById(R.id.banner_container);
        adView = new AdView(BannerActivity.this, getString(R.string.Banner_id), AdSize.BANNER_HEIGHT_50); // Check Banner Id in Strings
        adContainer.addView(adView);
        adView.setAdListener(new AdListener() {
            @Override
            public void onError(Ad ad, AdError adError) {
                // onError callback
            }
            @Override
            public void onAdLoaded(Ad ad) {
                // onAdLoaded callback
            }
            @Override
            public void onAdClicked(Ad ad) {
                // onAdClicked callback
            }
            @Override
            public void onLoggingImpression(Ad ad) {
                // onLoggingImpression callback
            }
        });
        adView.loadAd();
    }
}