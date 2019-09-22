package com.rakovets.course.examples.module3.input;

import java.util.Scanner;

/**
 * 
 * Ввод целых чисел в программу с клавиатуры
 * 
 */
public class Task01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        // метод hasNextInt проверяет является ли введеное с консоли значение
        // числом.
        boolean isInt = scanner.hasNextInt();
        System.out.println(isInt);
        if (isInt)
        {
            // метод возвращает одно число из сканера.
            int x = scanner.nextInt();
            System.out.println("Вы ввели число " + x);
        }
        else
        {
            System.out.println("Это не целое число");
        }

        // ========================================

        System.out.println("Введите строку");
        if (scanner.hasNext())
        {
            String text = scanner.next();
            System.out.println("Вы ввели " + text);
        }
        scanner.close();
    }
}