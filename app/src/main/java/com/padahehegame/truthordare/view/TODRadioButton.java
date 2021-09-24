package com.padahehegame.truthordare.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioButton;

import com.padahehegame.truthordare.utils.Utils;

public class TODRadioButton extends RadioButton {
    public TODRadioButton(Context context) {
        super(context);
        Utils.setFont(this);
    }

    public TODRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        Utils.setFont(this);
    }

    public TODRadioButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Utils.setFont(this);
    }
}
