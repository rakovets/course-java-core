package com.rakovets.course.java.core.practice.exception_handling;

public class Task04_Demo {
    public static void main(String[] args) {
        int n = 0;
        try {
            Task04.divisionByZero();
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
