package com.rakovets.course.practice.module3;

import java.util.Scanner;

/**
 * Разработать программу для игрового движка:
 * Оружие имеет в себе атрибут святости и какой-то damage. Оружие имеющее атрибут святости наносит в 1.5 раза больше
 * урона по “UNDEAD” и “ZOMBIE”, но наносит в 2 раза меньше урона по “SAINT”. По “ANIMAL”, “HUMANOID”, “PLANT”,
 * “GHOST” без изменений. Определить сколько урона нанесет оружие по данному типу моба.
 *
 * @param damage  - количество танков, убитых первым игроком
 * @param typeMob - тип моба
 * @return урон по данному типу моба
 */
public class Task08 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int damage = (args.length != 2) ? scanner.nextInt() : Integer.parseInt(args[0]);
        String typeMob = (args.length != 2) ? scanner.next() : args[1];

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
    }
}