package com.epam.tamentoring.preselection.Chief;

import com.epam.tamentoring.preselection.Chief.Ingredients.Vegetable;

import java.util.ArrayList;

/**
 * Created by Katsiaryna Krechko on 11/12/2016.
 */
public class Salad {
    private ArrayList<Vegetable> ingredients;
    private String name = ChiefHelper.NEW_SALAD_NAME;

    public Salad(){
        ingredients = new ArrayList<Vegetable>();
    }
    public Salad(Vegetable veg){
        ingredients = new ArrayList<Vegetable>();
        ingredients.add(veg);
    }
    public Salad(ArrayList <Vegetable> veg){
        ingredients = veg;
    }
    public Salad(String name, ArrayList <Vegetable> veg){
        this.name = name;
        ingredients = veg;
    }

    public void makeRandomSalad(){

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

    public double getCalories(){
        double calories = 0;
        for (int i = 0; i < ingredients.size(); i++) {
            calories += ingredients.get(i).getCalories();
        }
        return calories;
    }
    @Override
    public String toString(){
        String ing = "";
        for (int i = 0; i < ingredients.size(); i++) {
            ing += ingredients.get(i).getName() + " ";
        }

        return "Salad '" + name + "' has following ingredients: " + ing;
    }
}
