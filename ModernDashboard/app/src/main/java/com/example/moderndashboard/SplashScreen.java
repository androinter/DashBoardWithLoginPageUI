package com.example.moderndashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class SplashScreen extends AppCompatActivity {

    RelativeLayout relativeLayout1,relativeLayout2;
    Button login;

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            relativeLayout1.setVisibility(View.VISIBLE);
            relativeLayout2.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        relativeLayout1 = findViewById(R.id.relativeid);
        relativeLayout2 = findViewById(R.id.relative2);
        login = findViewById(R.id.loginid);

        handler.postDelayed(runnable,2000);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
