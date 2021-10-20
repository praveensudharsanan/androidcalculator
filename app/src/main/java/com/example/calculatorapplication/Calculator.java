package com.example.calculatorapplication;

import org.mariuszgromada.math.mxparser.Expression;

public class Calculator {
    String numberString="0";
    String detailsString="";
    long intNumber=0;
    String result;
    public Calculator() {

    }

    public void processNumber(int i) {
        if(numberString.length()<12) {  // limit of 12 digits
            intNumber = intNumber * 10 + i;
           numberString = String.valueOf(intNumber);
            detailsString = "Clicked: "+i;

        }
        else
            detailsString="The number is too long..";
    }
    public void clear(){

    }

    public void calculate(String value){
            String userExp= value;
            userExp=userExp.replaceAll("π","3.14");
            Expression exp = new Expression(userExp);
            result= String.valueOf(exp.calculate());
    }


}
