package com.rakovets.course.javabasics.practice.math;

/**
 * Разработать программу для игрового движка:
 * которая выводит штрафные очки игрока, который набрал меньше штрафных очков, если известно:
 *
 * @param penaltyPointFirstPlayer  - штрафные очки первого игрока
 * @param penaltyPointSecondPlayer - штрафные очки второго игрока
 */
class Task01 {
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int penaltyPointFirstPlayer = 1;
        int penaltyPointSecondPlayer = 2;

        // Код необходимый для тестирования, не изменять
        penaltyPointFirstPlayer = (args.length == 0) ? penaltyPointFirstPlayer : Integer.parseInt(args[0]);
        penaltyPointSecondPlayer = (args.length == 0) ? penaltyPointSecondPlayer : Integer.parseInt(args[1]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
    }
}
