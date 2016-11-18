package com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables;

import com.epam.tamentoring.preselection.Chief.Utils.ChiefHelper;
import com.epam.tamentoring.preselection.Chief.Ingredients.VegetableTypes.RootVegetable;

public class Potato extends RootVegetable{
    public Potato() {
        super(ChiefHelper.POTATO_NAME,ChiefHelper.POTATO_CALORIES,ChiefHelper.POTATO_FAT,ChiefHelper.POTATO_CARBS);
        this.peel();
    }
}
