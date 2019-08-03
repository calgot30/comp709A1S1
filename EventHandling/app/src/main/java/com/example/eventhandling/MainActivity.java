package com.example.eventhandling;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

//imported libraries for event handling
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/*
This class creates a reference to the button on screen, and has 3 separate event
listener methods for the button: an onClick, an onLongClick that returns true, and an
onLongClick that returns false(extra option for homework, more details
lower down).
These event listeners begin to wait for an event from the user from when the app opens
(as they are inside the onCreate Method) and when the user presses the button,
the listeners determine if it was a short or a long click. Then they execute their actions.
 */
public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //reference to the button on the main screen.
        Button buttonEvent = (Button)findViewById(R.id.buttonEvent);


         /*
        Method that creates an interface for the onClick event listener.
        This method checks if the user has used clicked on the button, if they have
        it will change the text of the text field to the option below.
         */
        buttonEvent.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView callumsText = (TextView)findViewById(R.id.CallumsText);
                        callumsText.setText("Good job Hoss");
                    }
                }

        );

        /*
        Method that creates an interface for the on long click event listener.
        This method checks if the user has used a long click on the button, if they have
        it will change the text of the text field to the option below.
         */
        buttonEvent.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View V){
                        TextView callumsText = (TextView)findViewById(R.id.CallumsText);
                        callumsText.setText("Holy carp, that was a long one!");
                        return true;
                    }
                }
        ); 


        /*
        Extra credit from video 20, have the return value as false
        to see what the result would be.  While holding the button down, the
        text changed to the new text and would remain like that.  After releasing the
        button, it would change to the onClick event option instead.
         */

    /*   buttonEvent.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View V){
                        TextView callumsText = (TextView)findViewById(R.id.CallumsText);
                        callumsText.setText("This is a different message from before!");
                        return false;
                    }
                }
        ); */
    }
}
