package com.epam.tamentoring.preselection.ChiefExceptions.Exceptions;

/**
 * Exception is thrown when salad has ingredient to be added.
 */
public class SaladHasIngredientException extends Exception {
    public SaladHasIngredientException(){

    }
    public SaladHasIngredientException(String message){
        super(message);
    }
}
