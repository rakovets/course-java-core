package com.rakovets.course.challenge.exception_handling;

public class Task4 {
    public static float checkDivision(int x, int y) throws MyException2 {
        if (y == 0) {
            throw new MyException2("You can't divide on zero!");
        }
        float result = (float) x / (float) y;
        return result;
    }
}
