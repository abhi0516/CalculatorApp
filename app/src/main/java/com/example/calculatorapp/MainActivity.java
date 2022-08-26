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
        double roundedSumValue = (double) Math.round(sum * 100) / 100;


        numberSumTV.setText("   " + roundedSumValue);
    }

    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double diff = num1 - num2;
        double roundedDiffValue = (double) Math.round(diff * 100) / 100;


        numberSumTV.setText("   " + roundedDiffValue);
    }

    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double product = num1 * num2;
        double roundedProductValue = (double) Math.round(product * 100) / 100;

        numberSumTV.setText("   " + roundedProductValue);
    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberQuotientTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double quotient = num1 / num2;
        double roundedQuotientValue = (double) Math.round(quotient * 100) / 100;


        numberQuotientTV.setText("   " + roundedQuotientValue);
    }


    public void findSin(View view) {
        EditText trigDegreesET = findViewById(R.id.trigDegreesET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int degrees = Integer.parseInt(trigDegreesET.getText().toString());


        double radians = Math.toRadians(degrees);

        // sin() method to get the sine value
        double sinValue = Math.sin(radians);
        double roundedSinValue = (double) Math.round(sinValue * 100) / 100;

        numberSumTV.setText("   sin(" + degrees + ") = " + roundedSinValue);
    }

    public void findCos(View view) {
        EditText trigDegreesET = findViewById(R.id.trigDegreesET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int degrees = Integer.parseInt(trigDegreesET.getText().toString());

        double radians = Math.toRadians(degrees);

        // cos() method to get the sine value
        double cosValue = Math.cos(radians);

        double roundedCosValue = (double) Math.round(cosValue * 100) / 100;

        numberSumTV.setText("   cos(" + degrees + ") = " + roundedCosValue);
    }

    public void findTan(View view) {
        EditText trigDegreesET = findViewById(R.id.trigDegreesET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int degrees = Integer.parseInt(trigDegreesET.getText().toString());

        double radians = Math.toRadians(degrees);

        // tan() method to get the sine value
        double tanValue = Math.tan(radians);
        double roundedTanValue = (double) Math.round(tanValue * 100) / 100;

        numberSumTV.setText("   tan(" + degrees + ") = " + roundedTanValue);
    }

}