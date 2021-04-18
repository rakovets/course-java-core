package com.rakovets.course.java.core.practice.exception_handling;

import java.io.FileNotFoundException;

public class Task07Demo {
    public static void main(String[] args) {
        Task07 task07 = new Task07();
        try {
            task07.throwException50Percent();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("close all files");
        }
    }
}
