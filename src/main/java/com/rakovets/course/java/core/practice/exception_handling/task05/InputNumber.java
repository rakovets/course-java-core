package com.rakovets.course.java.core.practice.exception_handling.task05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumber {
    public void inputExampleMethod() {
        Scanner sc = new Scanner(System.in);
        try {
            sc.nextInt();
        } catch (InputMismatchException exception) {
            throw new NotNumberException("Entered not a number");
        }
    }
}
