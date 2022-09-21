package com.rakovets.course.java.core.practice.decision_making_statements;

import com.sun.source.tree.ReturnTree;

/**
 * Разработать программу для игрового движка.
 * <p>
 * Два игрока играют в “Battle City” (танчики времен приставок “SEGA” и “Dendy”). После каждого боя им, в зависимости
 * от количества уничтоженных танков, начисляются очки:
 * <ul>
 *  <li>Тому, кто уничтожил больше танков начисляется дополнительные 500 очков.</li>
 *  <li>В случае когда уничтожено одинаковое количество танков, бонусные очки не начисляются никому.</li>
 *  <li>За 1 танк начисляется 100 очков.</li>
 * </ul>
 */
class Task06 {
    private static final int BONUS_POINT = 500;
    private static final int KILL_POINT = 100;

    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int tanksKilledFirstPlayer = 20;
        int tanksKilledSecondPlayer = 20;

        String result = getResult(tanksKilledFirstPlayer, tanksKilledSecondPlayer);
        System.out.println(result);
    }

    /**
     * Высчитывает результаты боя.
     *
     * @param tanksKilledFirstPlayer  количество танков, убитых первым игроком
     * @param tanksKilledSecondPlayer количество танков, убитых вторым игроком
     * @return 'Player 1: ${0}. Player 2: ${1}', где ${0} - очки первого игрока, ${1} - очки второго игрока.
     */
    static String getResult(int tanksKilledFirstPlayer, int tanksKilledSecondPlayer) {
        int firstPlayerResult = 0;
        int secondPlayerResult = 0;
        if (tanksKilledFirstPlayer > 0) {
            firstPlayerResult = tanksKilledFirstPlayer * KILL_POINT;
            }
        if (tanksKilledSecondPlayer > 0) {
            secondPlayerResult = tanksKilledSecondPlayer * KILL_POINT;
        }
        if (firstPlayerResult > secondPlayerResult) {
            firstPlayerResult += BONUS_POINT;
        } else if (firstPlayerResult < secondPlayerResult) {
            secondPlayerResult += BONUS_POINT;
        } else if (firstPlayerResult == secondPlayerResult) {
            final int NoBonus = 0;
            firstPlayerResult += NoBonus;
            secondPlayerResult += NoBonus;
        }
        return "Player 1: " + firstPlayerResult + ". " + "Player 2: " + secondPlayerResult;
    }
}
