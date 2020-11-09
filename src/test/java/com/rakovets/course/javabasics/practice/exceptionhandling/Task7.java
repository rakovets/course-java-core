package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task7 {

    public static void main(String[] args) {
        FiftyFifty obj = new FiftyFifty();
        try {
            obj.getExceptionFiftyFifty();
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Finally checked!");
        }
    }
}
