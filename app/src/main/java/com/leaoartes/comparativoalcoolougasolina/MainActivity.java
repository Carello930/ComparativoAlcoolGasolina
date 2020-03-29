package com.leaoartes.comparativoalcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    //EditText
    private TextInputEditText editTextAlcohol;
    private TextInputEditText editTextGasoline;

    //Button
    private Button btnCalculate;

    //TextView
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //EditText
        editTextAlcohol     = findViewById(R.id.editTextAlcohol);
        editTextGasoline    = findViewById(R.id.editTextGasoline);

        //Button
        btnCalculate        = findViewById(R.id.btnCalculate);

        //TextView
        textResult          = findViewById(R.id.textResult);
    }

    public void calculateBetterChoice(View view){

        double valueAlcohol = Double.parseDouble(editTextAlcohol.getText().toString());
        double valueGasoline = Double.parseDouble(editTextGasoline.getText().toString());

        double result = (valueAlcohol + valueGasoline);
        textResult.setText("Valor: " + result);

    }
}
