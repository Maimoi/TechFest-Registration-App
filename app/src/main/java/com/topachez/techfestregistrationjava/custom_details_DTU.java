package com.topachez.techfestregistrationjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class custom_details_DTU extends AppCompatActivity {
    EditText name,email,college;
    Button upload;
    String username,email1,college1;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_details__dtu);
        this.setTitle("Please Enter The Data");
        name=findViewById(R.id.name);
        email=findViewById(R.id.uemail);
        college=findViewById(R.id.college);
        upload=findViewById(R.id.Upload);
        firebaseDatabase=FirebaseDatabase.getInstance();
        Intent in=getIntent();
        String a=in.getStringExtra("A");
        databaseReference=firebaseDatabase.getReference(a);




        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username=name.getText().toString().trim();
                email1=email.getText().toString().trim();
                college1=college.getText().toString().trim();

                if(TextUtils.isEmpty(username))
                {
                    Toast.makeText(getApplicationContext(), "Name cannot be Empty!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(email1))
                {
                    Toast.makeText(getApplicationContext(), "Email cannot be Empty!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(college1))
                {
                    Toast.makeText(getApplicationContext(), "College cannot be Empty!", Toast.LENGTH_SHORT).show();
                    return;
                }
                Student info=new Student(username,email1,college1);
                Intent intent=getIntent();
                String s=intent.getStringExtra("P");
                databaseReference.child(s).child(username).setValue(info);
                Toast.makeText(getApplicationContext(), "Registration Successful!", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
