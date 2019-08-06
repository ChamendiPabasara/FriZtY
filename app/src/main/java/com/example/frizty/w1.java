package com.example.frizty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class w1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_w1);

        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(w1.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.size));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(myAdapter);



        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(w1.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Quantity));

        myAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(myAdapter1);
    }
}

