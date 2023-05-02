package com.example.ass2_setb_que1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Login");
        Button login = findViewById(R.id.Login);
        EditText userName = findViewById(R.id.editTextTextPersonName2);
        EditText password = findViewById(R.id.editTextTextPassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String UserName = userName.getText().toString();
                String Password = password.getText().toString();
                if(UserName.equals("Om788")){
                    if(Password.equals("Pass@123")){
                        Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                        startActivity(i);
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "UserName : Om788 and Password : Pass@123", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    }
