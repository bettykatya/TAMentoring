package com.epam.tamentoring.preselection.ChiefExceptions;

import com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables.Potato;
import com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables.Tomato;
import com.epam.tamentoring.preselection.Chief.Ingredients.Vegetable;
import com.epam.tamentoring.preselection.Chief.Salad.Salad;
import com.epam.tamentoring.preselection.ChiefExceptions.Exceptions.IngredientNotExistsException;
import com.epam.tamentoring.preselection.ChiefExceptions.Exceptions.NoIngredientsException;
import com.epam.tamentoring.preselection.ChiefExceptions.Exceptions.SaladHasIngredientException;

/**
 * NumberFormatException - Menu.java  readIntFromConsole()
 * IOException - Menu.java  readStringFromConsole()
 * ArrayIndexOutOfBoundsException - Salad.java  getIngredient(int index)
 * IllegalArgumentException - Vegetable.java  Vegetable(String name, double calories, double fat, double carbs)
 * NullPointerException - Vegetable.java  getName()
 * --------------------------------------------------------
 * SaladHasIngredientException - Salad.java  addVegetable(Vegetable veg)
 * NoIngredientsException - Salad.java  printAllInfo()
 * IngredientNotExistsException - Salad.java  getCalories()
 */
public class RunnerExceptions {
    public static void main(String[] args) {
        checkNoIngredients();
        checkIngredientNotExists();
        checkSaladHasIngredient();
        checkArrayIndexOutOfBoundsException();
        checkNullPointerException();
    }
    private static void checkNoIngredients(){
        Salad salad = new Salad();
        try {
            salad.printAllInfo();
        }
        catch (NoIngredientsException e){
            System.out.println(e.getClass() + "  Salad has no ingredients.");
        }
    }
    private static void checkIngredientNotExists(){
        Salad salad = new Salad();
        try {
            salad.getCalories();
        }
        catch (IngredientNotExistsException e){
            System.out.println(e.getClass() + "  Salad has no ingredients.");
        }
    }
    private static void checkSaladHasIngredient(){
        Salad salad = new Salad();
            try {
                salad.addVegetable(new Potato());
                salad.addVegetable(new Potato());
            }
            catch(SaladHasIngredientException e){
                System.out.println(e.getClass() + "  Salad already contains this vegetable");
            }
        }

    private static void checkArrayIndexOutOfBoundsException(){
        Salad salad = new Salad(new Tomato());
        try{
            Vegetable veg = salad.getIngredient(2);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getClass() + ": index out of range");
        }
    }
    private static void checkNullPointerException(){
        Vegetable veg = new Vegetable("",1,1,1);
        try{
            String name = veg.getName();
        }
        catch (NullPointerException e){
            System.out.println(e.getClass() + ": name is empty");
        }
    }

}
