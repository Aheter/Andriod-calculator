package com.example.myfirstapplicationhit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    char op;
    int num1;
    int num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        result = findViewById(R.id.textViewResult);

    }

    public void buttonFuncNum(View view) {

        if (view instanceof Button) {
            Button b = (Button) view;
            String str = b.getText().toString();
            result.append(str);

        }
    }
    public void buttonFuncClear(View view){
        result.setText("");

    }

    public void buttonFuncOperator(View view){
        if (view instanceof Button) {
            Button b = (Button) view;
            op = b.getText().toString().charAt(0);
            num1 = Integer.parseInt(result.getText().toString());
            result.setText("");
        }
    }
    public void buttonFuncEquals(View view){
        if (view instanceof Button) {
            double num3=0.0d;
            num2 = Integer.parseInt(result.getText().toString());
            switch (op){
                case '+':
                    num3=num1+num2;
                    break;
                case '-':
                    num3=num1-num2;
                    break;
                case '*':
                    num3=num1*num2;
                    break;
                case '/':
                    if (num2 !=0)
                        num3=num1/num2;
                    else {
                        result.setText("ERROR:DEVISION BY ZERO");
                        return;
                    }
                    break;
            }
        result.setText(String.valueOf(num3));


        }
    }




}