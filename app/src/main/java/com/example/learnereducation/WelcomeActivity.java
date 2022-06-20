package com.example.learnereducation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    AppCompatButton startedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initView();
    }

    private void initView() {
        startedBtn = findViewById(R.id.startedBtn);

        startedBtn.setOnClickListener(view -> {
            Intent intent =  new Intent(WelcomeActivity.this,FeesActivity.class);
            startActivity(intent);
            finish();
        });
    }
}