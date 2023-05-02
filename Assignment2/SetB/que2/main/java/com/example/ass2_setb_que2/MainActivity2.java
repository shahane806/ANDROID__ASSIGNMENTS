package com.example.ass2_setb_que2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView,textView2,textView3,textView4,textView5,textView6;
    String first,middle,last,address,birth,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        first = getIntent().getStringExtra("FirstName");
        middle = getIntent().getStringExtra("MiddleName");
        last = getIntent().getStringExtra("LastName");
        address = getIntent().getStringExtra("Address");
        email = getIntent().getStringExtra("EmailId");
        birth = getIntent().getStringExtra("BirthDay");
        textView.setText(first);
        textView2.setText(middle);
        textView3.setText(last);
        textView4.setText(address);
        textView5.setText(email);
        textView6.setText(birth);
    }
}