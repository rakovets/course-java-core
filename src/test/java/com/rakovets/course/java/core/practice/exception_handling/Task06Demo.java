package com.rakovets.course.java.core.practice.exception_handling;

public class Task06Demo {
    public static void main(String[] args) {
        Task06 task06 = new Task06();
        try {
            task06.randomException();
        } catch (NullPointerException e) {
            System.err.println("Null pointer exception");
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic exception");
        } catch (RuntimeException e) {
            System.err.println("Run time exception");
        }
    }
}
