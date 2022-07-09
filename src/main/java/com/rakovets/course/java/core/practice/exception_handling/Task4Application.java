package com.rakovets.course.java.core.practice.exception_handling;

public class Task4Application {
    public static void main(String[] args) {
        Task4 task4 = new Task4();
        try {
            task4.divideTwoNumbers(1,0);
        } catch (Task4Exception ex) {
            ex.printStackTrace();
        }
    }
}
