package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.CustomRuntimeException;
import com.rakovets.course.java.core.practice.exception_handling.tasks.Tasks;

public class DemoTask07 {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        int Age = 19;
        try {
            tasks.trowTwoExceptions(Age);
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("THE END");
        }
    }
}
