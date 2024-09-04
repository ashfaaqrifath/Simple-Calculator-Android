package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText number_1, number_2;
    TextView display;
    Button add;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number_1 = findViewById(R.id.et_number1);
        number_2 = findViewById(R.id.et_number2);
        display = findViewById(R.id.txt_display);
    }

    public void addButtonTapped(View view) {
        int num1 = Integer.parseInt(number_1.getText().toString());
        int num2 = Integer.parseInt(number_2.getText().toString());
        int answer = num1 + num2;
        display.setText(answer + "");
    }

    private int addNumbers(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public void subButtonTapped(View view) {
        int num1 = Integer.parseInt(number_1.getText().toString());
        int num2 = Integer.parseInt(number_2.getText().toString());
        int answer = num1 - num2;
        display.setText(answer + "");
    }

    private int subNumbers(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public void multiplyButtonTapped(View view) {
        int num1 = Integer.parseInt(number_1.getText().toString());
        int num2 = Integer.parseInt(number_2.getText().toString());
        int answer = num1 * num2;
        display.setText(answer + "");
    }

    private int multiplyNumbers(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public void devideButtonTapped(View view) {
        int num1 = Integer.parseInt(number_1.getText().toString());
        int num2 = Integer.parseInt(number_2.getText().toString());
        int answer = num1 / num2;
        display.setText(answer + "");
    }

    private int devideNumbers(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }

    private void readValues(){
        num1 = Integer.parseInt(number_1.getText().toString());
        num2 = Integer.parseInt(number_2.getText().toString());
    }
}