package com.example.feesmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class admin_register extends AppCompatActivity {


    private Button reg;
    private EditText admin_name, admin_email;

    int add_admin(String name, String email)
    {
        /// Add firebase code for adding user to database.
        Toast.makeText(this, name + ' ' + email, Toast.LENGTH_SHORT).show();
        return  1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_register);

        reg = (Button) findViewById(R.id.reg_btn);
        admin_name = (EditText) findViewById(R.id.admin_name);
        admin_email = (EditText) findViewById(R.id.admin_email);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, email;
                name = admin_name.toString();
                email = admin_email.toString();
                int r = add_admin(name, email);
                if(r == 1)
                    Toast.makeText(admin_register.this, "Admin Account Created!!!", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(admin_register.this, "Account Creation Failed!!!!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(admin_register.this, Login.class));
            }
        });
    }
}
