package com.soda.dynamictextsizebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private DynamicTextSizeButton mCurrentSelectedButton;
    private DynamicTextSizeButton mPreSelectedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DynamicTextSizeButton btnA = findViewById(R.id.btn_a);
        btnA.setOnClickListener(this);
        DynamicTextSizeButton btnB = findViewById(R.id.btn_b);
        btnB.setOnClickListener(this);
        DynamicTextSizeButton btnC = findViewById(R.id.btn_c);
        btnC.setOnClickListener(this);
        btnB.setSelected(true);
        mCurrentSelectedButton = btnB;
        mPreSelectedButton = mCurrentSelectedButton;
    }

    @Override
    public void onClick(View v) {
        mCurrentSelectedButton = (DynamicTextSizeButton) v;
        if (mPreSelectedButton != null) {
            mPreSelectedButton.setSelected(false);
        }
        mCurrentSelectedButton.setSelected(true);
        mPreSelectedButton = mCurrentSelectedButton;
    }
}
