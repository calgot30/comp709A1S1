package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener{



    //creates the layout for the main activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //This gets called by the Top Fragment when the user clicks the button
    @Override
    public void createMeme(String top, String bottom) {
        BottomPictureFragment bottomFragment = (BottomPictureFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.setMemeText(top, bottom);
    }
}
