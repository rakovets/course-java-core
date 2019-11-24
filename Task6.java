package com.rakovets.course.challenge.exception;

import java.security.AccessControlException;

public class Task6 {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[10];
            numbers[10] = 45;
            System.out.println(numbers[4]);
        } catch (ArithmeticException ex) {
            System.out.println("Арифметическая ошибка!!!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Ошибка в массиве!!!");
        } catch (ClassCastException ex) {
            System.out.println("Ошибка приведения типов!!!");
        }
        System.out.println("Программа завершена");
    }
}
