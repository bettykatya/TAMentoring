package com.epam.tamentoring.preselection.Chief;

import com.epam.tamentoring.preselection.Chief.Ingredients.Vegetable;

import java.util.ArrayList;

/**
 * Created by Katsiaryna Krechko on 11/12/2016.
 */
public class Salad {
    private ArrayList<Vegetable> ingredients;

    public Salad(){
        ingredients = new ArrayList<Vegetable>();
    }
    public ArrayList<Vegetable> getIngredients(){
        return ingredients;
    }

    public ArrayList<Vegetable> findByCalories(double min, double max){
        if(min > max){
            double temp = min;
            min = max;
            max = temp;
        }

        ArrayList<Vegetable> ingred = new ArrayList<Vegetable>();

        for (int i = 0; i < ingredients.size(); i++) {
            double cal = ingredients.get(i).getCalories();
            if( cal>min && cal<max ){
                ingred.add(ingredients.get(i));
            }
        }
        return ingred;
    }
}
