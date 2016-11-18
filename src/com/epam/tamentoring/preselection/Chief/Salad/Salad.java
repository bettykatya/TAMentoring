package com.epam.tamentoring.preselection.Chief.Salad;

import com.epam.tamentoring.preselection.Chief.Comparators.VegetableCaloriesComparator;
import com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables.Carrot;
import com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables.Cucumber;
import com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables.Potato;
import com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables.Tomato;
import com.epam.tamentoring.preselection.Chief.Ingredients.Vegetable;
import com.epam.tamentoring.preselection.Chief.Utils.ChiefHelper;

import java.util.ArrayList;
import java.util.Collections;

public class Salad {
    private ArrayList<Vegetable> ingredients;
    private String name;

    public Salad(){
        this.name = ChiefHelper.NEW_SALAD_NAME;
        ingredients = new ArrayList<Vegetable>();
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void addVegetable(Vegetable veg){
        this.ingredients.add(veg);
    }
    /**
     * Creates ArrayList of random available vegetables.
     * @param numberIngredients number of ingredients in salad
     */
    public void makeRandomSalad(int numberIngredients){
        ingredients.clear();
        ArrayList <Integer> ingrNumbers = ChiefHelper.getRandomValues(numberIngredients);
        for (int i = 0; i < ingrNumbers.size(); i++) {
            int num = ingrNumbers.get(i);
            switch(ChiefHelper.Veggies.values()[num]){
                case TOMATO:
                    ingredients.add(new Tomato());
                    break;
                case CUCUMBER:
                    ingredients.add(new Cucumber());
                    break;
                case POTATO:
                    ingredients.add(new Potato());
                    break;
                case CARROT:
                    ingredients.add(new Carrot());
                    break;
                default:
                    break;
            }

        }
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
    public void sortByCalories() {
        Collections.sort(ingredients, new VegetableCaloriesComparator());
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
    public void printAllInfo(){
        System.out.println("Salad '" + this.name + "' info:");
        System.out.format(ChiefHelper.FORMAT_STRING, "Ingredient", "Calories", "Fat", "Carbs");
        for (Vegetable veg : ingredients) {
            System.out.format(ChiefHelper.FORMAT_STRING, veg.getName(), veg.getCalories(), veg.getFat(), veg.getCarbs());
        }
    }

}
