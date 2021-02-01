package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.model.Task_6;

public class Task_6_demo {
    public static void main(String[] args) throws Exception {
        try {
            Task_6.getRandomException();
        } catch (NullPointerException | ArithmeticException ex) {
            System.out.println("This is unchecked exception");
            ex.printStackTrace();
        } catch (InterruptedException ex) {
            System.out.println("This is checked exception. InterruptedException.");
        }
    }
}
