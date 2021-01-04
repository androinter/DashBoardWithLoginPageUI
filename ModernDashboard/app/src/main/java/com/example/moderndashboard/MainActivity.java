package com.example.moderndashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageView clover,background;
    LinearLayout splashtext,hometext,menus;
    Animation frombottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clover = findViewById(R.id.clover);
        background = findViewById(R.id.background);
        splashtext = findViewById(R.id.splashtext);
        hometext = findViewById(R.id.hometext);
        menus = findViewById(R.id.menu);

        frombottom = AnimationUtils.loadAnimation(this,R.anim.from_bottom);

        background.animate().translationY(-1200).setDuration(800).setStartDelay(300);
        clover.animate().alpha(0).setDuration(800).setStartDelay(800);
        splashtext.animate().translationY(140).alpha(0).setDuration(800).setStartDelay(300);
        hometext.startAnimation(frombottom);
        menus.startAnimation(frombottom);

    }
}
