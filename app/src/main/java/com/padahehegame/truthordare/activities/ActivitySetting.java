package com.padahehegame.truthordare.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.padahehegame.truthordare.R;
import com.padahehegame.truthordare.base.BaseActivity;
import com.padahehegame.truthordare.types.QuestionType;
import com.padahehegame.truthordare.utils.PreferenceUtils;
import com.padahehegame.truthordare.utils.SoundUtils;
import com.padahehegame.truthordare.utils.StringUtils;
import com.padahehegame.truthordare.utils.Utils;

public class ActivitySetting extends BaseActivity {



    TextView txtSound;
    private static String soundOn;
    private static String soundOff;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_setting);



        //iklan
        AdRequest adRequests = new AdRequest.Builder().build();
        AdView adView = findViewById(R.id.adView);
        adView.loadAd(adRequests);

        Utils.setFont(((TextView)findViewById(R.id.txtTitle)));
        txtSound = findViewById(R.id.soundTxt);
        /*setButtonsHeightWidhth(((LinearLayout)findViewById(R.id.layAddTruth)));
        setButtonsHeightWidhth(((LinearLayout)findViewById(R.id.layAddDare)));
        setButtonsHeightWidhth(((LinearLayout)findViewById(R.id.laySound)));
        setButtonsHeightWidhth(((LinearLayout)findViewById(R.id.layShare)));
        setButtonsHeightWidhth(((LinearLayout)findViewById(R.id.layClose)));*/


        soundHandler(((LinearLayout) findViewById(R.id.laySound)), txtSound);
        System.gc();

        txtSound.setText("SOUND");

        soundOn = getResources().getString(R.string.sound_on);
        soundOff = getResources().getString(R.string.sound_off);


    }


    public void onClick(View view) {

        if (view.getId() == R.id.layAddTruth) {
            Utils.selectedQuestionType = (QuestionType) StringUtils.checkBlank(QuestionType.TRUTH, QuestionType.TRUTH);
            startActivity(new Intent(ActivitySetting.this, ActivityAddingDareOrTruth.class));

        } else if (view.getId() == R.id.layAddDare) {

            Utils.selectedQuestionType = (QuestionType) StringUtils.checkBlank(QuestionType.DARE, QuestionType.TRUTH);
            startActivity(new Intent(ActivitySetting.this, ActivityAddingDareOrTruth.class));

        } else if (view.getId() == R.id.laySound) {

            toggleSound((LinearLayout) view, txtSound);

        } else if (view.getId() == R.id.layShare) {

            SoundUtils.buttonOnClick(this);
            try {
                Intent i = new Intent("android.intent.action.SEND");
                i.setType("text/plain");
                i.putExtra("android.intent.extra.SUBJECT", "Truth or Dare");
                i.putExtra("android.intent.extra.TEXT", "Ayo mainkan Truth or Dare Islami bareng temen kamu,\nBanyak main banyak manfaat\n\nhttps://play.google.com/store/apps/details?id=" + getPackageName());
                startActivity(Intent.createChooser(i, "Choose one"));
            } catch (Exception e) {
                Log.e("error-->>", "Exception occurred while sharing app.", e);
            }

        } else if (view.getId() == R.id.layClose) {

            finish();
        }
    }




    public static void toggleSound(LinearLayout button, TextView txt) {
        PreferenceUtils.toggleSound(button.getContext());
        Utils.btnClickSound(button.getContext());
        soundHandler(button, txt);
    }

    public static void soundHandler(LinearLayout button, TextView txt) {
        if (PreferenceUtils.isSoundOn(button.getContext()).booleanValue()) {


            txt.setText(soundOn);
        } else {
            txt.setText(soundOff);
        }
        button.setBackgroundResource(PreferenceUtils.isSoundOn(button.getContext()).booleanValue() ? R.drawable.background_effect : R.drawable.background_effect);
    }


}
