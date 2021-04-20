package com.rakovets.course.java.core.practice.exception_handling;

public class SecTaskDemo {
    public static void main(String[] args) {
        try {
            SecTask.arrayException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bounds of the array");
        }
    }
}
