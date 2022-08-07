package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.AreaException;

public class Demo4 {
    public static void main(String[] args) {
        Task4 task4 = new Task4();
        try {
            System.out.println(task4.calculationArea(0));
        } catch (AreaException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
