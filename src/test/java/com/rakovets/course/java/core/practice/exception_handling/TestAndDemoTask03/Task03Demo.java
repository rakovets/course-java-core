package com.rakovets.course.java.core.practice.exception_handling.TestAndDemoTask03;

import com.rakovets.course.java.core.practice.exception_handling.Task03;

public class Task03Demo {
    public static void main(String[] args) throws Task03 {

        try {
            Task03.throwException(0);
        } catch (Task03 e) {
            System.out.println("This is ArithmeticException");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
