package com.example.rmontoya.intentnavigation;

import android.os.Bundle;
import android.view.View;

import com.example.rmontoya.intentnavigation.base.BaseNavigationActivity;

public class SecondActivity extends BaseNavigationActivity implements View.OnClickListener {

    private String ACTIVITY_TITLE = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void disableButtons() {
        secondButton.setEnabled(false);
    }

    @Override
    protected void setOnClickListeners() {
        firstButton.setOnClickListener(this);
        thirdButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
        previousButton.setOnClickListener(this);
    }

    @Override
    protected void setActivityTitle() {
        titleTextView.setText(ACTIVITY_TITLE);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.first_button:
            case R.id.previous_button:
                startDestinationActivity(this, FirstActivity.class);
                break;
            case R.id.next_button:
            case R.id.third_button:
                startDestinationActivity(this, ThirdActivity.class);
                break;
        }
    }

}