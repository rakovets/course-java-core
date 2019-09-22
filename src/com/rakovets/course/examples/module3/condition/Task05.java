package com.rakovets.course.examples.module3.condition;

import java.util.Scanner;

/**
 * 
 * Оператор switch
 *
 */
public class Task05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что сделать с котом?");
        System.out.println("1. Накормить колбаской");
        System.out.println("2. Накормить хлебом");
        System.out.println("3. Пнуть");
        System.out.print("Выбери свой варинат и введите цифру:");

        int x = scanner.nextInt();
        System.out.println("\nКот отвечает");
        switch (x)
        {
            case 1:
                System.out.println("Мммм. Нямка");
                break;
            case 2:
                System.out.println("Фррр. Сам такое ешь!");
                break;
            case 3:
                System.out.println("Пшшш. Пойду нассу в тапки");
                break;
            default:
                System.out.println("Выбери от 1 до 3");
                break;
        }
        scanner.close();
    }
}