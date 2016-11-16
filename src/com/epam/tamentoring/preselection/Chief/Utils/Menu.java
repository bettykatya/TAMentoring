package com.epam.tamentoring.preselection.Chief.Utils;

import com.epam.tamentoring.preselection.Chief.Salad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu {

    private static final String MENU_OPTIONS_1 = "Choose how you want to make your salad: \n1 - with random ingredients \n2 - add ingredients manually  \n0 - exit program";
    private static final String ERROR_READING_CONSOLE_MESSAGE = "Error reading from console";
    private static final String ERROR_PARSING_INTEGER_MESSAGE = "You entered incorrect option";
    private static final int ERROR_CODE = -111;

    public static void runMenu(){
        System.out.println(MENU_OPTIONS_1);
        runFirstOptions();
    }

    private static int readIntFromConsole(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = "";
        try{
            key = reader.readLine();
        }
        catch (Exception e){
            System.out.println(ERROR_READING_CONSOLE_MESSAGE);
        }

        int option;
        try{
            option = Integer.parseInt(key);
        }
        catch (NumberFormatException e) {
            System.out.println(ERROR_PARSING_INTEGER_MESSAGE);
            return ERROR_CODE;
        }

        return option;
    }

    private static void runFirstOptions(){
        int option = readIntFromConsole();
        switch(option){
            case 0:
                System.exit(0);
            case 1:

                break;
            case 2:

                break;
            default:
                break;
        }
    }

}
