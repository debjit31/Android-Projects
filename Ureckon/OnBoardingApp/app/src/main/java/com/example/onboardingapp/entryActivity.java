package com.example.onboardingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class entryActivity extends AppCompatActivity {

    private Button dev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);


        dev = (Button) findViewById(R.id.devbtn);
        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(entryActivity.this, MainActivity.class));
            }
        });

    }
}
