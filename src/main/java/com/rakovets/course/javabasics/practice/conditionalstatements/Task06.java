package com.rakovets.course.javabasics.practice.conditionalstatements;

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
public class Task06 {
    public static final int BONUS_POINT = 500;
    public static final int KILL_POINT = 100;

    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int tanksKilledFirstPlayer = 1;
        int tanksKilledSecondPlayer = 2;

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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода

        if (tanksKilledFirstPlayer > tanksKilledSecondPlayer) {
            tanksKilledFirstPlayer = tanksKilledFirstPlayer * KILL_POINT + BONUS_POINT;
            tanksKilledSecondPlayer *= KILL_POINT;
            return "Player 1: " + tanksKilledFirstPlayer + ". Player 2: " + tanksKilledSecondPlayer;
        } else if (tanksKilledFirstPlayer < tanksKilledSecondPlayer) {
            tanksKilledSecondPlayer = tanksKilledSecondPlayer * KILL_POINT + BONUS_POINT;
            tanksKilledFirstPlayer *= KILL_POINT;
            return "Player 1: " + tanksKilledFirstPlayer + ". Player 2: " + tanksKilledSecondPlayer;
        } else {
            tanksKilledFirstPlayer *= KILL_POINT;
            tanksKilledSecondPlayer *= KILL_POINT;
            return "Player 1: " + tanksKilledFirstPlayer + ". Player 2: " + tanksKilledSecondPlayer;
        }

    }
}
