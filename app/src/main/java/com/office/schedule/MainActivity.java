package com.office.schedule;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final long SPLASH_SCREEN_MS = 2500;

    private long mTimeBeforeDelay;
    private Handler mSplashHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSplashHandler = new Handler();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // The first time mTimeBeforeDelay will be 0.
        long gapTime = System.currentTimeMillis() - mTimeBeforeDelay;
        if (gapTime > SPLASH_SCREEN_MS) {
            gapTime = SPLASH_SCREEN_MS;
        }
        mSplashHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        }, gapTime);
        // Save the time before the delay.
        mTimeBeforeDelay = System.currentTimeMillis();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mSplashHandler.removeCallbacksAndMessages(null);
    }
}
