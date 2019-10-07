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
        int porch = (apartmentNumber / (numberApartmentsPerFloor * numberFloors)) + 1;//подъезд
        int apartmentInPorch = apartmentNumber -( numberFloors * numberApartmentsPerFloor * ( porch - 1) );//количество
        // этажей в подъезде, где находится квартира(нужна для вычисления этажа)
        int floor;
            floor = numberFloors ; //При других вариантах кода, выводилась ошибка, мол, переменная floor не инициализировалась.
            if (apartmentInPorch % numberApartmentsPerFloor == 0) {
                floor = apartmentInPorch / numberApartmentsPerFloor ;//если искомая квартира последняя на этаже
            } else if (apartmentInPorch % numberApartmentsPerFloor != 0) {
                floor = ( apartmentInPorch / numberApartmentsPerFloor ) + 1  ;//любые другие случаи
            } else {
                System.out.println("Error");// на случай, если я ошибся, пусть будет
            }
            if (apartmentNumber == numberApartmentsPerFloor * numberFloors){
                floor = numberFloors ;
                porch = 1;
            } //суть кода в том, что если numberApartmentsPerFloor * numberFloors = apartmentNumber, то этаж равен
        /*
         количеству этажей, то есть numberFloors. В таком случае квартира является последней в подъезде, а именно в первом
         Согласен, решение не универсальное, но пока других решений я не нашел, есть над чем работать
        */
        System.out.println("Porch: " + porch + ". Floor: " + floor);

    }
}