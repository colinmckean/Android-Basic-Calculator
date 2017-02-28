package com.codeclan.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorInputActivity extends AppCompatActivity {
    private Calculator calc;
    private EditText numAinput;
    private EditText numBinput;
    private Button addBtn;
    private Button subBtn;
    private Button divBtn;
    private Button multBtn;
    private Intent intent;
    private final String btnLog = "Button event";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_input);
        calc = new Calculator();
        numAinput = (EditText) findViewById(R.id.numA_EditText);
        numBinput = (EditText) findViewById(R.id.numB_EditText);
        addBtn = (Button) findViewById(R.id.add_Btn);
        subBtn = (Button) findViewById(R.id.sub_Btn);
        divBtn = (Button) findViewById(R.id.div_Btn);
        multBtn = (Button) findViewById(R.id.multi_Btn);

    }

    public void onAddButtonClicked(View view) {
        int sums = calc.add(Integer.valueOf(numAinput.getText().toString()),
                            Integer.valueOf(numBinput.getText().toString()));
        String answer = String.valueOf(sums);
        intent = new Intent(this, ResultActivity.class);
        intent.putExtra("answer", answer);
        startActivity(intent);

    }

    public void onSubButtonClicked(View view) {
        int sums = calc.subtract(Integer.valueOf(numAinput.getText().toString()),
                                 Integer.valueOf(numBinput.getText().toString()));
        String answer = String.valueOf(sums);
        intent = new Intent(this, ResultActivity.class);
        intent.putExtra("answer", answer);
        startActivity(intent);
    }

    public void onDivButtonClicked(View view) {
        int sums = calc.divide(Integer.valueOf(numAinput.getText().toString()),
                               Integer.valueOf(numBinput.getText().toString()));
        String answer = String.valueOf(sums);
        intent = new Intent(this, ResultActivity.class);
        intent.putExtra("answer", answer);
        startActivity(intent);
    }

    public void onMultButtonClicked(View view) {
        int sums = calc.multiply(Integer.valueOf(numAinput.getText().toString()),
                                 Integer.valueOf(numBinput.getText().toString()));
        String answer = String.valueOf(sums);
        intent = new Intent(this, ResultActivity.class);
        intent.putExtra("answer", answer);
        startActivity(intent);
    }
}
