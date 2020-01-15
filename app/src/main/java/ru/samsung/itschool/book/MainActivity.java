package ru.samsung.itschool.book;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    Button plus, minus, malt, div;
    EditText numberOne, numberTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberOne = findViewById(R.id.et_a);
        numberTwo = findViewById(R.id.et_b);

        plus = findViewById(R.id.btn_plus);
        minus = findViewById(R.id.btn_minus);
        malt = findViewById(R.id.btn_mult);
        div = findViewById(R.id.btn_div);

        result = findViewById(R.id.tv_result);

        plus.setOnClickListener(listener);
        minus.setOnClickListener(listener);
        malt.setOnClickListener(listener);
        div.setOnClickListener(listener);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v) {
            int id = v.getId();

            double numOne, numTwo;

            if (numberOne.getText().toString().equals("")) numOne = 0;
            else numOne = Double.parseDouble(numberOne.getText().toString());
            if (numberTwo.getText().toString().equals("")) numTwo = 0;
            else numTwo = Double.parseDouble(numberTwo.getText().toString());

            switch (id){
                case R.id.btn_plus:
                    result.setText(Double.toString(numOne + numTwo));
                    break;
                case R.id.btn_minus:
                    result.setText(Double.toString(numOne - numTwo));
                    break;
                case R.id.btn_mult:
                    result.setText(Double.toString(numOne * numTwo));
                    break;
                case R.id.btn_div:
                    result.setText(Double.toString(numOne / numTwo));
                    break;
                default:
                    break;
            }
        }
    };
}
