package com.rakovets.course.java.core.practice.math;

/**
 * Разработать программу для игрового движка.
 *
 * @author Dmitry Rakovets
 */
@SuppressWarnings("unused")
class Task01 {
    /**
     * The entry point of the task.
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя.
        int firstPlayerPenaltyPoints = 1;
        int secondPlayerPenaltyPoints = 2;

        int minPenaltyPoints = getMinPenaltyPoints(firstPlayerPenaltyPoints, secondPlayerPenaltyPoints);

        System.out.printf("Result: %b", minPenaltyPoints);
    }

    /**
     * Определяет наименьшее количество штрафных очков для двух игроков.
     *
     * @param firstPlayerPenaltyPoints  - штрафные очки первого игрока
     * @param secondPlayerPenaltyPoints - штрафные очки второго игрока
     * @return наименьшие штрафные очки
     */
    public static int getMinPenaltyPoints(int firstPlayerPenaltyPoints, int secondPlayerPenaltyPoints) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя переменные объявленные выше (их можно изменять).
        // Для проверки решения необходимо запустить @Test для данного class (в директории test).
        return 0;
    }
}
