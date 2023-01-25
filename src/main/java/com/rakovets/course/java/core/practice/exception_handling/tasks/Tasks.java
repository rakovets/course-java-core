package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.CustomRuntimeException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.DegreeOfAlcoholValidation;

public class Tasks {
    public void callNullPointerException() {
        String str = null;
        str.concat("mistake");
    }

    public void callArrayIndexOutOfBoundsException() {
        String[] string = new String[4];
        string[6] = "Are you an idiot?";
    }

    public boolean callDegreeOfAlcoholValidation(int degreeOfAlcohol) throws DegreeOfAlcoholValidation {
        if (degreeOfAlcohol < 40) {
            throw new DegreeOfAlcoholValidation();
        }
        return true;
    }

    public boolean callMyCustomRuntimeException(int Age) {
        if (Age < 18) {
            throw new CustomRuntimeException("You can't buy alcohol");
        }
        return true;
    }

    public void catchArrayIndexOutOfBoundsException() {
        try {
            String[] string = new String[4];
            string[6] = "Are you an idiot?";
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new CustomRuntimeException(ex.getMessage());
        }
    }

    public void catchTreeException() {
        try {
            int[] someInt = new int[4];
            someInt[6] = 11;
            someInt[0] = Integer.parseInt("1a");
            someInt[1] = Integer.parseInt("eee3a");
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException ex) {
            throw new CustomRuntimeException("ArrayIndexOutOfBoundsException");
        }
    }
}
