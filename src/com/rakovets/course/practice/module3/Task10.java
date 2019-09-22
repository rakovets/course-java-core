package com.rakovets.course.practice.module3;

import java.util.Scanner;

/**
 * Разработать программу для сети автозаправок:
 * которая выведет на какую заправку необходимо доставить топливо в первую очередь.
 * Известно:
 *
 * @param firstFuelReserves  - запасы топлива на первой заправке
 * @param secondFuelReserves - запасы топлива на второй заправке
 * @param thirdFuelReserves  - запасы топлива на третьей заправке
 * @return номер заправки.
 * Если количество запасов топлива наименьшее на нескольких заправках, то вывести заправки в порядке возрастания
 * Например: '2 3'
 */
public class Task10 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int firstFuelReserves = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[0]);
        int secondFuelReserves = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[1]);
        int thirdFuelReserves = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[2]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
    }
}