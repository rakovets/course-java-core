package com.rakovets.course.challenge.exception;

public class Task2 {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[3];
            numbers[4] = 45;
            System.out.println(numbers[4]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Выход за пределы массива!!!");
        }
        System.out.println("Программа завершена");

    }
}
