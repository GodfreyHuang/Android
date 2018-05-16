package com.example.user.hw8;

/**
 * Created by user on 2018/5/15.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RecordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);


        Intent intent = getIntent();
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1);
        adapter.addAll(intent.getStringArrayListExtra("dataList"));
        ((ListView) findViewById(R.id.List)).setAdapter(adapter);
    }
}