package com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables;

import com.epam.tamentoring.preselection.Chief.ChiefHelper;
import com.epam.tamentoring.preselection.Chief.Ingredients.Vegetable;

/**
 * Created by Katsiaryna Krechko on 11/12/2016.
 */
public class Potato extends Vegetable{
    public Potato() {
        setName(ChiefHelper.POTATO_NAME);
        setCalories(ChiefHelper.POTATO_CALORIES);
        setCarbs(ChiefHelper.POTATO_CARBS);
        setFat(ChiefHelper.POTATO_FAT);
    }
}
