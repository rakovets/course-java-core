package com.rakovets.course.java.core.practice.exception_handling;

public class Task_5 {

    private int number;

    public Task_5(int number) {
            this.number = number;
        }

        public static void checkNumber(int number) throws NumberCountException {
            if (number < 30)
                throw new NumberCountException("Number less then x", "try again");
        }
    }
