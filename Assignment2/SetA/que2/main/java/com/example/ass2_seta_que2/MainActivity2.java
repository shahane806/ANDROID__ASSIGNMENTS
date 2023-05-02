package com.example.ass2_seta_que2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("MainActivity2");
        setContentView(R.layout.activity_main2);
        TextView textView = findViewById(R.id.textView);
        String info = getIntent().getStringExtra("Hello");
        textView.setText(info);
    }
}