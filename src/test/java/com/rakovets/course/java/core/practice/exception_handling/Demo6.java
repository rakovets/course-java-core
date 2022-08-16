package com.rakovets.course.java.core.practice.exception_handling;

public class Demo6 {
    public static void main(String[] args) {
        Task6 task = new Task6();
        int i = (int) (Math.random() * 3);

        try {
            task.variousExceptions(i);
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("RuntimeException unchecked");
        } catch (Exception ez) {
            System.out.println("Exception");
        }
    }
}
