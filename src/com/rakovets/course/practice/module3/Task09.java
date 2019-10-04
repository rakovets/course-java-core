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

        int numberOfApartmentsInEntrance;
        int entrance;
        int multiplier = 1;
        int multiplier1 = 1;
        int multiplier2 = 1;
        int floor;
        int entranceWithThisApartment;

        numberOfApartmentsInEntrance = numberFloors * numberApartmentsPerFloor;
        if (numberOfApartmentsInEntrance > apartmentNumber) {
            entrance = 1;
            while (numberApartmentsPerFloor < apartmentNumber) {
                multiplier1++;
                numberApartmentsPerFloor *= multiplier1;
            }
            floor = multiplier1;
        } else {
            while (numberOfApartmentsInEntrance < apartmentNumber) {
                multiplier++;
                numberOfApartmentsInEntrance *= multiplier;
                }
            entrance = multiplier;
            entranceWithThisApartment =apartmentNumber - ((entrance - 1) * numberOfApartmentsInEntrance);
            while (numberApartmentsPerFloor < entranceWithThisApartment) {
                multiplier2++;
                numberApartmentsPerFloor *= multiplier2;
            }
            floor = multiplier2;
            }
        System.out.println("Porch: " + entrance + ". " + "Floor: " + floor);
        }

    }
