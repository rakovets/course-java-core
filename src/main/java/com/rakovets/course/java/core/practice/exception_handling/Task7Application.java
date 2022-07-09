package com.rakovets.course.java.core.practice.exception_handling;

public class Task7Application {
    public static void main(String[] args) {

        Task7 task7 = new Task7();
        try {
            task7.divideNumbers(2,6);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Final block");
        }

        try {
            task7.divideNumbers(2,0);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Final block");
        }
    }
}

