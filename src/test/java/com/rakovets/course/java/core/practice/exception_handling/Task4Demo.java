package com.rakovets.course.java.core.practice.exception_handling;

public class Task4Demo {
    public static void main(String[] args) {
        Task4 task4 = new Task4();

        try {
            double number = task4.setNumber(-787);
            System.out.println("Square root " + number + " = " + task4.getNumber());
        } catch (NegativeNumberException ex) {
            ex.printStackTrace();
        }
    }
}
