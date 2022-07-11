package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task07;

public class Demo07 {
    public static void main(String[] args) {
        Task07 task07 = new Task07();
        int number = -12;
        int root = 2;
        String result;
        try {
            result = String.valueOf(task07.extractRoot(number, root));
        } catch (RuntimeException e) {
            result = e.getMessage();
        } finally {
            System.out.println("\n");
        }
        System.out.println(result);
    }
}
