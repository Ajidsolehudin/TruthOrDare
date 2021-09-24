package com.padahehegame.truthordare.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

import com.padahehegame.truthordare.utils.Utils;

public class TODEditText extends EditText {
    public TODEditText(Context context) {
        super(context);
        Utils.setFont(this);
    }

    public TODEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        Utils.setFont(this);
    }

    public TODEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Utils.setFont(this);
    }
}
