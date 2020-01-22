package com.topachez.techfestregistrationjava;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class adminlogin extends AppCompatActivity {
    private static  final String TAG="adminlogin";
     FirebaseAuth fAuth;
     EditText etemail;
     EditText pass;
     Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminlogin);
        etemail=findViewById(R.id.editText2);
        pass=findViewById(R.id.editText3);
        b=findViewById(R.id.button3);
        fAuth = FirebaseAuth.getInstance();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=etemail.getText().toString().trim();
                String password=pass.getText().toString().trim();
                if(TextUtils.isEmpty(email))
                {
                    etemail.setError("Email cannot  be  empty");
                    return ;
                }
                if(TextUtils.isEmpty(password))
                {
                    pass.setError("Password is required");
                    return;
                }
                fAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(adminlogin.this,"Login Successful",Toast.LENGTH_SHORT).show();
                            Intent in=new Intent(getApplicationContext(),AccessDatabase.class);
                            startActivity(in);
                        }  else{
                            Toast.makeText(adminlogin.this,"Invalid Credentials",Toast.LENGTH_SHORT).show();
                        }
                    }
                });


            }
        });
    }

}
