package com.rakovets.course.java.core.practice.exception_handling.task05;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        Task task = new Task();
        try {
            task.newMethod();
        } catch (IOException e) {
            throw new RuntimeException("Произошло исключение: ", e);
        }
    }
}
