package com.example.modernuiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    private Button btn;
    private ImageView img;

    public void animation(){

        img.animate().alpha(0f).setDuration(750);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img.animate().scaleX(1f).scaleY(1f).setDuration(1000);

        btn = (Button) findViewById(R.id.btn1);
        img = (ImageView) findViewById(R.id.image1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation();
            }
        });
    }
}
