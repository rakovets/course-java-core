package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.task05.Task5GenExeption;

public class Task5 {
    public static void main(String[] args) throws Task5GenExeption {

        try {
            throw new RuntimeException("The RuntimeExeption has been Catched");
        } catch (RuntimeException ex) {
            try {
                throw new Task5GenExeption(ex.getMessage());
            } catch (Task5GenExeption exep) {
                System.out.println("Exeception came from " + ex);
            }
        }

    }
}
