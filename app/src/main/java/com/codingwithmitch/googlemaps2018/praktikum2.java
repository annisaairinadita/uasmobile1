package com.codingwithmitch.googlemaps2018;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class praktikum2 extends AppCompatActivity {

    private ImageView back;
    private TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.praktikum2);

        back = findViewById(R.id.back);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);

        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent praktikum2 = new Intent(praktikum2.this, menu.class);
                startActivity(praktikum2);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent praktikum2 = new Intent(praktikum2.this, relativelayout.class);
                startActivity(praktikum2);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent praktikum2 = new Intent(praktikum2.this, tablelayout.class);
                startActivity(praktikum2);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent praktikum2 = new Intent(praktikum2.this, absolutelayout.class);
                startActivity(praktikum2);
            }
        });
        textView5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent praktikum2 = new Intent(praktikum2.this, framelayout.class);
                startActivity(praktikum2);
            }
        });
        textView6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent praktikum2 = new Intent(praktikum2.this, listview.class);
                startActivity(praktikum2);
            }
        });
        textView7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent praktikum2 = new Intent(praktikum2.this, gridview.class);
                startActivity(praktikum2);
            }
        });
        textView8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent praktikum2 = new Intent(praktikum2.this, control.class);
                startActivity(praktikum2);
            }
        });
        textView9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent praktikum2 = new Intent(praktikum2.this, eventhandling.class);
                startActivity(praktikum2);
            }
        });
        textView10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent praktikum2 = new Intent(praktikum2.this, customcomponent.class);
                startActivity(praktikum2);
            }
        });
    }
}
