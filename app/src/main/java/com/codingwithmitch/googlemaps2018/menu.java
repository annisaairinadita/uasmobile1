package com.codingwithmitch.googlemaps2018;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.codingwithmitch.googlemaps2018.ui.LoginActivity;

public class menu extends AppCompatActivity {

    private TextView textView1, textView2, textView3, textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent praktikum1 = new Intent(menu.this, praktikum1.class);
                startActivity(praktikum1);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent praktikum2 = new Intent(menu.this, praktikum2.class);
                startActivity(praktikum2);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent praktikum3 = new Intent(menu.this, LoginActivity.class);
                startActivity(praktikum3);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent praktikum4 = new Intent(menu.this, praktikum4.class);
                startActivity(praktikum4);
            }
        });
    }
}
