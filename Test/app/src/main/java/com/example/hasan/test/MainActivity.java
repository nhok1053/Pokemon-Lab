package com.example.hasan.test;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView img_setting;
    MediaPlayer mediaPlayer;
    ImageView img_play;
    TextView tv_highscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        img_setting = (ImageView) findViewById(R.id.btn_setting);
        img_play = (ImageView) findViewById(R.id.btn_play);
        tv_highscore = (TextView) findViewById(R.id.tv_highscore);
        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/PoplarStd.ttf");
        tv_highscore.setTypeface(type);
        mediaPlayer = MediaPlayer.create(this, R.raw.pokemon);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);

        addListener();
    }

    @Override
    protected void onPause() {
        mediaPlayer.stop();

    }

    private void addListener() {

        img_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                SettingFragment settingFragment = new SettingFragment();
                fragmentTransaction.replace(R.id.activity_main, settingFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        img_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                PlayFragment playFragment = new PlayFragment();
                fragmentTransaction.replace(R.id.activity_main, playFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
}
