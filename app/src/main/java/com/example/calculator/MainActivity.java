package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int num1,num2;

    EditText editNumber1;
    EditText editNumber2;
    Button buttonPlus,buttonMinus,buttonMultiply,buttonDivide;
    TextView textDispAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNumber1=findViewById(R.id.number_1_edit);
        editNumber2=findViewById(R.id.number_2_edit);
        buttonPlus=findViewById(R.id.button_plus);
        buttonMinus=findViewById(R.id.button_minus);
        buttonMultiply=findViewById(R.id.button_multiply);
        buttonDivide=findViewById(R.id.button_division);
        textDispAnswer=findViewById(R.id.dispanswer_text);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             num1  = Integer.parseInt(editNumber1.getText().toString()) ;
             num2 =  Integer.parseInt(editNumber2.getText().toString());
             String answer = String.valueOf(num1 + num2);
             textDispAnswer.setText(answer);

            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Integer.parseInt(editNumber1.getText().toString());
                num2 =Integer.parseInt(editNumber2.getText().toString());
                String answer = String.valueOf(num1 - num2);
                textDispAnswer.setText(answer);
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Integer.parseInt(editNumber1.getText().toString());
                num2 =Integer.parseInt(editNumber2.getText().toString());
                String answer = String.valueOf(num1 * num2);
                textDispAnswer.setText(answer);

            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Integer.parseInt(editNumber1.getText().toString());
                num2 =Integer.parseInt(editNumber2.getText().toString());
                String answer = String.valueOf(num1 / num2);
                textDispAnswer.setText(answer);
            }
        });


    }
}
