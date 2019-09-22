package com.rakovets.course.examples.module3.condition;

import java.util.Scanner;

/**
 * 
 * Использование конструкции else if
 *
 */
public class Task03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько вам лет? ");
        if (scanner.hasNextInt())
        {
            int age = scanner.nextInt();
            if (age < 1)
                System.out.println("Грудничок");
            else if (age >= 1 && age < 3)
                System.out.println("Ползунок");
            else if (age >= 3 && age < 6)
                System.out.println("Детсадовец");
            else if (age >= 6 && age < 16)
                System.out.println("Школьник");
            else if (age >= 16 && age < 19)
                System.out.println("Подросток");
            // FIXME расскоментируй строки кода ниже и исправь их
            // else if () System.out.println("Взрослый"); !!!
            // else if () System.out.println("Пожилой"); !!!
            // else () System.out.println("Долгожитель"); !!!
        }
        scanner.close();
    }
}
