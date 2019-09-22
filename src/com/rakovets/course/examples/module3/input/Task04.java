package com.rakovets.course.examples.module3.input;

import java.util.Scanner;

/**
 * 
 * Ввод нескольких чисел с консоли
 * 
 */
public class Task04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа через пробел");
        int x = -1;
        int y = -1;
        if (scanner.hasNextInt())
        {
            x = scanner.nextInt();
        }

        if (scanner.hasNextInt())
        {
            y = scanner.nextInt();
        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        scanner.close();
    }
}