package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.CustomException;

public class Demo7 {
    public static void main(String[] args) {
        int number = 5;
        Task7 t7 = new Task7();
        try {
            t7.generateException(number);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            System.out.println("this code work in any case");
        }
    }
}
