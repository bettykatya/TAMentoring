package com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables;

import com.epam.tamentoring.preselection.Chief.Utils.ChiefHelper;
import com.epam.tamentoring.preselection.Chief.Ingredients.VegetableTypes.VegetativeVegetable;

public class Tomato extends VegetativeVegetable {
    public Tomato() {
        super(ChiefHelper.TOMATO_NAME,ChiefHelper.TOMATO_CALORIES,ChiefHelper.TOMATO_FAT,ChiefHelper.TOMATO_CARBS);
    }
}
