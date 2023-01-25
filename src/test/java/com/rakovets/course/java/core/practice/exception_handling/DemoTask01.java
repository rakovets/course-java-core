package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Tasks;

public class DemoTask01 {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        try {
            tasks.callNullPointerException();
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
