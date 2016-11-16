package com.epam.tamentoring.preselection.Chief;

import com.epam.tamentoring.preselection.Chief.Utils.Menu;

//TODO remove useless comments, imports, etc.
public class Runner {
    public static void main(String[] args) {
        //Salad salad = makeSalad();
        //System.out.println(salad);
        //System.out.println(ChiefHelper.getRandomValues(2));

        /*
        Salad salad = new Salad("SaladName");
        salad.makeRandomSalad(4);
        System.out.println(salad);
        salad.printAllInfo();

        System.out.println(salad.getCalories());
        System.out.println("find by calories 15-20");
        ChiefHelper.printVegetablesInfo(salad.findByCalories(100,5));

        salad.sortByCalories();
        System.out.println("sort by calories");
        ChiefHelper.printVegetablesInfo(salad.getIngredients());
        */
        //System.out.println(salad.findByCalories(15,20));
        //System.out.println(new VegetativeVegetable().getCalories());
        Menu.runMenu();
    }
}
