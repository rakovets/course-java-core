package com.rakovets.course.java.core.practice.exception_handling;

public class Task6Application {
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        try {
            task6.fillArrayWithNumbers(0,0,1,0, "null");
        } catch (Task4Exception ex) {
            ex.getMessage();
        }
    }
}
