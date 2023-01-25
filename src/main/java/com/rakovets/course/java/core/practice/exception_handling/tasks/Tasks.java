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

    public void catchArrayIndexOutOfBoundsExceptionAndThrow() {
        try {
            String[] string = new String[4];
            string[6] = "Are you an idiot?";
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new CustomRuntimeException(ex.getMessage());
        }
    }

    public int[] catchTreeException(int number) {
        int mistake = 0;
        int[] someInt = new int[2];
        if (number > 0 && number < 10) {
            someInt[2] = someInt.length;
        }
        if (number > 10 && number < 20) {
            someInt[0] = Integer.parseInt("1a");
        }
        if (number > 20) {
            someInt[0] = someInt[1] / mistake;
        }
        return someInt;
    }

    public String catchTwoExceptions(int Age) {
        String answer = "you can buy this battle";
        String verbalAgreement = null;
        if (Age > 18) {
            answer = verbalAgreement.concat(verbalAgreement);
        }
        if (Age < 18) {
            throw new CustomRuntimeException("You can't buy alcohol");
        }
        return answer;
    }
}
