package com.example.storingdatainfirebase;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    private DatabaseReference mdatabase;
    private Button btn1;

    private EditText mname;
    private EditText memail;
    private EditText mcontact;
    private EditText mstream;
    private EditText msection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.submit_btn);
        mdatabase= FirebaseDatabase.getInstance().getReference();

        mname = (EditText) findViewById(R.id.name_ed);
        memail = (EditText) findViewById(R.id.email_ed);
        mcontact = (EditText) findViewById(R.id.cont_ed);
        mstream = (EditText) findViewById(R.id.stream_ed);
        msection = (EditText) findViewById(R.id.section_ed);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    String name = mname.getText().toString();
                    String email = memail.getText().toString();
                    String contact = mcontact.getText().toString();
                    String stream = mstream.getText().toString();
                    String section = msection.getText().toString();

                    HashMap<String, String> dataMap = new HashMap<String, String>();
                    dataMap.put("Name" , name);
                    dataMap.put("Email", email);
                    dataMap.put("Contact", contact);
                    dataMap.put("Stream", stream);
                    dataMap.put("Section", section);


                    mdatabase.push().setValue(dataMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(MainActivity.this, "Succes!!", Toast.LENGTH_SHORT).show();
                            }else{
                                Toast.makeText(MainActivity.this, "Failure!!", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                    mname.setText("");
                    memail.setText("");

                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Error" + e, Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
