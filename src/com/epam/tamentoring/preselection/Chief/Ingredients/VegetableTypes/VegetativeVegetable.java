package com.epam.tamentoring.preselection.Chief.Ingredients.VegetableTypes;

import com.epam.tamentoring.preselection.Chief.Ingredients.Vegetable;

public class VegetativeVegetable extends Vegetable{
    private String type;

    public VegetativeVegetable(){
        super();
        type = "Vegetative";
    }
    public VegetativeVegetable(String name, double calories, double fat, double carbs){
        super(name, calories,fat,carbs);
        type = "Vegetative";
    }
}
