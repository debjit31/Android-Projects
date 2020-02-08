package com.rup.ureckon;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.view.View;
import android.graphics.Color;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.VideoView;

public class HomeActivity extends AppCompatActivity {

    private TextView explore;
    private VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



    }



}
