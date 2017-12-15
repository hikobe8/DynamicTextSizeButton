package com.soda.dynamictextsizebutton;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;

/**
 * Author: yr
 * 17-12-15 下午3:40.
 */

public class DynamicTextSizeButton extends android.support.v7.widget.AppCompatButton {

    private float mDefaultTextSize;

    private float mSelectedTextSize;


    public DynamicTextSizeButton(Context context) {
        this(context, null, 0);
    }

    public DynamicTextSizeButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DynamicTextSizeButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void initSizes() {
        mDefaultTextSize = getResources().getDimensionPixelSize(R.dimen.default_btn_text_size);
        mSelectedTextSize = getResources().getDimensionPixelSize(R.dimen.selected_btn_text_size);
        setTextSize(TypedValue.COMPLEX_UNIT_PX, mDefaultTextSize);
        setTextColor(getResources().getColor(android.R.color.black));
    }

    private void init() {
        setGravity(Gravity.CENTER);
        initSizes();
    }

    @Override
    public void dispatchSetSelected(boolean selected) {
        super.dispatchSetSelected(selected);
        setTextSize(TypedValue.COMPLEX_UNIT_PX, selected ? mSelectedTextSize : mDefaultTextSize);
        setTextColor(selected ? getResources().getColor(R.color.colorPrimary)
                : getResources().getColor(android.R.color.black));
    }
}
