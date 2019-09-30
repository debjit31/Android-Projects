package com.example.animations;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView bart;
    private ImageView homer;

    public void fade_homer() {
        /*Homer leaves sideways and bart enters the screen*/


        // move down from screen animation
        //bart.animate().translationYBy(1920).setDuration(1000);
        // move from the screen sideways
        // Rotate bart 180 degress
        bart.animate().rotation(-180f).setDuration(1000);
        bart.animate().translationXBy(1000f).setDuration(1000);

        homer.animate().translationXBy(-1050f).setDuration(1000);

        //fade in and fade out animation
        //homer.animate().alpha(1f).setDuration(1500);
    }

    public void fade_bart() {
        /*Bart leaves sideways and homer enters the screen*/

        bart.animate().translationXBy(-1000).setDuration(1000);
        //Rotate homer 180 degrees
        homer.animate().rotation(-180f).setDuration(1000);
        homer.animate().translationXBy(1050f).setDuration(1000);
    }

    public void scale_bart(){
        bart.animate().scaleX(0.5f).scaleY(0.5f).setDuration(500);
    }

    public void scale_homer(){
       bart.animate().translationXBy(1000f).rotation(360f).scaleX(1f).scaleY(1f).setDuration(3000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bart = (ImageView) findViewById(R.id.bart);
        homer = (ImageView) findViewById(R.id.homer);

        bart.setTranslationX(-1000f);

        //homer.animate().rotation(180f).setDuration(1000);*/

        bart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fade_bart();
                scale_bart();
            }
        });
        homer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fade_homer();
                scale_homer();
            }
        });

    }
}
