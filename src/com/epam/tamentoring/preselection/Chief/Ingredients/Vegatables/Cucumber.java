package com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables;

import com.epam.tamentoring.preselection.Chief.ChiefHelper;
import com.epam.tamentoring.preselection.Chief.Ingredients.Vegetable;

/**
 * Created by Katsiaryna Krechko on 11/12/2016.
 */
public class Cucumber extends Vegetable {
    public Cucumber() {
        setName(ChiefHelper.CUCUMBER_NAME);
        setCalories(ChiefHelper.CUCUMBER_CALORIES);
        setCarbs(ChiefHelper.CUCUMBER_CARBS);
        setFat(ChiefHelper.CUCUMBER_FAT);
    }
}
