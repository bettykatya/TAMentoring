package com.epam.tamentoring.preselection.Chief.Ingredients.VegetableTypes;

import com.epam.tamentoring.preselection.Chief.Ingredients.Vegetable;
import com.epam.tamentoring.preselection.Chief.Interfaces.Peelable;

public class RootVegetable extends Vegetable implements Peelable {
    public String type;
    public boolean peeled;

    public RootVegetable(){
        super();
        type = "Root";
        peeled = false;
    }
    public RootVegetable(String name, double calories, double fat, double carbs){
        super(name, calories,fat,carbs);
        type = "Root";
        peeled = false;
    }

    @Override
    public void peel() {
        peeled = true;
    }
}
