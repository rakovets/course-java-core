package com.rakovets.course.java.core.practice.exception_handling;

public class Task05Demo {
    public static void main(String[] args) throws MyException {
        Task05 task = new Task05();
        try {
            System.out.println(task.divisionNumbers(6, 20));
        } catch (ArithmeticException ex) {
            throw new MyException(ex.getMessage());
        }
    }
}
