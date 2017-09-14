package com.example.christiancarl.recyclingview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView androidVersions;
    LinearLayoutManager LayoutManager;
    int logo[];
    String[] codeName, version, api, date;
    ArrayList<AndroidVersion> list;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidVersions = (RecyclerView) findViewById(R.id.AndroidVersions);

        logo = new int[]{R.drawable.cupcake, R.drawable.donut, R.drawable.eclair, R.drawable.froyo,
                R.drawable.ginger, R.drawable.honeycomb, R.drawable.icecream, R.drawable.jellybean,
                R.drawable.kitkat, R.drawable.lollipop, R.drawable.marshmallow, R.drawable.nougat,
                R.drawable.oreo};

        codeName = getResources().getStringArray(R.array.AndroidVersions);
        version = getResources().getStringArray(R.array.VersionNumber);
        api = getResources().getStringArray(R.array.API);
        date = getResources().getStringArray(R.array.ReleaseDate);

        list = new ArrayList<AndroidVersion>();

        LayoutManager = new LinearLayoutManager(this);
        androidVersions.setLayoutManager(LayoutManager);
        //androidVersions.setHasFixedSize(true);

        for(int i = 0; i < codeName.length; i++) {
            list.add(new AndroidVersion(logo[i], codeName[i], version[i], api[i], date[i]));
        }

        adapter = new CustomAdapter(list);
        androidVersions.setAdapter(adapter);
    }
}
