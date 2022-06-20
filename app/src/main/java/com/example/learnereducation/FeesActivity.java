package com.example.learnereducation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FeesActivity extends AppCompatActivity {
AppCompatButton nextBtn;
TextView skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fees);
        initView();
    }

    private void initView() {
        nextBtn = findViewById(R.id.nextBtn);
        skip = findViewById(R.id.skip);

        nextBtn.setOnClickListener(view -> {
            Intent intent =  new Intent(FeesActivity.this,GurdianActivity.class);
            startActivity(intent);
            finish();
        });

        skip.setOnClickListener(view -> {
            Intent intent = new Intent(FeesActivity.this,HomeActivity.class);
            startActivity(intent);
            finish();
        });
    }
}