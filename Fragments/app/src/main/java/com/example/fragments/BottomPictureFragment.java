package com.example.fragments;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/*
This class creates the bottom section fragment for our meme generator app.
It communicates with the main activity to check what the user typed into the text fields from the
top fragment, then changes the text fields accordingly for the meme.
 */
public class BottomPictureFragment extends Fragment{


    //variables for our text fields
    private static TextView topMemeText;
    private static TextView bottomMemeText;


    /*
    checks to see what the layout of the fragment is, eg what xml file is it using?
    Then creates the view of the fragment for us.
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);
        topMemeText = (TextView) view.findViewById(R.id.topMemeText);
        bottomMemeText = (TextView) view.findViewById(R.id.bottomMemeText);
        return view;

    }

    //method to set the text of the meme, changes both text fields
    public void setMemeText(String top, String bottom){
        topMemeText.setText(top);
        bottomMemeText.setText(bottom);
    }

}
