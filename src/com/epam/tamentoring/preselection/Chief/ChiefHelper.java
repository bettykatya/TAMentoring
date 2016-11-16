package com.epam.tamentoring.preselection.Chief;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Katsiaryna Krechko on 11/12/2016.
 */
public class ChiefHelper {
    //todo remove name properties?
    public static final double TOMATO_CALORIES = 18.9;
    public static final double TOMATO_FAT = 0.3;
    public static final double TOMATO_CARBS = 4.2;
    public static final String TOMATO_NAME = "Tomato";

    public static final double CUCUMBER_CALORIES = 18.9;
    public static final double CUCUMBER_FAT = 0.3;
    public static final double CUCUMBER_CARBS = 4.2;
    public static final String CUCUMBER_NAME = "Cucumber";

    public static final double POTATO_CALORIES = 18.9;
    public static final double POTATO_FAT = 0.3;
    public static final double POTATO_CARBS = 4.2;
    public static final String POTATO_NAME = "Potato";

    public static final String NEW_SALAD_NAME = "New Salad";
    public static final int NUMBER_VEGETABLES = 3;

    public static ArrayList<Integer> getRandomValues(int valuesQuantity){
        ArrayList <Integer> randValues = new ArrayList<>();

        //TODO add exception
        if(valuesQuantity > NUMBER_VEGETABLES){
            valuesQuantity = NUMBER_VEGETABLES;
        }

        Random random = new Random();
        for (int i = 0; i < valuesQuantity; i++) {
            int num = random.nextInt(NUMBER_VEGETABLES);
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
        TOMATO, POTATO, CUCUMBER;
    }
}
