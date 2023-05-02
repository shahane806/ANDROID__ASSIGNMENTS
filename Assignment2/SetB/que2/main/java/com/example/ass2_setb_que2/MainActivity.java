package com.example.ass2_setb_que2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText firstname,middlename,lastname,address,email;
    DatePicker birthday;
    Button submit;
    String birth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstname = findViewById(R.id.FirstName);
        middlename = findViewById(R.id.MiddleName);
        lastname = findViewById(R.id.LastName);
        address = findViewById(R.id.Address);
        email = findViewById(R.id.EmailId);
        birthday = findViewById(R.id.BirthDay);
       birth = birthday.getDayOfMonth()+": "+birthday.getMonth()+" : "+birthday.getYear();
        submit = findViewById(R.id.Submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("FirstName",firstname.getText().toString());
                intent.putExtra("MiddleName",middlename.getText().toString());
                intent.putExtra("LastName",lastname.getText().toString());
                intent.putExtra("Address",address.getText().toString());
                intent.putExtra("EmailId",email.getText().toString());
                intent.putExtra("BirthDay",birth);
                startActivity(intent);
            }
        });


    }
}