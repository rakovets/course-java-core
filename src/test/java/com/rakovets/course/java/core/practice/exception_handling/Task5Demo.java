package com.rakovets.course.java.core.practice.exception_handling;

public class Task5Demo {
    public static void main(String[] args) throws Task5.NewStringException {
        try {
            String str1= null;
            String result = Task5.DoNullString.getNewString(str1);
            System.out.println(result);
        } catch (Task5.NewStringException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
