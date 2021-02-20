package com.rakovets.course.java.core.practice.exception_handling.task_1;

public class Tasks1And2 {
    public static void main(String[] args) {
        stringException();
        outOfArray();
    }

//    Specification of task 1
    public static void stringException() {
        String str = null;
        try {
            System.out.println(str.trim());
        } catch (NullPointerException e) {
            System.out.println(e.fillInStackTrace());
        }
    }

//    Specification of task 2
    public static void outOfArray() {
        String[] array = new String[2];
        try {
            array[2] = "Error";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is less: " + e.getMessage());
        }
    }
}
