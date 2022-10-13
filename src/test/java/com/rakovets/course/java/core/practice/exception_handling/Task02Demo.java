package com.rakovets.course.java.core.practice.exception_handling;

public class Task02Demo {
    public static void main(String[] args) {
        Task02 task02 = new Task02();
        try {
            task02.arrayIndexOutOfBounds();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index of array");
        }
    }
}
