package com.rakovets.course.java.core.practice.exception_handling;

public class Task6Demo {
    public static void main(String[] args) {
        int result = (int) (Math.random() * 101);
        System.out.println(result);
        try {
            Task6.MakingException.throwingException(result);
        } catch (Task6.MyFirstException | Task6.MySecondException e) {
            System.out.println(e.getMessage());
            System.out.println("This is the first exception handling");
        } catch (Task6.MyThirdException e) {
            System.out.println(e.getMessage());
            System.out.println("This is the second exception handling");
        }
    }
}
