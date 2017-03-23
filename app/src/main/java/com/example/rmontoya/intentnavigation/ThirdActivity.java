package com.example.rmontoya.intentnavigation;

import android.os.Bundle;
import android.view.View;

import com.example.rmontoya.intentnavigation.base.BaseNavigationActivity;

public class ThirdActivity extends BaseNavigationActivity implements View.OnClickListener {

    private String ACTIVITY_TITLE = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTextViewTitle(ACTIVITY_TITLE);
        setNavigationButtons();
        setOnClickListeners();
        disableButtons();
    }

    private void disableButtons() {
        thirdButton.setEnabled(false);
        nextButton.setEnabled(false);
    }

    private void setOnClickListeners() {
        firstButton.setOnClickListener(this);
        secondButton.setOnClickListener(this);
        previousButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.first_button:
                startDestinationActivity(this, FirstActivity.class);
                break;
            case R.id.previous_button:
            case R.id.second_button:
                startDestinationActivity(this, SecondActivity.class);
                break;
        }
    }
}
