package com.rakovets.course.java.core.practice.exception_handling;

import java.io.FileNotFoundException;

public class Task7Demo {
    public static void main(String[] args) {
        Task7 task7 = new Task7();
        double random = Math.random();

        try {
            task7.throwExceptionFiftyPercent(random);
            System.out.println("New random = " + 2 * random);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("random = " + random);
        }
    }
}
