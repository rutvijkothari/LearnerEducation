package com.example.learnereducation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;

public class HomeActivity extends AppCompatActivity {

    AppCompatButton meetBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();

    }

    private void initView() {
        meetBtn = findViewById(R.id.meetBtn);

        meetBtn.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this,BottomNavigationActivity.class);
            startActivity(intent);
            finish();
        });
    }

}