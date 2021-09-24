package com.padahehegame.truthordare.types;

import android.content.Context;

import com.padahehegame.truthordare.R;
import com.padahehegame.truthordare.utils.PreferenceUtils;
import com.padahehegame.truthordare.utils.StaticEnum;
import com.padahehegame.truthordare.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class GameMode extends StaticEnum {
    public static final GameMode ADULT = new GameMode("ADULT", "ADULT", "Adult", Boolean.TRUE.booleanValue(), "DEWASA", R.drawable.mode_adult);

    public static final GameMode KIDS = new GameMode("KIDS", "KIDS", "Kids", Boolean.TRUE.booleanValue(), "ANAK", R.drawable.mode_kids);
    public static final GameMode TEEN = new GameMode("TEEN", "TEEN", "Teen", Boolean.TRUE.booleanValue(), "REMAJA", R.drawable.mode_teen);
    public String modeName;
    public int modeImg;
    private boolean shouldShow = Boolean.TRUE.booleanValue();
    private static final GameMode[] ALL_MODES = new GameMode[]{KIDS, TEEN, ADULT};

    private GameMode(String name, String value, String description, boolean shouldShow, String modeName, int modeImg) {
        super(name, value, description);
        this.shouldShow = shouldShow;
        this.modeName = modeName;
        this.modeImg = modeImg;
    }

    public static GameMode[] getAllModes() {
        return ALL_MODES;
    }

    public static List<GameMode> getGameModes(Context context) {
        List<GameMode> modes = new ArrayList();
        for (GameMode mode : getAllModes()) {
            if (mode.shouldShow) {
                modes.add(mode);
            } else if (PreferenceUtils.getBoolean(context, mode.getPrefKeyName()).booleanValue()) {
                modes.add(mode);
            }
        }
        return modes;
    }

    private String getPrefKeyName() {
        return Utils.PREF_PREFIX + getName();
    }

    public static GameMode forName(String name) {
        return (GameMode) StaticEnum.forName(getAllModes(), name);
    }
}
