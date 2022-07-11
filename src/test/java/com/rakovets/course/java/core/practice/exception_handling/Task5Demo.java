package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.DivisionOfNumbersExcepton;

public class Task5Demo {
    public static void main(String[] args) {
        Task5 division = new Task5();

        try {
            System.out.println(division.divisionOfNumbers(10, 0));
        } catch (DivisionOfNumbersExcepton e) {
            System.out.println(e.getMessage());
        }
    }
}
