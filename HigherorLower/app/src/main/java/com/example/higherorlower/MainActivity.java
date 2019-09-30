package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText t1;
    private Button btn;
    int randomNumber;

    public void createToast(String string){
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (EditText) findViewById(R.id.input_ed);
        btn = (Button) findViewById(R.id.clickbtn);

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
        System.out.print(randomNumber);


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int n = Integer.parseInt(t1.getText().toString());
                if (n > randomNumber){

                    createToast("Your guess is  Higher!!");
                    t1.setText("");

                }else if (n  < randomNumber){
                    createToast("Your guess is Lower!!!");
                    t1.setText("");
                }
                else
                {
                    createToast("Your guess is right!! Try again with a new Number.");
                    t1.setText("");

                    Random rand = new Random();
                    randomNumber = rand.nextInt(20) + 1;

                }
            }
        });
    }
}
