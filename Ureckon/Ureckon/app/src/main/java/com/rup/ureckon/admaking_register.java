package com.rup.ureckon;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class admaking_register extends AppCompatActivity {

    private Button reg;
    private FirebaseAuth mAuth;
    private ImageView loc_imag;
    private String Uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admaking_register);


        reg = (Button) findViewById(R.id.event_reg);
        loc_imag = (ImageView) findViewById(R.id.venue_image);
        loc_imag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://bit.ly/2tQ9NSh");
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mAuth=FirebaseAuth.getInstance();
                FirebaseUser user=mAuth.getCurrentUser();
                // Uid=user.getUid();
                if(user==null)
                {
                    Toast.makeText(admaking_register.this, "First register for the app..", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent=new Intent(admaking_register.this, team_register.class);

                    intent.putExtra("event","admaking");
                    startActivity(intent);
                }
            }
        });
    }
}
