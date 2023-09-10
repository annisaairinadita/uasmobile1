package com.codingwithmitch.googlemaps2018;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listview extends AppCompatActivity {

    String[] mobileArray = {"Android", "WindowsMobile", "Blackberry", "WebOs", "Ubuntu", "Windows7", "Max Os X"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.listview2, mobileArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);

    }
}
