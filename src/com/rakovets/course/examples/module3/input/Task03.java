package com.rakovets.course.examples.module3.input;

import java.util.Scanner;

/**
 * 
 * Проверка введенных символов, являются ли они числом
 * 
 */
public class Task03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        boolean isInt = scanner.hasNextInt();
        System.out.println(isInt);
        if (isInt)
        {
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
            String text = scanner.next(); // получает из сканера первое введеное
                                          // число
            System.out.println("Вы ввели " + text);
        }
        scanner.close();
    }
}