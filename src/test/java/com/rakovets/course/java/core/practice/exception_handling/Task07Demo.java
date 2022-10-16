package com.rakovets.course.java.core.practice.exception_handling;

public class Task07Demo {
    public static void main(String[] args) {
        Task07 task07 = new Task07();
        try {
            task07.divisionTwoNumbers(9, 0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.print("");
        }
    }
}
