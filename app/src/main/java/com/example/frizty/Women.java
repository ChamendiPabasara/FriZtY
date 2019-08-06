package com.example.frizty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Women extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women);


        Button oneButton = findViewById(R.id.oneButton);
        Button twoButton = findViewById(R.id.twoButton);
        Button threeButton = findViewById(R.id.threeButton);
        Button fourButton = findViewById(R.id.fourButton);
        Button fiveButton = findViewById(R.id.fiveButton);
        Button sixButton = findViewById(R.id.sixButton);
        Button sevenButton = findViewById(R.id.sevenButton);
        Button eightButton = findViewById(R.id.eightButton);




      /*  button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);*/


    }
    public void onButtonClick(View view) {

        if(view.getId()==R.id.oneButton)
        {
            openItem1();
        }
                /*else if(view.getId()==R.id.button5){

                    openMen();
                }
                else if(view.getId()==R.id.button6){

                    openJewellery();
                }

                else if(view.getId()==R.id.button7){

                    openBags();
                }
                else if(view.getId()==R.id.button8){

                    openShoes();
                }

                else if(view.getId()==R.id.button8){

                    openElectronics();
                }*/

    }

    public void openItem1()
    {
        Intent intent = new Intent(Women.this,w1.class);
        startActivity(intent);
    }
}