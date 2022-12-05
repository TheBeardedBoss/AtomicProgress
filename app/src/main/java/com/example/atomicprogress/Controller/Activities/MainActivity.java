package com.example.atomicprogress.Controller.Activities;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.atomicprogress.Controller.Fragments.ExcerciseFragment;
import com.example.atomicprogress.Controller.Fragments.HomeFragment;
import com.example.atomicprogress.Controller.Fragments.MusicFragment;
import com.example.atomicprogress.Controller.Fragments.QuotesFragment;
import com.example.atomicprogress.Controller.Fragments.SettingsFragment;
import com.example.atomicprogress.Model.Repository.ExercisesRepositoryFactory;
import com.example.atomicprogress.Model.Repository.HardcodedExercisesRepository;
import com.example.atomicprogress.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    //Initialise bottom navigation view
    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    MusicFragment musicFragment = new MusicFragment();
    QuotesFragment quotesFragment = new QuotesFragment();
    ExcerciseFragment excerciseFragment = new ExcerciseFragment();
    SettingsFragment settingsFragment = new SettingsFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Bottom Navigation code!
        bottomNavigationView = findViewById(R.id.bottomNavigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
        showFragment(homeFragment);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch(item.getItemId()){
                    case R.id.homeNavigation:
                        showFragment(homeFragment);
                        return true;
                    case R.id.musicNavigation:
                        showFragment(musicFragment);
                        return true;
                    case R.id.quoteNavigation:
                        showFragment(quotesFragment);
                        return true;
                    case R.id.exerciseNavigation:
                        showFragment(excerciseFragment);
                        return true;
                    case R.id.settingsNavigation:
                        showFragment(settingsFragment);
                        return true;


                }
                return false;
            }
        });




        //
    }

    private void showFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
    }
}