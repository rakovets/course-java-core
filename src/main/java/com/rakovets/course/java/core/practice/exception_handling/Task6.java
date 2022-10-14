package com.rakovets.course.java.core.practice.exception_handling;

public class Task6 {
    public void differentExceptions(int number) {
        switch (number) {
            case 0:
                throw new NullPointerException();
            case 1:
                throw new ClassCastException();
            case 2:
                throw new ArithmeticException();
        }
    }
}
