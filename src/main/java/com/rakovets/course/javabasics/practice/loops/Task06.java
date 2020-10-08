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

      //   long delD = amount%10;
        // long delInt = amount/10;
         for (int i = 1; i<=3; i++){
             long delD = amount%10;// находим цифру последнюю при первом прохождении
             long delInt = amount/10; // выделяем целое число
             amount = delInt;
          //   System.out.print(delD+ "\n");
            //  System.out.println("|"+ delD + "int = " + delInt);
             System.out.print(delD);
           }
    }
}