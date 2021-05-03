package com.rakovets.course.java.core.practice.exception_handling;

public class Task06Demo {
    public static void main(String[] args) throws Exception {
        try {
            Task06.randomException();
        } catch (NullPointerException | ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } catch (NoSuchMethodException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
