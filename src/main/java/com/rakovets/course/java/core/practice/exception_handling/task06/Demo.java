package com.rakovets.course.java.core.practice.exception_handling.task06;

import java.io.IOException;
import java.text.ParseException;

public class Demo {
    public static void main(String[] args) {
        Task task = new Task();
        try {
            task.randomException();
        } catch (IOException | IllegalCallerException e) {
            System.out.println("Exception 1 or 2: " + e.getMessage());
        } catch (ParseException e) {
            System.out.println("Exception 3: " + e.getMessage());
        }
    }
}
