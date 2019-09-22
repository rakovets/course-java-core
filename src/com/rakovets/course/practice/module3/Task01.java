package com.rakovets.course.practice.module3;

import java.util.Scanner;

/**
 * Разработать программу для игрового движка:
 * После каждого боя выводится таблица статистики боя для команды. Расположение в данной таблице зависит
 * от урона нанесенного в бою. Всего в команде 15 игроков. Определить вошел ли игрок в ТОП-5 игроков своей команды,
 * если известно:
 *
 * @param positionPlayerByDamage - позиция игрока по убыванию урона в своей команде
 * @return 'true'/'false'
 */
public class Task01 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int positionPlayerByDamage = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
    }
}