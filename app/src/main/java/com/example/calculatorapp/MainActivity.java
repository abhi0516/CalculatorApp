package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }

    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double diff = num1 - num2;

        numberSumTV.setText("" + diff);
    }

    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double product = num1 * num2;

        numberSumTV.setText("" + product);
    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberQuotientTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double quotient = num1 / num2;

        numberQuotientTV.setText("" + quotient);
    }


    public void findSin(View view) {
        EditText trigDegreesET = findViewById(R.id.trigDegreesET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int degrees = Integer.parseInt(trigDegreesET.getText().toString());

        double radians = Math.toRadians(degrees);

        // sin() method to get the sine value
        double sinValue = Math.sin(radians);

        numberSumTV.setText("sin(" + degrees + ") = " + sinValue);
    }

    public void findCos(View view) {
        EditText trigDegreesET = findViewById(R.id.trigDegreesET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int degrees = Integer.parseInt(trigDegreesET.getText().toString());

        double radians = Math.toRadians(degrees);

        // cos() method to get the sine value
        double cosValue = Math.cos(radians);

        numberSumTV.setText("cos(" + degrees + ") = " + cosValue);
    }

    public void findTan(View view) {
        EditText trigDegreesET = findViewById(R.id.trigDegreesET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int degrees = Integer.parseInt(trigDegreesET.getText().toString());

        double radians = Math.toRadians(degrees);

        // tan() method to get the sine value
        double tanValue = Math.tan(radians);

        numberSumTV.setText("tan(" + degrees + ") = " + tanValue);
    }

}