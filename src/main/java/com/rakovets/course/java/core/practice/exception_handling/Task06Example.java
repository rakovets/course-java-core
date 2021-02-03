package com.rakovets.course.java.core.practice.exception_handling;

import java.io.FileNotFoundException;

public class Task06Example {
    public static void main(String[] args) {
        try {
            Task06.getRandomException();
        } catch (FileNotFoundException | ArrayIndexOutOfBoundsException e) {
            System.out.println("First text");
        } catch (NullPointerException e) {
            System.out.println("Second text");
        }
    }
}
