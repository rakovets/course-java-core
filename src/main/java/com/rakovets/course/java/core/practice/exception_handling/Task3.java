package com.rakovets.course.java.core.practice.exception_handling;

public class Task3 {
    public static void main(String[] args) throws ScannerException {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Input a positive number: ");
        int a = scanner.nextInt();
        try {
            boolean result = Number.checkPositiveNumber(a);
            System.out.println(result);
        } catch (ScannerException e) {
            System.out.println("Stack trace " + e.fillInStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e.getNumber());
        }

    }
}
