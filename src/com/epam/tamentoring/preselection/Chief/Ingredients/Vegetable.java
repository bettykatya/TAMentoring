package com.epam.tamentoring.preselection.Chief.Ingredients;

import static com.epam.tamentoring.preselection.Chief.Utils.ChiefHelper.DEFAULT_CALORIES_FAT_CARBS;

public class Vegetable {
    private String name;
    private double calories;
    private double fat;
    private double carbs;

    public Vegetable(){
        name = "NONAME";
        calories = DEFAULT_CALORIES_FAT_CARBS;
        fat = DEFAULT_CALORIES_FAT_CARBS;
        carbs = DEFAULT_CALORIES_FAT_CARBS;
    }
    public Vegetable(String name, double calories, double fat, double carbs){
        this.name = name;
        this.calories = calories;
        this.fat = fat;
        this.carbs = carbs;
    }
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


    public String getName(){
        return this.name;
    }
    public double getCalories(){
        return this.calories;
    }
    public double getFat(){
        return this.fat;
    }
    public double getCarbs(){
        return this.carbs;
    }

}
