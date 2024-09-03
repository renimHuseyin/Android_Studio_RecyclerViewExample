package com.renim.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycleView;
    private RecyclerAdapter adapter;
    private ArrayList<String>countryNameList = new ArrayList<>();
    private ArrayList<String>detailsList = new ArrayList<>();
    private ArrayList<Integer> imageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycleView = findViewById(R.id.recyclerView);
        recycleView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        countryNameList.add("Turkey");
        countryNameList.add("USA");
        countryNameList.add("Germany");
        countryNameList.add("United Kingdom");
        countryNameList.add("Denmark");
        countryNameList.add("France");
        countryNameList.add("Italy");
        countryNameList.add("Canada");
        countryNameList.add("Russia");
        countryNameList.add("Syria");

        detailsList.add("This is the Turkey Flag");
        detailsList.add("This is the USA Flag");
        detailsList.add("This is the Germany Flag");
        detailsList.add("This is the United Kingdom Flag");
        detailsList.add("This is the Denmark Flag");
        detailsList.add("This is the France Flag");
        detailsList.add("This is the Italy Flag");
        detailsList.add("This is the Canada Flag");
        detailsList.add("This is the Russia Flag");
        detailsList.add("This is the Syria Flag");

        imageList.add(R.drawable.turkiye);
        imageList.add(R.drawable.amerika);
        imageList.add(R.drawable.almanya);
        imageList.add(R.drawable.ingiltere);
        imageList.add(R.drawable.danimarka);
        imageList.add(R.drawable.fransa);
        imageList.add(R.drawable.img);
        imageList.add(R.drawable.kanada);
        imageList.add(R.drawable.rusya);
        imageList.add(R.drawable.syriye);

        adapter = new RecyclerAdapter(countryNameList,detailsList,imageList,MainActivity.this);
        recycleView.setAdapter(adapter);


    }
}