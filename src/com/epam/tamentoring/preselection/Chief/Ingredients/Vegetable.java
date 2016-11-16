package com.epam.tamentoring.preselection.Chief.Ingredients;

/**
 * Created by Katsiaryna Krechko on 11/12/2016.
 */
public class Vegetable {
    private String name = "NONAME";
    private double calories;
    private double fat;
    private double carbs;

    public void setName(String name){
        this.name = name;
    }
    public void setCalories(double veg_calories){
        this.calories = veg_calories;
    }
    public void setFat(double veg_fat){
        this.fat = veg_fat;
    }
    public void setCarbs(double veg_carbs){
        this.carbs = veg_carbs;
    }

    public double getCalories(){
        return this.calories;
    }
    public String getName(){
        return this.name;
    }

}
