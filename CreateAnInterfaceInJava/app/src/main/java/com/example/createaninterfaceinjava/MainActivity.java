package com.example.createaninterfaceinjava;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Layout
        RelativeLayout callumsLayout = new RelativeLayout(this);

        //change the layout color
        callumsLayout.setBackgroundColor(Color.GREEN);

        //Button with changed color and text
        Button redButton = new Button(this);
        redButton.setText("Log In");
        redButton.setBackgroundColor(Color.RED);

        //Username input
        EditText username = new EditText(this);

        //set ID's
        redButton.setId(1);
        username.setId(2);


        //layout parameters for button and username
        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams
        (
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams
                (
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );

        //give rules to username widget
        usernameDetails.addRule(RelativeLayout.ABOVE, redButton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0, 0, 0, 50);

        //sets the rules for the buttonDetails layout
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        //Add widget to layout(button is now child of layout
        callumsLayout.addView(redButton, buttonDetails);
        callumsLayout.addView(username, usernameDetails);

        Resources r = getResources();
        //takes whatever DIP value and converts it into pixel value
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP
                                                 ,200, r.getDisplayMetrics());

        //uses the set width function (which only takes pixel value
        //hence the reason for the casting from the TypedValue function.
        username.setWidth(px);
        //Set this activities content/display to this view.
        setContentView(callumsLayout);
    }
}
