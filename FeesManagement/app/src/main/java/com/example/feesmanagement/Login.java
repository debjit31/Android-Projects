package com.example.feesmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {


    private Button btn;
    private TextView admin_reg;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        btn = (Button) findViewById(R.id.btn);
        admin_reg = (TextView) findViewById(R.id.admin_reg_text);
        admin_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, admin_register.class));
            }
        });
        email = (EditText) findViewById(R.id.email_in);
        final String email_str = email.getText().toString().trim();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email_str == "debjit16.dc@gmail.com")
                {
                    startActivity(new Intent(Login.this, admin.class));
                }
                else
                {
                    startActivity(new Intent(Login.this, students.class));
                }
            }
        });
    }
}
