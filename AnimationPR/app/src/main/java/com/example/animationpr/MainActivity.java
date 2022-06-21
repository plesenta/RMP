package com.example.animationpr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button buttonTraslate, buttonRotate, buttonScale,buttonAlpha,buttonSet;
    ImageView imageView;

    Animation animTranslate;
    Animation animRotate, animScale, animAlpha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonTraslate = findViewById(R.id.Translate);
        buttonRotate = findViewById(R.id.Rotate);
        buttonScale = findViewById(R.id.ScaleB);
        buttonAlpha = findViewById(R.id.Alpha);
        buttonSet = findViewById(R.id.Seet);

        imageView = findViewById(R.id.imageView);

        animTranslate = AnimationUtils.loadAnimation(this,R.anim.translate);
        animRotate = AnimationUtils.loadAnimation(this,R.anim.rotate);
        animScale = AnimationUtils.loadAnimation(this,R.anim.scale);
        animAlpha = AnimationUtils.loadAnimation(this,R.anim.alpha);


        buttonTraslate.setOnClickListener(view ->{
            imageView.startAnimation(animTranslate);
        });

        buttonRotate.setOnClickListener(view ->{
            imageView.setAnimation(animRotate);
        });

        buttonScale.setOnClickListener(view ->{
            imageView.setAnimation(animScale);
        });

        buttonAlpha.setOnClickListener(view ->{
            imageView.setAnimation(animAlpha);
        });

        buttonSet.setOnClickListener(view ->{

        });


    }
}