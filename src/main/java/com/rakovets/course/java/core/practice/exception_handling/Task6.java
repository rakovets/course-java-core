package com.rakovets.course.java.core.practice.exception_handling;

public class Task6 {
    public void getOneOfThreeExceptions(int variant) throws ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException {
        switch (variant) {
            case 1:
                int a = 5 / 0;
                break;
            case 2:
                int[] b = new int[3];
                b[4] = 10;
                break;
            case 3:
                String n = null;
                n.length();
                break;
        }
    }
}
