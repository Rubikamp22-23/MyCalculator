package com.example.mycalculator;

import android.media.Image;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mycalculator.databinding.ActivityMainBinding;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Double firstNumber,secondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.imageViewPlus.setOnClickListener(view -> {
            RotateAnimation rotateAnimation=new RotateAnimation(0, 180, RotateAnimation.RELATIVE_TO_SELF,
                    .5f, RotateAnimation.RELATIVE_TO_SELF
                    ,.5f);
            rotateAnimation.setDuration(1000);
            binding.imageViewPlus.startAnimation(rotateAnimation);

            if (TextUtils.isEmpty(binding.editTextFirstNumber.getText().toString()) || TextUtils.isEmpty(binding.editTextSecondNumber.getText().toString())){
                Toast.makeText(MainActivity.this, "Empty field not allowed!", Toast.LENGTH_SHORT).show();}


            firstNumber= Double.parseDouble( binding.editTextFirstNumber.getText().toString());
            secondNumber= Double.parseDouble(binding.editTextSecondNumber.getText().toString());
            binding.textViewAnswer.setText(firstNumber + secondNumber +"");

        });


        binding.imageViewMines.setOnClickListener(view -> {
            RotateAnimation rotateAnimation=new RotateAnimation(0, 180, RotateAnimation.RELATIVE_TO_SELF,
                    .5f, RotateAnimation.RELATIVE_TO_SELF
                    ,.5f);
            rotateAnimation.setDuration(1000);
            binding.imageViewMines.startAnimation(rotateAnimation);

            if (TextUtils.isEmpty(binding.editTextFirstNumber.getText().toString()) || TextUtils.isEmpty(binding.editTextSecondNumber.getText().toString())){
                Toast.makeText(MainActivity.this, "Empty field not allowed!", Toast.LENGTH_SHORT).show();}

            firstNumber= Double.parseDouble(binding.editTextFirstNumber.getText().toString());
            secondNumber= Double.parseDouble(binding.editTextSecondNumber.getText().toString());
            binding.textViewAnswer.setText(firstNumber - secondNumber + "");

        });


        binding.imageViewMultiplied.setOnClickListener(view -> {
            RotateAnimation rotateAnimation=new RotateAnimation(0, 180, RotateAnimation.RELATIVE_TO_SELF,
                    .5f, RotateAnimation.RELATIVE_TO_SELF
                    ,.5f);
            rotateAnimation.setDuration(1000);
            binding.imageViewMultiplied.startAnimation(rotateAnimation);

            if (TextUtils.isEmpty(binding.editTextFirstNumber.getText().toString()) || TextUtils.isEmpty(binding.editTextSecondNumber.getText().toString())){
                Toast.makeText(MainActivity.this, "Empty field not allowed!", Toast.LENGTH_SHORT).show();}

            firstNumber= Double.parseDouble(binding.editTextFirstNumber.getText().toString());
            secondNumber= Double.parseDouble(binding.editTextSecondNumber.getText().toString());
            binding.textViewAnswer.setText(firstNumber * secondNumber + "");
        });

        binding.imageViewDivided.setOnClickListener(view -> {
            RotateAnimation rotateAnimation=new RotateAnimation(0, 180, RotateAnimation.RELATIVE_TO_SELF,
                    .5f, RotateAnimation.RELATIVE_TO_SELF
                    ,.5f);
            rotateAnimation.setDuration(1000);
            binding.imageViewDivided.startAnimation(rotateAnimation);

            if (TextUtils.isEmpty(binding.editTextFirstNumber.getText().toString()) || TextUtils.isEmpty(binding.editTextSecondNumber.getText().toString())){
                Toast.makeText(MainActivity.this, "Empty field not allowed!", Toast.LENGTH_SHORT).show();}

            firstNumber= Double.parseDouble(binding.editTextFirstNumber.getText().toString());
            secondNumber= Double.parseDouble(binding.editTextSecondNumber.getText().toString());

            NumberFormat nf= NumberFormat.getInstance();
            nf.setMaximumFractionDigits(2);
            double num = Double.parseDouble(firstNumber / secondNumber + "");
            binding.textViewAnswer.setText(nf.format(num));

            if (secondNumber==0){
                binding.textViewAnswer.setText(":(");
                Toast.makeText(getBaseContext(), "Cannot divide by zero", Toast.LENGTH_SHORT).show();}
            else if (firstNumber==0 && secondNumber==0){
                binding.textViewAnswer.setText(":(");}

        });

    }
}