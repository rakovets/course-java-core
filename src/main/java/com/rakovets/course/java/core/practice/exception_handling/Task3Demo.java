package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.HealthException;
import com.rakovets.course.java.core.practice.exception_handling.model.Health;

public class Task3Demo {
    public static void main(String[] args) {
        try {
            System.out.println(Health.getHealth(105));
        } catch (HealthException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
