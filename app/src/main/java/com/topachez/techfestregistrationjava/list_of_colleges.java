package com.topachez.techfestregistrationjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class list_of_colleges extends AppCompatActivity {
    EditText et;
    ListView l;
    TextView tv;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_colleges);
         et=findViewById(R.id.editText);
         l=findViewById(R.id.listView);
         tv=findViewById(R.id.clg_name);
        ArrayList<String> names= new ArrayList<>();
        names.add("Delhi Technological University");
        names.add("Indian Institute of Technology Delhi");
        names.add("Maharaja Agrasen Institute of Technology");

         adapter= new ArrayAdapter<>(this,R.layout.list_item,names);
        l.setAdapter(adapter);
        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                (list_of_colleges.this).adapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent intent=new Intent(getApplicationContext(),dtu.class);
                    startActivity(intent);
                }
                else if(position==1){
                    Intent intent=new Intent(getApplicationContext(),iitd.class);
                    startActivity(intent);
                }
                else if(position==2){
                    Intent intent=new Intent(getApplicationContext(),mait.class);
                    startActivity(intent);
                }
            }
        });

    }
}
