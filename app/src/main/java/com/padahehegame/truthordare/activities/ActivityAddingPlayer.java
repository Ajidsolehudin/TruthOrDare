package com.padahehegame.truthordare.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.padahehegame.truthordare.R;
import com.padahehegame.truthordare.adapter.SimplestAdapter;
import com.padahehegame.truthordare.base.BaseActivity;
import com.padahehegame.truthordare.database.DBTruthDareAdapter;
import com.padahehegame.truthordare.model.Player;
import com.padahehegame.truthordare.utils.StringUtils;
import com.padahehegame.truthordare.utils.Utils;

public class ActivityAddingPlayer extends BaseActivity {
    private static String TAG = ActivityAddingPlayer.class.getSimpleName();
    SimplestAdapter adapter;

    public static class ViewHolder extends SimplestAdapter.ViewHolder<Player> {
        private TextView playerName;
        private ImageView removeBtn;

        public ViewHolder(View view) {
            super(view);
            this.playerName = (TextView) view.findViewById(R.id.tv_question);
            this.removeBtn = (ImageView) view.findViewById(R.id.iv_remove);
            Utils.setFont(this.playerName);
        }

        public void setData(final Context context, final Player player) {
            this.playerName.setText(player.playerName);
            this.removeBtn.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    Utils.btnClickSound(context);
                    DBTruthDareAdapter.Delete_Player(context, player.id);
                    ActivityAddingPlayer.getListUpdate(context, ViewHolder.this.getAdapter());
                }
            });
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_adding_players);

        //iklan
        AdRequest adRequest = new AdRequest.Builder().build();
        AdView adView = findViewById(R.id.adView);
        adView.loadAd(adRequest);

        Utils.players = DBTruthDareAdapter.Get_players(getApplicationContext());
        ListView playerListView = (ListView) findViewById(R.id.lv_players);
        this.adapter = new SimplestAdapter(getApplicationContext(), ViewHolder.class, R.layout.item_cell_player, Utils.players);
        playerListView.setAdapter(this.adapter);
//      Utils.setFont((EditText) findViewById(R.id.etPlayerName));
        Utils.setFont((TextView) findViewById(R.id.txtAddPlayerTitle));

        ((LinearLayout) findViewById(R.id.layPlay)).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (DBTruthDareAdapter.Get_players(getApplicationContext()).size() >= 2) {
                    Utils.btnClickSound(getApplicationContext());
                        startActivity(new Intent(ActivityAddingPlayer.this, ActivityGamePlay.class));
                    return;
                }
                Toast.makeText(ActivityAddingPlayer.this, "Minimal 2 pemain", Toast.LENGTH_LONG).show();
            }
        });

        ((LinearLayout) findViewById(R.id.layBack)).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }


    @SuppressLint("WrongConstant")
    public void addPlayer(View view) {
        EditText ET_playerName = (EditText) findViewById(R.id.etPlayerName);
        String playerName = (String) StringUtils.subNulls(ET_playerName.getText().toString());
        Utils.players = DBTruthDareAdapter.Get_players(getApplicationContext());
        if (Utils.players.size() >= Utils.MAX_NO_OF_PLAYERS) {
            Toast.makeText(ActivityAddingPlayer.this, "Batas maksimum " + Utils.MAX_NO_OF_PLAYERS + " Pemain.", Toast.LENGTH_LONG).show();
            return;
        }
        if (playerName != null) {
            DBTruthDareAdapter.Add_Player(this, new Player(playerName.trim()));
            Utils.btnClickSound(getApplicationContext());
            getListUpdate(getApplicationContext(), this.adapter);
            ET_playerName.setText("");
        } else {
            Toast.makeText(ActivityAddingPlayer.this, "Nama pemain gak boleh kosong ", Toast.LENGTH_LONG).show();

        }
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }


    public static void getListUpdate(Context context, SimplestAdapter adapter) {
        adapter.setData(DBTruthDareAdapter.Get_players(context));
        adapter.notifyDataSetChanged();
    }

}
