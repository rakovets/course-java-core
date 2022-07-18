package com.rakovets.course.java.core.practice.exception_handling;

public class Task6Application {
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        try {
            task6.fillArrayWithNumbers(5,1,1,1, null);
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            ex.getCause();
        }

        try {
            task6.fillArrayWithNumbers(0,1,1,0, "null");
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            ex.getCause();
        }

        try {
            task6.fillArrayWithNumbers(0,1,1,1, null);
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            ex.getCause();
        }
    }
}
