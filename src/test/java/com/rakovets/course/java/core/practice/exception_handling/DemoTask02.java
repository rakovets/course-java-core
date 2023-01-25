package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Tasks;

public class DemoTask02 {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        try {
            tasks.callArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
