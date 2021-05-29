package com.rakovets.course.java.core.practice.exception_handling;

public class Task06Demo {
    public static void main(String[] args) {
        Task06 task = new Task06();
        int i = (int) Math.random() * 3;
        try {
            task.randomException(i);
        } catch (ArithmeticException e) {
            System.out.println("This is Runtime Exception");
        } catch (NullPointerException e) {
            System.out.println("This is Runtime Exception");
        } catch (Exception exception) {
            System.out.println("This is some Exception");
        }
    }
}
