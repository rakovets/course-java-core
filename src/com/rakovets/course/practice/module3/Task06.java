package com.rakovets.course.practice.module3;

import java.util.Scanner;

/**
 * Разработать программу для игрового движка:
 * Два игрока играют в “Battle City” (танчики времен приставок “SEGA” и “Dendy”). После каждого боя им, в зависимости
 * от количества уничтоженных танков, начисляются очки. Тому, кто уничтожил больше танков начисляется дополнительные
 * 500 очков. За 1 танк начисляется 100 очков. Вывести результаты боя.
 *
 * @param tanksKilledFirstPlayer  - количество танков, убитых первым игроком
 * @param tanksKilledSecondPlayer - количество танков, убитых первым игроком
 * @return 'Player 1: {0}. Player 2: {1}', где {0} - очки первого игрока, {1} - очки второго игрока.
 * В случае когда убито одинаковое количество танков, бонусные очки не начисляются никому
 */
public class Task06 {
    public static final int BONUS_POINT = 500;
    public static final int KILL_POINT = 100;

    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int tanksKilledFirstPlayer = (args.length != 2) ? scanner.nextInt() : Integer.parseInt(args[0]);
        int tanksKilledSecondPlayer = (args.length != 2) ? scanner.nextInt() : Integer.parseInt(args[1]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
    }
}