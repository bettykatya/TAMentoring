package com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables;

import com.epam.tamentoring.preselection.Chief.Utils.ChiefHelper;
import com.epam.tamentoring.preselection.Chief.Ingredients.VegetableTypes.RootVegetable;

public class Carrot extends RootVegetable {
    public Carrot() {
        super(ChiefHelper.CARROT_NAME,ChiefHelper.CARROT_CALORIES,ChiefHelper.CARROT_FAT,ChiefHelper.CARROT_CARBS);
        this.peel();
    }
}
