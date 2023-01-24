package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task06;

public class Task06Demo {
    public static void main(String[] args) throws Exception {
        String randomResult;

        try {
            Task06.randomException();
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
        }
    }
}
