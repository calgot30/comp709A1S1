package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import android.view.MenuItem;

/*
    This program utilises the Log function of android studio to print out a log message
    whenever the app is created, opened, closed, resumed, saved, paused, stopped, or restarted.
    It prints out the log message on the logcat window in the android studio editor.
 */

public class MainActivity extends AppCompatActivity {

    /*the code I wrote using videos 9&10 from:
     https://www.youtube.com/watch?v=cOYzJN6A-JM&list=PL6gx4Cwl9DGBsvRxJJOzG4r4k_zLKrnxl&index=11
    The New Boston
    */

    //String to create logs of what my app is doing in the background
    private static final String TAG =  "buckysMessage";


    //Creates the layout of the app upon the creation of the application
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");
    }

    //prints out a log on the logcat terminal when the app starts
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    //prints out a log on the logcat terminal when the app Resumes
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    //prints out a log on the logcat terminal when the app Pauses
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause");
    }

    //prints out a log on the logcat terminal when the app Stops
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    //prints out a log on the logcat terminal when the app Restarts
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, "onRestart");
    }

    //prints out a log on the logcat terminal when the app Saves
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");
    }

    //prints out a log on the logcat terminal when the app Restores an Instance
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
    }


}
