package com.rakovets.course.practice.module3;

import java.util.Scanner;

/**
 * Разработать программу для почты:
 * Определить номер подъезда дома и этаж для данной квартиры, если известно:
 *
 * @param numberFloors             - количество этажей
 * @param numberApartmentsPerFloor - количество квартир на этаже
 * @param apartmentNumber          - номер квартиры
 * @return 'Porch: {0}. Floor: {1}', где {0} - номер подъезда, {1} - номер этажа
 */
public class Task09 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int numberFloors = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[0]);
        int numberApartmentsPerFloor = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[1]);
        int apartmentNumber = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[2]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
    }
}