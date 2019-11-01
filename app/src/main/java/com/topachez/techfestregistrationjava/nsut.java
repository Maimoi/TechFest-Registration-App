package com.topachez.techfestregistrationjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class nsut extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;
    TextView[] tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nsut);

        tv=new TextView[7];
        tv[0]=findViewById(R.id.tv4a);
        tv[1]=findViewById(R.id.tv4b);
        tv[2]=findViewById(R.id.tv4c);
        tv[3]=findViewById(R.id.tv4d);
        tv[4]=findViewById(R.id.tv4e);
        tv[5]=findViewById(R.id.tv4f);
        tv[6]=findViewById(R.id.tv4g);
        View.OnClickListener textClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t= (TextView)view;
                Intent intent= new Intent(getApplicationContext(),PopUp.class);
                intent.putExtra("event_name",t.getText().toString());
                startActivity(intent);
            }
        };
        for(int i=0; i<7; i++)
            tv[i].setOnClickListener(textClick);


        b1=findViewById(R.id.btn4a);
        b2=findViewById(R.id.btn4b);
        b3=findViewById(R.id.btn4c);
        b4=findViewById(R.id.btn4d);
        b5=findViewById(R.id.btn4e);
        b6=findViewById(R.id.btn4f);
        b7=findViewById(R.id.btn4g);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Blind Coding";

                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                String a="Netaji Subhas University of Technology";
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
                String a="Netaji Subhas University of Technology";
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
                String a="Netaji Subhas University of Technology";
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
                String a="Netaji Subhas University of Technology";
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
                String a="Netaji Subhas University of Technology";
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
                String a="Netaji Subhas University of Technology";
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
                String a="Netaji Subhas University of Technology";
                inti.putExtra("A",a);
                inti.putExtra("P" ,s);
                startActivity(inti);
            }
        });
    }

}
