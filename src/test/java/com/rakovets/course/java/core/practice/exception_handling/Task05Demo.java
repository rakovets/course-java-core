package com.rakovets.course.java.core.practice.exception_handling;

public class Task05Demo {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(Task05.lengthReturner(null));
        } catch (Exception e) {
            throw new MyNullPointerException(e.getMessage());
        }
    }
}
