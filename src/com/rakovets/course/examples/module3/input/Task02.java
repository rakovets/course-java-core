package com.rakovets.course.examples.module3.input;

import java.util.Scanner;

/**
 * 
 * Ввод целых чисел в программу с клавиатуры через сканер
 * 
 */
public class Task02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        if (scanner.hasNextInt())
        {
            int x = scanner.nextInt();
            System.out.println("Вы ввели число " + x);
        }
        scanner.close();
    }
}