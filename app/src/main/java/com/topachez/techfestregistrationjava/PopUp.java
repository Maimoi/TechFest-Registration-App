package com.topachez.techfestregistrationjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class PopUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int w=dm.widthPixels;
        int h=dm.heightPixels;

        getWindow().setLayout((int)(w*.9),(int)(h*.7));

        Intent intent=getIntent();
        String str;
        str=intent.getExtras().getString("event_name");
        TextView t1= findViewById(R.id.tvp1);
        TextView t2=findViewById(R.id.tvp2);
        t2.setText(R.string.desc);
        t1.setText(str);
    }
}
