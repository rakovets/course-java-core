package com.rakovets.course.java.core.practice.exception_handling;

public class Task2Demo {
    public static void main(String[] args) {
        try {
            Task2.ThrowArray();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This is ArrayIndexOutOfBounds");
        }
    }
}
