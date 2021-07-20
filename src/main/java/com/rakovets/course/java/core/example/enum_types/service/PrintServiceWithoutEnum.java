package com.rakovets.course.java.core.example.enum_types.service;

public class PrintServiceWithoutEnum {
    public void print(String day) {
        switch (day) {
            case "MONDAY":
                System.out.println("Monday");
                break;
            case "SUNDAY":
                System.out.println("Sunday");
                break;
        }
    }
}
