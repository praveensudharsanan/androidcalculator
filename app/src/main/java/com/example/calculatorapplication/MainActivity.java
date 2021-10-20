package com.example.calculatorapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.mariuszgromada.math.mxparser.Expression;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    TextView tvNumber;
    TextView tvDetails;
    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculator = new Calculator();
        tvNumber = findViewById(R.id.textView2);
        tvDetails = findViewById(R.id.textView3);

    }
    public void  numberClicked(View view) {

        switch (view.getId()) {
            case R.id.b_0:
                calculator.processNumber(0);
                tvNumber.setText(tvNumber.getText()+"0");
                break;
            case R.id.b_1:
                calculator.processNumber(1);
                tvNumber.setText(tvNumber.getText()+"1");

                break;
            case R.id.b_2:
                calculator.processNumber(2);
                tvNumber.setText(tvNumber.getText()+"2");

                break;
            case R.id.b_3:
                calculator.processNumber(3);
                tvNumber.setText(tvNumber.getText()+"3");

                break;
            case R.id.b_4:
                calculator.processNumber(4);
                tvNumber.setText(tvNumber.getText()+"4");

                break;
            case R.id.b_5:
                calculator.processNumber(5);
                tvNumber.setText(tvNumber.getText()+"5");

                break;
            case R.id.b_6:
                calculator.processNumber(6);
                tvNumber.setText(tvNumber.getText()+"6");

                break;
            case R.id.b_7:
                calculator.processNumber(7);
                tvNumber.setText(tvNumber.getText()+"7");

                break;
            case R.id.b_8:
                calculator.processNumber(8);
                tvNumber.setText(tvNumber.getText()+"8");

                break;
            case R.id.b_9:
                calculator.processNumber(9);
                tvNumber.setText(tvNumber.getText()+"9");

                break;



        }
        updateCalcUI();
    }
        private void updateCalcUI(){
            //tvNumber.setText(calculator.result);
           tvDetails.setText(calculator.detailsString);
        }

        public void clear(View view){
            tvNumber.setText(null);
            tvDetails.setText(null);
            calculator.numberString="0";
            calculator.detailsString="";

        }

    public void onClickotherbutton(View view) {


        switch (view.getId()) {
            case R.id.clear_button:
                calculator.clear();
                break;
            case R.id.plus_button:
  //              calculator.addition();
                tvNumber.setText(tvNumber.getText()+"+");

                break;
            case R.id.minus_button:
//                calculator.subtraction();
                tvNumber.setText(tvNumber.getText()+"-");

                break;
            case R.id.multiply_button:
//                calculator.multiplication();
                tvNumber.setText(tvNumber.getText()+"*");

                break;
            case R.id.divide_button:
//                calculator.division();
                tvNumber.setText(tvNumber.getText()+"/");

                break;
            case R.id.decimal_button:
                tvNumber.setText(tvNumber.getText()+".");
                break;

            case R.id.pi_button:
                calculator.clear();
                tvNumber.setText(tvNumber.getText()+"π");
                break;

            case R.id.equals_button:
                String value=tvNumber.getText().toString();
                calculator.calculate(value);
                tvNumber.setText(calculator.result);

//                tvNumber.setSeletion(result.length());
                break;

            default:
//                calculator.appendDisplay(button.getText().toString());
                break;
        }
    }


}


