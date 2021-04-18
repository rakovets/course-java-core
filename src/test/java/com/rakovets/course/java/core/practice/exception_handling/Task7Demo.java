package com.rakovets.course.java.core.practice.exception_handling;

public class Task7Demo {
    public static void main(String[] args) {
        int result = (int) (Math.random() * 101);
        System.out.println(result);
        try {
            Task7.MakingException.throwingException(result);
        } catch (Task7.MyException e) {
            System.out.println(e.getMessage());
        } finally {
            if (result >= 50) {
                result -= 50;
                System.out.println(result);
            }
        }
    }
}
