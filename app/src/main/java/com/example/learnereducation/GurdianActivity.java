package com.example.learnereducation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class GurdianActivity extends AppCompatActivity {
    AppCompatButton accessBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gurdian);
        initView();
    }

    private void initView() {
        accessBtn = findViewById(R.id.accessBtn);

        accessBtn.setOnClickListener(view -> {
           Intent intent = new Intent(GurdianActivity.this,HomeActivity.class);
           startActivity(intent);
           finish();
        });
    }
}