package com.epam.tamentoring.preselection.Chief;

import com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables.Tomato;
import com.epam.tamentoring.preselection.Chief.Ingredients.Vegetable;

import java.util.ArrayList;

/**
 * Created by Katsiaryna Krechko on 11/12/2016.
 */
public class Runner {
    public static void main(String[] args) {
        Salad salad = makeSalad();
        System.out.println(salad);
    }

    private static Salad makeSalad(){
        ArrayList <Vegetable> vegetables = new ArrayList<Vegetable>();
        Tomato tom = new Tomato();
        for (int i = 0; i < 4; i++) {
            vegetables.add(tom);
        }

        Salad salad= new Salad("Tomato Salad", vegetables);
        return salad;
    }
}
