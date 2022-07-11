package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.NumberIsOverHundredException;

public class Task3Demo {
    public static void main(String[] args) throws NumberIsOverHundredException {
        Task3 testHundred = new Task3();

        try {
            System.out.println(testHundred.numberIsOverHundred(1001));
        } catch (NumberIsOverHundredException e) {
            e.printStackTrace();
        }
    }
}
