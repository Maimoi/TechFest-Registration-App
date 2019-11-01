package com.topachez.techfestregistrationjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class iitd extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iitd);
        b1=findViewById(R.id.btn2a);
        b2=findViewById(R.id.btn2b);
        b3=findViewById(R.id.btn2c);
        b4=findViewById(R.id.btn2d);
        b5=findViewById(R.id.btn2e);
        b6=findViewById(R.id.btn2f);
        b7=findViewById(R.id.btn2g);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Blind Coding";

                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                String a="Indian Institute of Technology Delhi";
                inti.putExtra("A",a);
                inti.putExtra("P",s);
                startActivity(inti);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Code In Less";

                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                String a="Indian Institute of Technology Delhi";
                inti.putExtra("A",a);
                inti.putExtra("P" ,s);
                startActivity(inti);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Code Rash";

                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                String a="Indian Institute of Technology Delhi";
                inti.putExtra("A",a);
                inti.putExtra("P" ,s);
                startActivity(inti);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Switchroo";

                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                String a="Indian Institute of Technology Delhi";
                inti.putExtra("A",a);
                inti.putExtra("P" ,s);
                startActivity(inti);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Euler Games";

                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                String a="Indian Institute of Technology Delhi";
                inti.putExtra("A",a);
                inti.putExtra("P" ,s);
                startActivity(inti);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Segfault";

                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                String a="Indian Institute of Technology Delhi";
                inti.putExtra("A",a);
                inti.putExtra("P" ,s);
                startActivity(inti);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Algorama";

                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                String a="Indian Institute of Technology Delhi";
                inti.putExtra("A",a);
                inti.putExtra("P" ,s);
                startActivity(inti);
            }
        });
    }

}
