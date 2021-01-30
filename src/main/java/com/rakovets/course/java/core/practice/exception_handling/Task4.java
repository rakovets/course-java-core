package com.rakovets.course.java.core.practice.exception_handling;

public class Task4 {

    public static void main(String[] args) {
        try {
            System.out.println(arithmetic(1, 0));
        } catch (CustomRunTimeException run) {
            run.printStackTrace(System.out);
        }
    }

    public static int arithmetic (int x, int y) throws CustomRunTimeException {
        if (x == 0 || y == 0) {
            throw new CustomRunTimeException("You just divided by '0'");
        }
        return x / y;
    }
}
