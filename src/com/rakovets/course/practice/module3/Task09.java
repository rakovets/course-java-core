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
        int porch, floor;
        int numberApartmentPerPorch = numberFloors * numberApartmentsPerFloor;
        //Определение подъезда
        if (apartmentNumber % numberApartmentPerPorch == 0) {
            porch = apartmentNumber / numberApartmentPerPorch;
        }
        else {
            porch = apartmentNumber / numberApartmentPerPorch + 1;
        }
        //Определение этажа
        int apartmentsNumberPerPorch = apartmentNumber - ((porch - 1) * numberApartmentPerPorch);

        if (apartmentsNumberPerPorch / numberApartmentsPerFloor <= 1){
            floor = 1;
        }
        else {
            if (apartmentsNumberPerPorch % numberApartmentsPerFloor == 0){
                floor = apartmentsNumberPerPorch / numberApartmentsPerFloor;
            }
            else {
                floor = apartmentsNumberPerPorch / numberApartmentsPerFloor +1;
            }
        }
        System.out.println("Porch: " + porch + ". " + "Floor: " + floor);
    }
}