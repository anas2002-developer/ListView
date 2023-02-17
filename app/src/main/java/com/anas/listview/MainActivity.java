package com.anas.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView vListView;
    ArrayList<String> arrNames=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vListView=findViewById(R.id.vListView);

        arrNames.add("Anas");
        arrNames.add("Nikhil");
        arrNames.add("Shruti");
        arrNames.add("Palki");

        arrNames.add("Anas");
        arrNames.add("Nikhil");
        arrNames.add("Shruti");
        arrNames.add("Palki");

        arrNames.add("Anas");
        arrNames.add("Nikhil");
        arrNames.add("Shruti");
        arrNames.add("Palki");

        arrNames.add("Anas");
        arrNames.add("Nikhil");
        arrNames.add("Shruti");
        arrNames.add("Palki");

        arrNames.add("Anas");
        arrNames.add("Nikhil");
        arrNames.add("Shruti");
        arrNames.add("Palki");

        arrNames.add("Aman");
        arrNames.add("Viplav");
        arrNames.add("Puneet");
        arrNames.add("Farhan");

        ArrayAdapter<String> arrAdapterNames=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrNames);
        vListView.setAdapter(arrAdapterNames);

        vListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i<4){
                    Toast.makeText(MainActivity.this,"Toast for (1-4)",Toast.LENGTH_SHORT).show();       //i - index no.
                }
            }
        });
    }
}