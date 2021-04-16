package com.rakovets.course.java.core.practice.exception_handling;

public class Task03Demo {
    public static void main(String[] args) throws Task03 {
        try {
            int result = Task03.getDivisionOfNumbers(0);
            System.out.println(result);
        } catch (Task03 e) {
            System.out.println(e.getMessage());
            System.out.println(e.getNumber());
        }
    }
}
