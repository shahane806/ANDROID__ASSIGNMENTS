package com.example.ass2_seta_que3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> arrayList = new ArrayList<>();
    Information information = new Information();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.ListView);

        arrayList.add("Person1");
        arrayList.add("Person2");
        arrayList.add("Person3");
        arrayList.add("Person4");
        arrayList.add("Person5");
        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                information.setInfo(arrayList.get(position));
                Toast.makeText(getApplicationContext(), information.getInfo(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}