package com.example.w.my55;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String[] data= {"+", "-", "*", "/"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView rez1 = (TextView) findViewById(R.id.rez1);
                TextView rez2 = (TextView) findViewById(R.id.rez2);
                EditText num1 = (EditText) findViewById(R.id.num1);
                EditText num2 = (EditText) findViewById(R.id.num2);
                EditText denom1 = (EditText) findViewById(R.id.denom1);
                EditText denom2 = (EditText) findViewById(R.id.denom2);
                Fraction frac1 = new Fraction(Integer.parseInt(num1.getText().toString()), Integer.parseInt(denom1.getText().toString()));
                Fraction frac2 = new Fraction(Integer.parseInt(num2.getText().toString()), Integer.parseInt(denom2.getText().toString()));
                switch (spinner.getSelectedItemPosition()) {
                    case 0:
                        frac1.add(frac2); break;
                    case 1:
                        frac1.substract(frac2); break;
                    case 2:
                        frac1.multiply(frac2); break;
                    case 3:
                        frac1.divide(frac2); break;
                }

                rez1.setText(String.valueOf(frac1.getNumerator()));
                rez2.setText(String.valueOf(frac1.getDenominator()));
            }
        });
    }
}