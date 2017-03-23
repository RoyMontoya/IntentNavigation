package com.example.rmontoya.intentnavigation.base;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.example.rmontoya.intentnavigation.R;

public class BaseNavigationActivity extends AppCompatActivity {
    protected TextView titleTextView;
    protected Button firstButton;
    protected Button secondButton;
    protected Button thirdButton;
    protected Button nextButton;
    protected Button previousButton;

    public void startDestinationActivity(Activity activity, Class<?> destination) {
        Intent intent = new Intent(activity, destination);
        startActivity(intent);
    }

    public void setTextViewTitle(String title) {
        titleTextView = (TextView) findViewById(R.id.activity_title_text);
        titleTextView.setText(title);
    }

    public void setNavigationButtons(){
        firstButton = (Button) findViewById(R.id.first_button);
        secondButton = (Button) findViewById(R.id.second_button);
        thirdButton = (Button) findViewById(R.id.third_button);
        nextButton = (Button) findViewById(R.id.next_button);
        previousButton = (Button) findViewById(R.id.previous_button);
    }



}
