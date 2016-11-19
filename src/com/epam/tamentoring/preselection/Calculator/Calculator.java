package com.epam.tamentoring.preselection.Calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {
    private final String ERROR_MESSAGE = "Some error occured. Check values you entered and try again.";

    private double a;
    private double b;
    private char operator;

    public void run(){
        final String MESSAGE_1 = "Please enter 1 number:";
        final String MESSAGE_2 = "Please enter operator:";
        final String MESSAGE_3 = "Please enter 2 number:";
        final String MESSAGE_4 = "Enter 'q' to exit or any other key to continue.";

        char controlKey;
        do {

            System.out.println(MESSAGE_1);
            a = Double.parseDouble(ReadFromConsole());
            System.out.println(MESSAGE_2);
            operator = ReadFromConsole().charAt(0);
            System.out.println(MESSAGE_3);
            b = Double.parseDouble(ReadFromConsole());

            printResult(calculate());

            System.out.println(MESSAGE_4);
            controlKey = ReadFromConsole().charAt(0);
        }
        while(controlKey != 'q');
    }
    private String ReadFromConsole(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String value = "";
        try{
            value = reader.readLine();
        }
        catch (Exception e){
            System.out.println(ERROR_MESSAGE);
        }
        return value;
    }
    private double calculate(){
        double result = 0;

        switch(operator){
            case '+':{
                result = a+b;
                break;
            }
            case '-':{
                result = a-b;
                break;
            }
            case '*':{
                result = a*b;
                break;
            }
            case '/':{
                if(b != 0){
                    result = a/b;
                }
                else{
                    System.out.println(ERROR_MESSAGE);
                    result = 0;
                }
                break;
            }
            default:{
                System.out.println(ERROR_MESSAGE);
            }
        }

        return result;
    }
    private void printResult(double resultToPrint){
        System.out.println(a + " " + operator + " " + b + " = " + resultToPrint);
    }
}
