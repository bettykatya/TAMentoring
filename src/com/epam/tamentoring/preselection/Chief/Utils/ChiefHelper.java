package com.epam.tamentoring.preselection.Chief.Utils;

import com.epam.tamentoring.preselection.Chief.Ingredients.Vegetable;

import java.util.ArrayList;
import java.util.Random;

public class ChiefHelper {
    public static final double TOMATO_CALORIES = 18.9;
    public static final double TOMATO_FAT = 0.3;
    public static final double TOMATO_CARBS = 4.2;
    public static final String TOMATO_NAME = "Tomato";

    public static final double CUCUMBER_CALORIES = 17.6;
    public static final double CUCUMBER_FAT = 2.7;
    public static final double CUCUMBER_CARBS = 1.9;
    public static final String CUCUMBER_NAME = "Cucumber";

    public static final double POTATO_CALORIES = 92.9;
    public static final double POTATO_FAT = 56.4;
    public static final double POTATO_CARBS = 43.2;
    public static final String POTATO_NAME = "Potato";

    public static final double CARROT_CALORIES = 87;
    public static final double CARROT_FAT = 98.1;
    public static final double CARROT_CARBS = 15.5;
    public static final String CARROT_NAME = "Carrot";

    public static final String NEW_SALAD_NAME = "New Salad";
    public static final int NUMBER_ALL_VEGETABLES = Veggies.values().length;
    public static final double DEFAULT_CALORIES_FAT_CARBS = -1;
    public static final String FORMAT_STRING = "%-17s%-15s%-15s%-15s%n";

    /**
     * @param valuesQuantity size of returned list
     * @return list of unique integers
     */
    public static ArrayList<Integer> getRandomValues(int valuesQuantity){
        ArrayList <Integer> randValues = new ArrayList<>();
        if(valuesQuantity > NUMBER_ALL_VEGETABLES){
            valuesQuantity = NUMBER_ALL_VEGETABLES;
        }

        Random random = new Random();
        for (int i = 0; i < valuesQuantity; i++) {
            int num = random.nextInt(NUMBER_ALL_VEGETABLES);
            if(randValues.contains(num)){
                i--;
                continue;
            }
            else{
                randValues.add(num);
            }
        }
        return randValues;
    }
    public enum Veggies{
        TOMATO, POTATO, CUCUMBER, CARROT
    }
    public static void printVegetablesInfo(ArrayList<Vegetable> vegetables){
        System.out.format(ChiefHelper.FORMAT_STRING, "Vegetable", "Calories", "Fat", "Carbs");
        for (Vegetable veg : vegetables) {
            System.out.format(FORMAT_STRING, veg.getName(), veg.getCalories(), veg.getFat(), veg.getCarbs());
        }
    }
}
