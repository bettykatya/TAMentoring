package com.epam.tamentoring.preselection.Chief.Comparators;

import com.epam.tamentoring.preselection.Chief.Ingredients.Vegetable;
import java.util.Comparator;

public class VegetableCaloriesComparator implements Comparator <Vegetable> {
    public int compare(Vegetable veg1, Vegetable veg2){
        if(veg1.getCalories()>veg2.getCalories())
            return 1;
        else if (veg1.getCalories()<veg2.getCalories())
            return -1;
        else
            return 0;
    }
}
