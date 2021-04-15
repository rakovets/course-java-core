package com.rakovets.course.java.core.practice.exception_handling;

public class Task02Demo {
    public static void main(String[] args) {
        Task02 task02 = new Task02();
        try {
            task02.fill(new int[5], 5);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("IndexOutOfBoundsException");
        }
    }
}
