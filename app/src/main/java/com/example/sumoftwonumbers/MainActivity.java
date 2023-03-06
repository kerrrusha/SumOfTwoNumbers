package com.example.sumoftwonumbers;

import static android.graphics.Color.RED;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button addButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.editTextNumber3);
        num2 = (EditText) findViewById(R.id.editTextNumber4);
        addButton = (Button) findViewById(R.id.button2);
        resultTextView = (TextView) findViewById(R.id.textView5);

        addButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    String result = "";
                    try {
                        int num1Value = Integer.parseInt(num1.getText().toString());
                        int num2Value = Integer.parseInt(num2.getText().toString());
                        result = (num1Value + num2Value) + "";
                    } catch (NumberFormatException e) {
                        result = "Error occured while parsing number input";
                        resultTextView.setTextColor(RED);
                    }
                    resultTextView.setText(result);
                    System.out.println(result);
                }
        });

    }
}