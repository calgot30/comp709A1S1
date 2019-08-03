package com.example.fragments;

import android.content.Context;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


/*
This class creates the top section fragment for our meme generator app.
It handles the text that the user will input and then communicates with the main activity from there.
 */
public class TopSectionFragment extends Fragment {


    //variables to use for editing text
    private static EditText topTextInput;
    private static EditText bottomTextInput;

    //event listener for the top section
    TopSectionListener activityCommander;

    public interface TopSectionListener{
        public void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            activityCommander = (TopSectionListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }


    /*
    checks to see what the layout of the fragment is, eg what xml file is it using?
    Then creates the view of the fragment for us.
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       //lets the onCreate know what type of layout the fragment will be using.
        View view = inflater.inflate(R.layout.top_section_fragment, container, false);


        //reads what the user typed into the text fields and changes the text held in them
        topTextInput = (EditText) view.findViewById(R.id.topTextInput);
        bottomTextInput = (EditText) view.findViewById(R.id.bottomTextInput);

        //assigns the object to the button on the screen
        final Button button = (Button) view.findViewById(R.id.button);


        /*
        listen event for the button, checks when user clicks the button then calls the buttonClicked Method
         */
        button.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        buttonClicked(v);
                    }
                }
        );

        return view;

    }

    /*
    Calls this when the button is clicked. Takes the view parameter that gets passed through when the
    button is clicked.  Changes the top and bottom meme text fields of the meme.
     */
    public void buttonClicked(View view){
        activityCommander.createMeme(topTextInput.getText().toString(),
                                     bottomTextInput.getText().toString());
    }
}
