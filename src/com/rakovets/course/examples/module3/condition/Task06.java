package com.rakovets.course.examples.module3.condition;

import java.util.Scanner;

public class Task06
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();

        switch (month)
        {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Не знаем такого");
                System.exit(42);
        }
        /*
         * FIXME переделай программу таким образом, чтобы после ввода номера
         * месяца выводилось количство дней в этом месяце. Оператор switch при
         * этом должен содержать в блоке только три команды System.out.println.
         */

        scanner.close();
    }
}