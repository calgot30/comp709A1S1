package com.example.gestures;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.os.Bundle;

//imported bundles for gesture detection.
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;

/*
There has been a recent error on the android libraries updates where the pathing for
this particular library causes it to 'not exist' they're still trying to make it work.
 */
//import android.support.v4.*;

/*
This class uses event listeners to check to see what the user is doing,
it is listening for gestures from the user (eg. scroll, swipe, double tap) and then
the method that refers to that specific gesture changes the text in the text field to
the appropriate text.  The boolean methods have been set to true to show that the event has
been handled and the text will remain after the gesture is complete.
 */
public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener{


    //variables to reference in methods later
    private TextView callumsMessage;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finds the ID of the text field
        callumsMessage = (TextView)findViewById(R.id.callumsMessage);

        //listen handler for the gesture detection
        this.gestureDetector = new GestureDetectorCompat(this, this);
        gestureDetector.setOnDoubleTapListener(this);
    }


    ///////////////////////////// Begin Gestures ///////////////////////////////////



    //if the gesture detection confirms single tap
    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
       //change text field to this message
        callumsMessage.setText("onSingleTapConfirmed");
        return true;
    }

    //if the gesture detection confirms double tap
    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        //change text field to this message
        callumsMessage.setText("onDoubleTap");
        return true;
    }

    //If gesture detection confirms double tap event
    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        //change text field to this message
        callumsMessage.setText("onDoubleTapEvent");
        return true;
    }

    //If gesture detection confirms press down event
    @Override
    public boolean onDown(MotionEvent motionEvent) {
        //change text field to this message
        callumsMessage.setText("onDown");
        return true;
    }

    //If gesture detection detects a press event
    @Override
    public void onShowPress(MotionEvent motionEvent) {
        //change text field to this message
        callumsMessage.setText("onShowPress");
    }

    //If gesture detection detects release of single tap
    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        //change text field to this message
        callumsMessage.setText("onSingleTapUp");
        return true;
    }

    //if gesture detection detects scroll gesture
    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        //change text field to this message
        callumsMessage.setText("onScroll");
        return true;
    }

    //If gesture detection detects long press
    @Override
    public void onLongPress(MotionEvent motionEvent) {
        //change text field to this message
        callumsMessage.setText("onLongPress");
    }

    //If gesture detection detects fling gesture.
    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        //change text field to this message
        callumsMessage.setText("onFling");
        return true;
    }

    //////////////////////////////////////////// End Gestures /////////////////////////////////////////


    //If this detects any touch event
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
