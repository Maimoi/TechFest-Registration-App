package com.topachez.techfestregistrationjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class igdtuw extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;
    TextView[] tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_igdtuw);

        tv=new TextView[7];
        tv[0]=findViewById(R.id.tv5a);
        tv[1]=findViewById(R.id.tv5b);
        tv[2]=findViewById(R.id.tv5c);
        tv[3]=findViewById(R.id.tv5d);
        tv[4]=findViewById(R.id.tv5e);
        tv[5]=findViewById(R.id.tv5f);
        tv[6]=findViewById(R.id.tv5g);
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


        b1=findViewById(R.id.btn5a);
        b2=findViewById(R.id.btn5b);
        b3=findViewById(R.id.btn5c);
        b4=findViewById(R.id.btn5d);
        b5=findViewById(R.id.btn5e);
        b6=findViewById(R.id.btn5f);
        b7=findViewById(R.id.btn5g);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Blind Coding";

                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                String a="Indira Gandhi Delhi Technical University for Women";
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
                String a="Indira Gandhi Delhi Technical University for Women";
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
                String a="Indira Gandhi Delhi Technical University for Women";
                inti.putExtra("A",a);
                inti.putExtra("P" ,s);
                startActivity(inti);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Switcheroo";

                Intent inti=new Intent(getApplicationContext(),custom_details_DTU.class);
                String a="Indira Gandhi Delhi Technical University for Women";
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
                String a="Indira Gandhi Delhi Technical University for Women";
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
                String a="Indira Gandhi Delhi Technical University for Women";
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
                String a="Indira Gandhi Delhi Technical University for Women";
                inti.putExtra("A",a);
                inti.putExtra("P" ,s);
                startActivity(inti);
            }
        });

    }
}
