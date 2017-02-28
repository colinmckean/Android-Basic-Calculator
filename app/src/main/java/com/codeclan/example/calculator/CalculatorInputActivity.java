package com.codeclan.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorInputActivity extends AppCompatActivity {
    Calculator calc;
    EditText numAinput;
    EditText numBinput;
    Button addBtn;
    Button subBtn;
    Button divBtn;
    Button multBtn;

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
        Log.i("Button Event", "Add Button Clicked");
    }
}
