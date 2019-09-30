package com.example.practiceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private int c = 0;
    public void clickFunction(View view){

        c++;
        if(c > 9)
        {
            Log.w("Warning", "You have pressed more than 9 times!!!!!!\n Your Count will again start from 0");
            c=0;
        }
        else
            Log.i("Count", "You have pressed "+ c + "times");

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
