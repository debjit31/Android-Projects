package com.example.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button imgBtn;
    private Button actBtn;
    private ImageView catImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Activity 1");

        imgBtn = (Button) findViewById(R.id.button2);
        actBtn = (Button) findViewById(R.id.button3);

        catImage = (ImageView) findViewById(R.id.catView);
        catImage.setImageResource(R.drawable.cat1);

        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    catImage.setImageResource(R.drawable.cat2);
            }
        });

        actBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public void openActivity2()
    {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }



    }