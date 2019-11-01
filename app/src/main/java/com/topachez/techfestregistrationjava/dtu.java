package com.topachez.techfestregistrationjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dtu extends AppCompatActivity {
      Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dtu);
        b1=findViewById(R.id.btn1a);
        b2=findViewById(R.id.btn1b);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                startActivity(inti);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                startActivity(inti);
            }
        });

    }
}
