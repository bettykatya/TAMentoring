package com.epam.tamentoring.preselection.Chief.Salad;

import com.epam.tamentoring.preselection.Chief.Comparators.VegetableCaloriesComparator;
import com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables.Carrot;
import com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables.Cucumber;
import com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables.Potato;
import com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables.Tomato;
import com.epam.tamentoring.preselection.Chief.Ingredients.Vegetable;
import com.epam.tamentoring.preselection.Chief.Utils.ChiefHelper;
import com.epam.tamentoring.preselection.ChiefExceptions.Exceptions.IngredientNotExistsException;
import com.epam.tamentoring.preselection.ChiefExceptions.Exceptions.NoIngredientsException;
import com.epam.tamentoring.preselection.ChiefExceptions.Exceptions.SaladHasIngredientException;

import java.util.ArrayList;
import java.util.Collections;

public class Salad {
    private ArrayList<Vegetable> ingredients;
    private String name;

    public Salad(){
        this.name = ChiefHelper.NEW_SALAD_NAME;
        ingredients = new ArrayList<Vegetable>();
    }
    public Salad(Vegetable vegetable){
        this.name = ChiefHelper.NEW_SALAD_NAME;
        ingredients = new ArrayList<Vegetable>();
        ingredients.add(vegetable);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void addVegetable(Vegetable veg) throws SaladHasIngredientException{
        for (Vegetable ing : ingredients) {
            if (veg.getClass() == ing.getClass()){
                throw new SaladHasIngredientException();
            }
        }
        this.ingredients.add(veg);
    }
    /**
     * Creates Salad of random available vegetables.
     * @param numberIngredients number of ingredients in salad
     */
    public void makeRandomSalad(int numberIngredients) {
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
    public Vegetable getIngredient(int index) throws ArrayIndexOutOfBoundsException{
        if(index >= ingredients.size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        return ingredients.get(index);
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
    public double getCalories() throws IngredientNotExistsException {
        if(ingredients.size() == 0){
            throw new IngredientNotExistsException();
        }
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
    public void printAllInfo() throws NoIngredientsException{
        if(ingredients.size() == 0){
            throw new NoIngredientsException("No ingredient");
        }
        System.out.println("Salad '" + this.name + "' info:");
        ChiefHelper.printVegetablesInfo(this.getIngredients());
    }

}
