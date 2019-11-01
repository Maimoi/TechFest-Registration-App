package com.topachez.techfestregistrationjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
                String s="Blind Coding";
                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                inti.putExtra("P",s);
                startActivity(inti);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a="Code In Less";

                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                inti.putExtra("P" ,a);
                startActivity(inti);
            }
        });

    }
}
