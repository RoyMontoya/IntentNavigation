package com.example.rmontoya.intentnavigation.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.example.rmontoya.intentnavigation.R;

public abstract class BaseNavigationActivity extends AppCompatActivity {

    protected TextView titleTextView;
    protected Button firstButton;
    protected Button secondButton;
    protected Button thirdButton;
    protected Button nextButton;
    protected Button previousButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setNavigationButtons();
        setTextView();
        setOnClickListeners();
        disableButtons();
        setActivityTitle();
    }

    protected void startDestinationActivity(Activity activity, Class<?> destination) {
        Intent intent = new Intent(activity, destination);
        startActivity(intent);
    }

    protected void setTextView() {
        titleTextView = (TextView) findViewById(R.id.activity_title_text);
    }

    protected void setNavigationButtons() {
        firstButton = (Button) findViewById(R.id.first_button);
        secondButton = (Button) findViewById(R.id.second_button);
        thirdButton = (Button) findViewById(R.id.third_button);
        nextButton = (Button) findViewById(R.id.next_button);
        previousButton = (Button) findViewById(R.id.previous_button);
    }

    protected abstract void setActivityTitle();

    protected abstract void disableButtons();

    protected abstract void setOnClickListeners();

}