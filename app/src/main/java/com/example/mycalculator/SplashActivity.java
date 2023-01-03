package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.mycalculator.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {

    private ActivitySplashBinding binding;

    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Animations
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.move_top);
        binding.textViewWelcome.setAnimation(animation);

        Animation animation1 =  AnimationUtils.loadAnimation(this, R.anim.move_right);
        binding.spPlus.setAnimation(animation1);
        binding.spMultiplied.setAnimation(animation1);

        Animation animation2 =  AnimationUtils.loadAnimation(this, R.anim.move_left);
        binding.spMines.setAnimation(animation2);
        binding.spDivided.setAnimation(animation2);

        //Handler
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));

                finish();}
        },6000);
    }
}