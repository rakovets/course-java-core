package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.WhoElseWannaPizza;

public class Task7 {
    public static void getWhoWantsPizza(int piecesOfPizza, int amountOfKids) throws WhoElseWannaPizza, RuntimeException {
        if (piecesOfPizza % amountOfKids != 0) {
            throw new WhoElseWannaPizza("Who else wanna pizza?");
        }
        if (amountOfKids == 0) {
            throw new RuntimeException("There is noone who wants pizza(((");
        }
    }
}
