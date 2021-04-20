package com.rakovets.course.java.core.practice.exception_handling;
import com.rakovets.course.java.core.practice.exception_handling.MyException;

public class Task5Demo {
    public static void main(String[] args) {
        Task5 task5 = new Task5();

        try {
            System.out.println(task5.getDevideNumbers(5, 10));
        } catch (ArithmeticException ex) {
            throw new MyException(ex.getMessage());
        }
    }
}
