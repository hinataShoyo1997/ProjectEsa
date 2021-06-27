package com.example.projectesa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    TextView mGetStartedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        mGetStartedBtn = findViewById(R.id.get_started);
        mGetStartedBtn.setOnClickListener(view -> {
                Intent goLogin = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(goLogin);
                finish();
        });
    }
}