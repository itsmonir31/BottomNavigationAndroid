package com.example.meowbottomnavigation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MeowBottomNavigation meowBottomNavigation = findViewById(R.id.bottom_Nav_bar);

        meowBottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.fav));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.home));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.comment));

        meowBottomNavigation.show(1, true);
    }
}