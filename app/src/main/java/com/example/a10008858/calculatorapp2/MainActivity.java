package com.example.a10008858.calculatorapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


import com.example.a10008858.calculatorapp2.R;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button plus;
    Button minus;
    Button multiply;
    Button divide;
    Button clear;
    Button equals;
    String calcNums = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView display;
        Button one = (Button)findViewById(R.id.button1);
        Button two = (Button)findViewById(R.id.button2);
        Button three = (Button)findViewById(R.id.button3);
        Button four = (Button)findViewById(R.id.button4);
        Button five = (Button)findViewById(R.id.button5);
        Button six = (Button)findViewById(R.id.button6);
        Button seven = (Button)findViewById(R.id.button7);
        Button eight = (Button)findViewById(R.id.button8);
        Button nine = (Button)findViewById(R.id.button9);
        Button zero = (Button)findViewById(R.id.button0);
        Button plus = (Button)findViewById(R.id.button_plus);
        Button minus = (Button)findViewById(R.id.button_minus);
        Button times = (Button)findViewById(R.id.button_times);
        Button divide = (Button)findViewById(R.id.button_divide);
        Button clear = (Button)findViewById(R.id.buttonC);
        Button equals = (Button)findViewById(R.id.button_equals);
        display = (TextView) findViewById(R.id.textView_display);

        display.setText("0");

        //NUMBERS

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcNums=calcNums+"1";
                display.setText(calcNums);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcNums+="2";
                display.setText(calcNums);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcNums+="3";
                display.setText(calcNums);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcNums+="4";
                display.setText(calcNums);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcNums+="5";
                display.setText(calcNums);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcNums+="6";
                display.setText(calcNums);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcNums+="7";
                display.setText(calcNums);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcNums+="8";
                display.setText(calcNums);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcNums+="9";
                display.setText(calcNums);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcNums+="0";
                display.setText(calcNums);
            }
        });

       //OPERATORS

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcNums+=" + ";
                display.setText(calcNums);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcNums+=" - ";
                display.setText(calcNums);
            }
        });
        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcNums+=" * ";
                display.setText(calcNums);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcNums+=" / ";
                display.setText(calcNums);
            }
        });

        //EQUALS
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double ans = 0;
                try{
                    StringTokenizer tokenizer = new StringTokenizer(calcNums, " ");
                    double num1 = Integer.parseInt(tokenizer.nextToken());
                    String operator = tokenizer.nextToken();
                    double num2 = Integer.parseInt(tokenizer.nextToken());

                    if(operator.equals("+")){
                        ans = num1 + num2;
                        display.setText(String.valueOf(ans));
                    }
                    if(operator.equals("-")){
                        ans = num1 - num2;
                        display.setText(String.valueOf(ans));
                    }
                    if(operator.equals("*")){
                        ans = num1 * num2;
                        display.setText(String.valueOf(ans));
                    }
                    if(operator.equals("/")){
                        ans = num1 / num2;
                        display.setText(String.valueOf(ans));
                    }
                    calcNums=String.valueOf(ans);

                }
                catch (Exception e){
                    display.setText("C'mon man don't do that.");
                    calcNums = "";
                }
            }
        });

        //CLEAR
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcNums="";
                display.setText(calcNums);
            }
        });

    }


}