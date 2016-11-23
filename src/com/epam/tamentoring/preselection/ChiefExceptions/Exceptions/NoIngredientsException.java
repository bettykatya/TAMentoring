package com.epam.tamentoring.preselection.ChiefExceptions.Exceptions;

/**
 * Exception is thrown when salad has no ingredients.
 */
public class NoIngredientsException extends Exception {
    public NoIngredientsException(String message){
        super(message);
    }
}
