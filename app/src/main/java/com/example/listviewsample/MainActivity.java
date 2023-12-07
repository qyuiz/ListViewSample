package com.example.listviewsample;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Sample data
        List<String> data = new ArrayList<>();
        data.add("Item 1");
        data.add("Item 2");
        data.add("Item 3");

        // Create the custom adapter
        CustomAdapter adapter = new CustomAdapter(this, data);

        // Get the ListView from the layout
        ListView listView = findViewById(R.id.listView);

        // Set the adapter for the ListView
        listView.setAdapter(adapter);
    }
}