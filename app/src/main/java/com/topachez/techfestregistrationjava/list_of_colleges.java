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
        names.add("Indraprastha Institute of Information Technology Delhi");
        names.add("Netaji Subhas University of Technology");
        names.add("Maharaja Agrasen Institute of Technology");
        names.add("Indira Gandhi Delhi Technical University for Women");
        names.add("University School of Information, Communication and Technology");
        names.add("National Institute of Technology Delhi");
        names.add("Maharaja Surajmal Institute of Technology");
        names.add("Bharati Vidyapeeth's College of Engineering");
        names.add("Bhagwan Parshuram Institute of Technology");
        names.add("Jamia Milia Islamia");
        names.add("GB Pant Government Engineering College");
        names.add("Sharda University");
        names.add("Amity University");

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
                Intent intent;
                switch (position){
                    case 0: intent=new Intent(getApplicationContext(),dtu.class);
                            startActivity(intent);
                            break;

                    case 1: intent=new Intent(getApplicationContext(),iitd.class);
                            startActivity(intent);
                            break;


                    case 2:intent=new Intent(getApplicationContext(),iiitd.class);
                           startActivity(intent);
                           break;

                    case 3:intent=new Intent(getApplicationContext(),nsut.class);
                           startActivity(intent);
                           break;
                    case 4:intent=new Intent(getApplicationContext(),mait.class);
                        startActivity(intent);
                        break;
                    case 5:intent=new Intent(getApplicationContext(),igdtuw.class);
                        startActivity(intent);
                        break;
                }
            }
        });

    }
}
