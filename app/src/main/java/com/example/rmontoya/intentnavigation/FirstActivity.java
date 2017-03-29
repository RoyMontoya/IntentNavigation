package com.example.rmontoya.intentnavigation;

import android.os.Bundle;
import android.view.View;

import com.example.rmontoya.intentnavigation.base.BaseNavigationActivity;

public class FirstActivity extends BaseNavigationActivity implements View.OnClickListener {

    private String ACTIVITY_TITLE = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void disableButtons() {
        previousButton.setEnabled(false);
        firstButton.setEnabled(false);
    }

    @Override
    protected void setOnClickListeners() {
        secondButton.setOnClickListener(this);
        thirdButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
    }

    @Override
    protected void setActivityTitle() {
        titleTextView.setText(ACTIVITY_TITLE);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.second_button:
            case R.id.next_button:
                startDestinationActivity(this, SecondActivity.class);
                break;
            case R.id.third_button:
                startDestinationActivity(this, ThirdActivity.class);
                break;
        }
    }

}