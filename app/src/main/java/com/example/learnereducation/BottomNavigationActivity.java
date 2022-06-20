package com.example.learnereducation;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import io.ak1.BubbleTabBar;
import io.ak1.OnBubbleClickListener;
import me.ibrahimsn.lib.OnItemSelectedListener;
import me.ibrahimsn.lib.SmoothBottomBar;

public class BottomNavigationActivity extends AppCompatActivity {
    SmoothBottomBar bottomBar;
    BubbleTabBar bubbleTabBar;
    BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        initView();
    }

    private void initView() {
        bottomNav = findViewById(R.id.bottomNav);

        FragmentTransaction homeTrans = getSupportFragmentManager().beginTransaction();
        homeTrans.replace(R.id.frame, new HomeFragment());
        homeTrans.commit();

bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (item.getItemId()) {
                    case R.id.home:
                        transaction.replace(R.id.frame, new HomeFragment());
//                        Toast.makeText(BottomNavigationActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.chat:
                        transaction.replace(R.id.frame, new ChatFragment());
//                        Toast.makeText(BottomNavigationActivity.this, "chat", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.notification:
                        transaction.replace(R.id.frame, new NotificationFragment());
//                        Toast.makeText(BottomNavigationActivity.this, "note", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.user:
                        transaction.replace(R.id.frame, new UserFragment());
//                        Toast.makeText(BottomNavigationActivity.this, "user", Toast.LENGTH_SHORT).show();
                        break;
                }
                transaction.commit();
        return true;
    }
});

    }
}