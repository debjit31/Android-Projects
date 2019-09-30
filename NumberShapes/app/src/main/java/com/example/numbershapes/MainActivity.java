package com.example.numbershapes;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText ed1;
    private Button btn;

    // nested class inside MainActivity
    class Number {

        private int number;

        Number(int number) {
            this.number = number;
        }

        public boolean checkTriangularNumber() {
            int x = 1;
            int triangularNumber = 1;
            while (triangularNumber < number) {

                x++;
                triangularNumber += x;
            }
            if (triangularNumber == number) {
                return true;
            } else {
                return false;
            }
        }

        public boolean checkSquareNumber() {
            int f = 0;

            for (int i = 1; i <= number; i++) {
                if (number == i * i) {
                    f = 1;
                    break;
                }

            }
            if (f == 1)
                return true;
            else
                return false;

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ed1 = (EditText) findViewById(R.id.ed1);
        btn = (Button) findViewById(R.id.check_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    int n = Integer.parseInt(ed1.getText().toString());
                    Number myNumber = new Number(n);
                    if (myNumber.checkTriangularNumber() && myNumber.checkSquareNumber()) {
                        Toast.makeText(MainActivity.this, "Both Triangular and Square", Toast.LENGTH_SHORT).show();
                    } else if (myNumber.checkSquareNumber()) {
                        Toast.makeText(MainActivity.this, "Square but not Triangular", Toast.LENGTH_SHORT).show();
                    } else if (myNumber.checkTriangularNumber()) {
                        Toast.makeText(MainActivity.this, "Triangular but not Square", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Neither Square nor Triangular", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Error : " +" " +e + "Please enter a Number!!!", Toast.LENGTH_SHORT).show();
                }
                finally {
                    ed1.setText("");
                }

            }
        });


    }
}
