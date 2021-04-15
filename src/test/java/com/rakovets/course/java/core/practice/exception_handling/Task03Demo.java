package com.rakovets.course.java.core.practice.exception_handling;
import com.rakovets.course.java.core.example.exception_handling.exception.ExceptionFactorial;

import java.util.Scanner;

public class Task03Demo {
    public static void main(String[] args) {
        int data;
        Task03 task03 = new Task03();
        Scanner scanner = new Scanner(System.in);
        data = scanner.nextInt();
        try {
            System.out.println(task03.factorial(data));
        } catch (ExceptionFactorial ex) {
            System.out.println("Exception " + ex.getMessage());
            System.out.println(ex.getNumber());
            ex.printStackTrace();
        }
    }
}
