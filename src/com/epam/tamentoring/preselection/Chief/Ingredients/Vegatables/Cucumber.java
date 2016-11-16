package com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables;

import com.epam.tamentoring.preselection.Chief.Utils.ChiefHelper;
import com.epam.tamentoring.preselection.Chief.Ingredients.VegetableTypes.VegetativeVegetable;

public class Cucumber extends VegetativeVegetable {
    public Cucumber() {
        super(ChiefHelper.CUCUMBER_NAME,ChiefHelper.CUCUMBER_CALORIES,ChiefHelper.CUCUMBER_FAT,ChiefHelper.CUCUMBER_CARBS);
    }
}
