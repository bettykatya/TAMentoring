package com.epam.tamentoring.preselection.Chief.Ingredients;

public class Vegetable {
    private String name;
    private double calories;
    private double fat;
    private double carbs;

    public Vegetable(){

    }
    public Vegetable(String name, double calories, double fat, double carbs) throws IllegalArgumentException{
        if(calories<0 || fat<0 || carbs<0){
            throw new IllegalArgumentException();
        }
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


    public String getName() throws NullPointerException{
        if(this.name == ""){
            throw new NullPointerException();
        }
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
