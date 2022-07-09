package com.rakovets.course.java.core.practice.exception_handling;

public class Task3Application {
    public static void main(String[] args) {

        Task3 task3 = new Task3();

        try {
            String result = task3.checkAge(-1);
            System.out.println(result);
        } catch (Task3Exception ex) {
            ex.printStackTrace();
        }
    }
}
