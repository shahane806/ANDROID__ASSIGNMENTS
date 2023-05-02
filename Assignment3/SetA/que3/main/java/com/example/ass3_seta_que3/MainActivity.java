package com.example.ass3_seta_que3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView clear,one,two,three,four,five,six,seven,eight,nine,zero,dot,plus,multiply,minus,equal,divide,screen,screentwo;
    //    static boolean flag1= false;
//    static boolean flag2 = true;
    static boolean flag = false;
    String num1 = null;
    String num2 = null;
    double n1,n2;
    String op = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screentwo = findViewById(R.id.screentwo);
        clear = findViewById(R.id.clear);
        one = findViewById(R.id.btnOne);
        two = findViewById(R.id.btnTwo);
        three = findViewById(R.id.btnThree);
        four = findViewById(R.id.btnFour);
        five = findViewById(R.id.btnFive);
        six = findViewById(R.id.btnSix);
        seven = findViewById(R.id.btnSeven);
        eight = findViewById(R.id.btnEight);
        nine = findViewById(R.id.btnNine);
        zero = findViewById(R.id.btnZero);
        plus = findViewById(R.id.btnPlus);
        minus = findViewById(R.id.btnMinus);
        multiply = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivide);
        equal = findViewById(R.id.btnEqualTo);
        screen = findViewById(R.id.screen);
        dot = findViewById(R.id.btnDot);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        clear.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        dot.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        equal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        try{
            switch (view.getId()){
                case R.id.btnOne:
                {
//                    Toast t = Toast.makeText(this,one.getText().toString(),Toast.LENGTH_LONG);
//                    t.show();
                    screen.append(one.getText().toString());
                    screentwo.append(one.getText().toString());
                }break;
                case R.id.btnTwo:
                {
//                    Toast t = Toast.makeText(this,two.getText().toString(),Toast.LENGTH_LONG);
//                    t.show();
                    screen.append(two.getText().toString());
                    screentwo.append(two.getText().toString());
                }
                break;
                case R.id.btnThree:
                {
//                    Toast t = Toast.makeText(this,three.getText().toString(),Toast.LENGTH_LONG);
//                    t.show();
                    screen.append(three.getText().toString());
                    screentwo.append(three.getText().toString());
                }
                break;
                case R.id.btnFour:
                {
//                    Toast t = Toast.makeText(this,four.getText().toString(),Toast.LENGTH_LONG);
//                    t.show();
                    screen.append(four.getText().toString());
                    screentwo.append(four.getText().toString());
                }
                break;
                case R.id.btnFive:
                {
//                    Toast t = Toast.makeText(this,five.getText().toString(),Toast.LENGTH_LONG);
//                    t.show();
                    screen.append(five.getText().toString());
                    screentwo.append(five.getText().toString());
                }
                break;
                case R.id.btnSix:
                {
//                    Toast t = Toast.makeText(this,six.getText().toString(),Toast.LENGTH_LONG);
//                    t.show();
                    screen.append(six.getText().toString());
                    screentwo.append(six.getText().toString());
                }
                break;
                case R.id.btnSeven:
                {
//                    Toast t = Toast.makeText(this,seven.getText().toString(),Toast.LENGTH_LONG);
//                    t.show();
                    screen.append(seven.getText().toString());
                    screentwo.append(seven.getText().toString());
                }
                break;
                case R.id.btnEight:
                {
//                    Toast t = Toast.makeText(this,eight.getText().toString(),Toast.LENGTH_LONG);
//                    t.show();
                    screen.append(eight.getText().toString());
                    screentwo.append(eight.getText().toString());
                }
                break;
                case R.id.btnNine:
                {
//                    Toast t = Toast.makeText(this,nine.getText().toString(),Toast.LENGTH_LONG);
//                    t.show();
                    screen.append(nine.getText().toString());
                    screentwo.append(nine.getText().toString());
                }
                break;
                case R.id.btnZero:
                {
//                    Toast t = Toast.makeText(this,zero.getText().toString(),Toast.LENGTH_LONG);
//                    t.show();
                    screen.append(zero.getText().toString());
                    screentwo.append(zero.getText().toString());
                }
                break;
                case R.id.btnDot:
                {
//                    Toast t = Toast.makeText(this,dot.getText().toString(),Toast.LENGTH_LONG);
//                    t.show();
                    if (flag == false){
                        screen.append(dot.getText().toString());
                        screentwo.append(dot.getText().toString());
                        flag = true;

                    }

                }
                break;
                case R.id.btnEqualTo:
                {

                    //calculate

                    num2 =  screen.getText().toString();
                    n2 = Double.parseDouble(num2);

                    switch (op){
                        case "+":{
                            n1 = Math.abs(Double.parseDouble(num1));
                            String s = Double.toString(n1+n2);
                            screen.setText(s);
                            screentwo.setText("");
                        }
                        break;
                        case "-":{
                            n1 = Math.abs(Double.parseDouble(num1));
                            String s = Double.toString(n1-n2);
                            screen.setText(s);
                            screentwo.setText("");
                        }
                        break;
                        case "*":{
                            n1 = Math.abs(Double.parseDouble(num1));
                            String s = Double.toString(n1*n2);
                            screen.setText(s);
                            screentwo.setText("");
                        }
                        break;
                        case "/":{
                            n1 = Math.abs(Double.parseDouble(num1));
                            String s = Double.toString(n1/n2);
                            screen.setText(s);
                            screentwo.setText("");
                        }
                        break;
                        default:screen.setText("Invalid Input");
                    }





                }
                break;
                case R.id.btnPlus:
                {
//                    Toast t = Toast.makeText(this,plus.getText().toString(),Toast.LENGTH_LONG);
//                    t.show();

                    num1 = screen.getText().toString();
                    op = "+";
                    screen.setText("");
                    screentwo.append(plus.getText().toString());

                    flag = false;
                }
                break;
                case R.id.btnMinus:
                {
//                    Toast t = Toast.makeText(this,minus.getText().toString(),Toast.LENGTH_LONG);
//                    t.show();
                    num1 = screen.getText().toString();
                    op = "-";
                    screen.setText("");
                    screentwo.append(minus.getText().toString());
                    flag = false;


                }
                break;
                case R.id.btnMultiply:
                {
//                    Toast t = Toast.makeText(this,multiply.getText().toString(),Toast.LENGTH_LONG);
//                    t.show();
                    num1 = screen.getText().toString();
                    op = "*";
                    screen.setText("");
                    screentwo.append(multiply.getText().toString());
                    flag = false;

                }
                break;
                case R.id.btnDivide:
                {
//                    Toast t = Toast.makeText(this,divide.getText().toString(),Toast.LENGTH_LONG);
//                    t.show();
                    num1 = screen.getText().toString();
                    op = "/";
                    screen.setText("");
                    screentwo.append(divide.getText().toString());
                    flag = false;

                }
                break;
                case R.id.clear:
                {
//                    Toast t = Toast.makeText(this,clear.getText().toString(),Toast.LENGTH_LONG);
//                    t.show();
                    screen.setText("");
                    screentwo.setText("");
                    flag = false;


                }
                break;
            }
        }catch (Exception e){
            screen.setText("Error");
        }

    }
}