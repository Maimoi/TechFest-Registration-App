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
        t1.setText(str);
        if(str.equals("Blind Coding"))
            t2.setText(R.string.bc);
        else if(str.equals("Code In Less"))
            t2.setText(R.string.cil);
        else if(str.equals("Segfault"))
            t2.setText(R.string.sf);
        else if(str.equals("Switcheroo"))
            t2.setText(R.string.sr);
        else if(str.equals("Algorama"))
            t2.setText(R.string.ar);
        else if(str.equals("Code Rash"))
            t2.setText(R.string.cr);
        else if(str.equals("Euler Games"))
            t2.setText(R.string.eg);
        else
            t2.setText(R.string.desc);

    }
}
