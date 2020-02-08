package com.example.about;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button github1, github2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        github1 = (Button) findViewById(R.id.github);
        github2 = (Button) findViewById(R.id.github2);


        github1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://m.facebook.com/ankit.mazumder.9");
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        github2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.facebook.com/souvik.mallick.9235");
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }
}
