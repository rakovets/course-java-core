package com.rakovets.course.java.core.practice.exception_handling;

public class Task5Application {
    public static void main(String[] args) {

        Task5 task5 = new Task5();
        try {
            task5.divideTwoNumbers(0,0);
        } catch (Task4Exception ex) {
            ex.getMessage();
        }
    }
}
