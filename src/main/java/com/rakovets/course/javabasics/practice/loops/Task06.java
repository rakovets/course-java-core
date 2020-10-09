package com.rakovets.course.javabasics.practice.loops;

import java.util.Scanner;

/**
 * Разработать программу для бухгалтерии:
 * Конвертировать чесловую сумму в сумму бухгалтерском формате, т.е. начиная справа, каждые три позиции отделяются
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
        // Для проверки решения необходимо запустить @Test для данного class (в директории test) 13524624562456
        boolean isNegative = amount < 0;
        if (isNegative) {
            amount *= -1;
        }
        String result = "";
        int i = 1;
        do {
            long digit = amount % 10;
            result = digit + result;
            amount /= 10;
            if (i % 3 == 0 && amount != 0) {
                result = " " + result;
            }
            i++;
        } while (amount > 0);
        if (isNegative) {
            result = "-" + result;
        }
        System.out.println(result);
    }
}