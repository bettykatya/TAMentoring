package com.epam.tamentoring.preselection.Chief;

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
    public Salad(String name){
        this.name = name;
        ingredients = new ArrayList<Vegetable>();
    }

    /**
     * Creates ArrayList of random available vegetables.
     * @param numberIngredients number of ingredients in salad
     */
    public void makeRandomSalad(int numberIngredients){
        ingredients.clear();
        ArrayList <Integer> ingrNumbers = ChiefHelper.getRandomValues(numberIngredients);
        //TODO add enum with vegetable types and add switch-case in for-i cycle
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
                //TODO add custom exception
            }

        }
    }
    public ArrayList<Vegetable> getIngredients(){
        return ingredients;
    }
    //TODO add exception if no veg's found
    //TODO add exception if veg is already in salad
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
        System.out.format(ChiefHelper.FORMAT_STRING, "Ingredient", "Calories", "Fat", "Carbs");
        for (Vegetable veg : ingredients) {
            System.out.format(ChiefHelper.FORMAT_STRING, veg.getName(), veg.getCalories(), veg.getFat(), veg.getCarbs());
        }
    }

}
