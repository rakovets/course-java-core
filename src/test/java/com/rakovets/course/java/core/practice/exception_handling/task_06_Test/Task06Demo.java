package com.rakovets.course.java.core.practice.exception_handling.task_06_Test;

import com.rakovets.course.java.core.practice.exception_handling.task_06.Task06;

public class Task06Demo {
    public static void main(String[] args) {
        try {
            Task06.randomException();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("One of the Exceptions");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}
