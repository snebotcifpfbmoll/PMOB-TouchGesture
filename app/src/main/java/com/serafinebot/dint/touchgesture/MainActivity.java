package com.serafinebot.dint.touchgesture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MotionEventCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getActionMasked();

        switch (action) {
            case MotionEvent.ACTION_DOWN:
                Log.d(LOG_TAG, "action: DOWN");
                return true;
            case MotionEvent.ACTION_MOVE:
                Log.d(LOG_TAG, "action: MOVE");
                return true;
            case MotionEvent.ACTION_UP:
                Log.d(LOG_TAG, "action: UP");
                return true;
            case MotionEvent.ACTION_CANCEL:
                Log.d(LOG_TAG, "action: CANCEL");
                return true;
            case MotionEvent.ACTION_OUTSIDE:
                Log.d(LOG_TAG, "action: OUTSIDE");
                return true;
            default:
                return super.onTouchEvent(event);
        }
    }
}