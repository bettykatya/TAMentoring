package com.epam.tamentoring.preselection.Chief.Utils;

import com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables.Carrot;
import com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables.Cucumber;
import com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables.Potato;
import com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables.Tomato;
import com.epam.tamentoring.preselection.Chief.Salad.Salad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu {
    private static Salad salad;

    private static final String OPTIONS_MENU_MAIN = "Choose how you want to make your salad: \n1 - with random ingredients \n2 - add ingredients manually  \n0 - exit\n\n";
    private static final String OPTIONS_SALAD_NAME = "Please, name your salad.";
    private static final String OPTIONS_CUSTOM_SALAD = "Choose vegetable to add to your salad:\n 1 - Carrot\n 2 - Potato\n 3 - Cucumber\n 4 - Tomato\n\nOr choose other options:\n 5 - main menu\n 6 - salad is done\n 0 - exit\n\n";
    private static final String OPTIONS_RANDOM_SALAD = "There are " + ChiefHelper.NUMBER_ALL_VEGETABLES + " vegetables available. Please, enter number of ingredients you want in your salad  or 0 to exit program";
    private static final String OPTIONS_SALAD = "What you want to do with that salad?\n 1 - Show all info\n 2 - Count calories\n 3 - Sort\n 4 - Find ingredient\n 5 - main menu(make new salad)\n 0 - exit";
    private static final String OPTIONS_FIND = "Find ingredients by\n 1 - Calories\n 2 - go back to options\n 0 - exit\n";
    private static final String OPTIONS_SORT = "Sort ingredients by\n 1 - Calories\n 2 - go back to options\n 0 - exit\n";
    private static final String SEPARATOR_LINE = "\n-------------------------------------------";

    private static final String ERROR_READING_CONSOLE_MESSAGE = "Error reading from console.";
    private static final String ERROR_PARSING_INTEGER_MESSAGE = "Symbol you entered is not an integer.";
    private static final String ERROR_INCORRECT_OPTION = "Symbol you entered is not correct. Please read instruction and try again.";
    private static final int ERROR_CODE = -111;

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
    private static String readStringFromConsole(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = "";
        try{
            key = reader.readLine();
        }
        catch (Exception e){
            System.out.println(ERROR_READING_CONSOLE_MESSAGE);
        }

        return key;
    }
    private static void readSaladName(){
        System.out.println(OPTIONS_SALAD_NAME);
        salad.setName(readStringFromConsole());
    }

    public static void runMenu(){
        System.out.println(SEPARATOR_LINE);
        System.out.println(OPTIONS_MENU_MAIN);
        int option = readIntFromConsole();
        switch(option){
            case 0:
                System.exit(0);
            case 1:
                salad = new Salad();
                readSaladName();
                runRandomSaladOptions();
                break;
            case 2:
                salad = new Salad();
                readSaladName();
                runCustomSaladOptions();
                break;
            default:
                System.out.println(ERROR_INCORRECT_OPTION);
                runMenu();
        }
    }
    private static void runRandomSaladOptions(){
        System.out.println(SEPARATOR_LINE);
        System.out.println(OPTIONS_RANDOM_SALAD);
        int number = readIntFromConsole();
        salad.makeRandomSalad(number);
        runSaladOptions();
    }
    private static void runCustomSaladOptions(){
        System.out.println(SEPARATOR_LINE);
        System.out.println(OPTIONS_CUSTOM_SALAD);
        int option = readIntFromConsole();
        switch(option){
            case 0:
                System.exit(0);
            case 1:
                salad.addVegetable(new Carrot());
                runCustomSaladOptions();
                break;
            case 2:
                salad.addVegetable(new Potato());
                runCustomSaladOptions();
                break;
            case 3:
                salad.addVegetable(new Cucumber());
                runCustomSaladOptions();
                break;
            case 4:
                salad.addVegetable(new Tomato());
                runCustomSaladOptions();
                break;
            case 5: //go to main menu
                runMenu();
                break;
            case 6: //salad is done
                runSaladOptions();
                break;
            default:
                System.out.println(ERROR_INCORRECT_OPTION);
                runCustomSaladOptions();
        }
    }
    private static void runSaladOptions(){
        System.out.println(SEPARATOR_LINE);
        System.out.println(OPTIONS_SALAD);
        int option = readIntFromConsole();
        switch(option) {
            case 0:
                System.exit(0);
            case 1:
                System.out.println(SEPARATOR_LINE);
                salad.printAllInfo();
                runSaladOptions();
                break;
            case 2:
                System.out.println(SEPARATOR_LINE);
                System.out.println("Salad '" + salad.getName() + "' has " + salad.getCalories() + " calories");
                runSaladOptions();
                break;
            case 3:
                sortOptions();
                break;
            case 4:
                findOptions();
                break;
            case 5:
                runMenu();
                break;
            default:
                System.out.println(ERROR_INCORRECT_OPTION);
                runSaladOptions();
        }
    }
    private static void findOptions(){
        System.out.println(SEPARATOR_LINE);
        System.out.println(OPTIONS_FIND);
        int option = readIntFromConsole();
        switch(option) {
            case 0:
                System.exit(0);
            case 1:
                findByCalories();
                runSaladOptions();
                break;
            case 2:
                runSaladOptions();
                break;
            default:
                System.out.println(ERROR_INCORRECT_OPTION);
                findOptions();
        }
    }
    private static void findByCalories(){
        System.out.println("Enter min value: ");
        int min = readIntFromConsole();
        System.out.println("Enter max value: ");
        int max = readIntFromConsole();

        System.out.println("Vegetables from the range:");
        ChiefHelper.printVegetablesInfo(salad.findByCalories(min,max));
    }
    private static void sortOptions(){
        System.out.println(SEPARATOR_LINE);
        System.out.println(OPTIONS_SORT);
        int option = readIntFromConsole();
        switch(option) {
            case 0:
                System.exit(0);
            case 1:
                salad.sortByCalories();
                salad.printAllInfo();
                runSaladOptions();
                break;
            case 2:
                runSaladOptions();
                break;
            default:
                System.out.println(ERROR_INCORRECT_OPTION);
                findOptions();
        }
    }
}
