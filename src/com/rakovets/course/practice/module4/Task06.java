package com.rakovets.course.practice.module4;

import java.util.Scanner;

/**
 * Разработать программу для бухгалтерии:
 * Конвертировать числовую сумму в сумму бухгалтерском формате, т.е. начиная справа, каждые три позиции отделяются
 * пробелом. Известно:
 *
 * @param amount сумма
 * @author Dmitry Rakovets
 * @version 1.0
 * @return сумма в бухгалтерском формате
 */
public class Task06 {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
        Scanner scanner = new Scanner(System.in);

        // Код необходимый для тестирования, не изменять
        long amount = (args.length != 1 ? scanner.nextLong() : Long.parseLong(args[0]));

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        long lengthValue = (long) Math.ceil(Math.log10(Math.abs(amount) + 0.5));
        long numberThreePosition = (long) Math.ceil(lengthValue / 3.0);
        if (numberThreePosition > 1) {
            numberThreePosition--;
            System.out.print(amount / (long) Math.pow(1000, numberThreePosition) + " ");
            amount = Math.abs(amount % (long) Math.pow(1000, numberThreePosition));
            numberThreePosition--;
            while (numberThreePosition >= 1) {
                System.out.print(amount / (long) Math.pow(1000, numberThreePosition));
                if (numberThreePosition == 1) {
                    System.out.print(" ");
                    System.out.print(amount % (long) Math.pow(1000, numberThreePosition));
                    break;
                }
                amount = amount % (long) Math.pow(1000, numberThreePosition);
                System.out.print(" ");
                numberThreePosition--;
            }
        } else {
            System.out.print(amount);
        }
    }
}