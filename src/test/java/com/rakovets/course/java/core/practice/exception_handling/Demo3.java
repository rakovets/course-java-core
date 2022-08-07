package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.DivisionException;

public class Demo3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        try {
            System.out.println(task3.divisionNumber(5.0, 0));
        } catch (DivisionException e) {
            System.err.println(e.getMessage());
        }
    }
}
