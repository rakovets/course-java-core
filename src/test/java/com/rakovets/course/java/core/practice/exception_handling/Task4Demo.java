package com.rakovets.course.java.core.practice.exception_handling;

public class Task4Demo {
    public static void main(String[] args) {
        try {
            double result = Task4.RotationFrequency.getRotationFrequency(180, -60);
            System.out.println(result);
        } catch (Task4.IllegalRotationValueException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
