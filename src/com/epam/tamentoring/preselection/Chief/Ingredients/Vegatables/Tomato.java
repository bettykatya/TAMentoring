package com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables;

import com.epam.tamentoring.preselection.Chief.ChiefHelper;
import com.epam.tamentoring.preselection.Chief.Ingredients.Vegetable;

/**
 * Created by Katsiaryna Krechko on 11/12/2016.
 */
public class Tomato extends Vegetable {

    public Tomato(){
        setCalories(ChiefHelper.TOMATO_CALORIES);
        setCarbs(ChiefHelper.TOMATO_CARBS);
        setFat(ChiefHelper.TOMATO_FAT);
    }
}
