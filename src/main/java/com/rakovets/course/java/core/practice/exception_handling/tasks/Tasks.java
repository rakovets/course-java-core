package com.rakovets.course.java.core.practice.exception_handling.tasks;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.AgeValidation;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.DegreeOfAlcoholValidation;

public class Tasks {
    public void causeNullPointerException() {
        String str = null;
        str.concat("mistake");
    }

    public void causeArrayIndexOutOfBoundsException() {
        String[] string = new String[4];
        string[6] = "Are you an idiot?";
    }

    public boolean causeMyCustomException(int degreeOfAlcohol) throws DegreeOfAlcoholValidation {
        if (degreeOfAlcohol < 40) {
            throw new DegreeOfAlcoholValidation();
        }
        return true;
    }

    public boolean causeMyCustomRuntimeException(int Age)  {
        if (Age < 18) {
            throw new AgeValidation("You can't buy alcohol");
        }
        return true;
    }




}
