package com.example.atomicprogress;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    //Initialise bottom navigation view
    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    MusicFragment musicFragment = new MusicFragment();
    QuotesFragment quotesFragment = new QuotesFragment();
    SettingsFragment settingsFragment = new SettingsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Bottom Navigation code!
        bottomNavigationView = findViewById(R.id.bottomNavigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch(item.getItemId()){
                    case R.id.homeNavigation:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
                        return true;
                    case R.id.musicNavigation:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,musicFragment).commit();
                        return true;
                    case R.id.quoteNavigation:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,quotesFragment).commit();
                        return true;
                    case R.id.settingsNavigation:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,settingsFragment).commit();
                        return true;


                }
                return false;
            }
        });

        //
    }
}