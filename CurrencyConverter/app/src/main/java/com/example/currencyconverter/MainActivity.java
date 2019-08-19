package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


public void convCurr(View view)
{
    EditText curr = (EditText) findViewById(R.id.currrencyEdittext);
    
    Double dollarNumber = Double.parseDouble(curr.getText().toString());
    
    Double rupeeNumber = dollarNumber * 71.50;

    Toast.makeText(MainActivity.this, String.format("%.2f", rupeeNumber), Toast.LENGTH_SHORT).show();


}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
