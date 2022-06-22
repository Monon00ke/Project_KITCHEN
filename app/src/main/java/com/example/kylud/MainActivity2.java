package com.example.kylud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    Button pelmeni;
    Button borch;
    Button buttonnew;
    Button pancakes;
    Button buttonnnnnnnnnnn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button pelmeni = (Button)findViewById(R.id.pelmeni);
        pelmeni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(MainActivity2.this, PELMENI.class);
                startActivity(i);
            }
        });




        Button borch = (Button)findViewById(R.id.borch);
        borch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(MainActivity2.this, BORCH.class);
                startActivity(i);
            }
        });



        Button buttonnew = (Button)findViewById(R.id.buttonnew);
        buttonnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(MainActivity2.this, New.class);
                startActivity(i);
            }
        });



        Button pancakes = (Button)findViewById(R.id.pancakes);
        pancakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(MainActivity2.this, pancakes.class);
                startActivity(i);
            }
        });



        Button buttonnnnnnnnnnn = (Button)findViewById(R.id.buttonnnnnnnnnnn);
        buttonnnnnnnnnnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
            }
        });






    }


    @Override
    public void onClick(View v) {

    }
}