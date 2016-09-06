package com.example.cleaner208.t0905_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
private static String TAG="My Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "Verbose Message");
        Log.d(TAG, "Debug Message");
        Log.i(TAG, "Info Message");
        Log.w(TAG, "Warning Message");
        Log.e(TAG, "Error Message");
    }
}
