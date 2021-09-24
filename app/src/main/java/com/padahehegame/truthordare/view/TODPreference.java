package com.padahehegame.truthordare.view;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import com.padahehegame.truthordare.utils.Utils;

public class TODPreference extends Preference {
    public TODPreference(Context context) {
        super(context);
    }

    public TODPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TODPreference(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    protected void onBindView(View view) {
        super.onBindView(view);
        Utils.setFont((TextView) view.findViewById(16908310));
        Utils.setFont((TextView) view.findViewById(16908304));
    }
}
