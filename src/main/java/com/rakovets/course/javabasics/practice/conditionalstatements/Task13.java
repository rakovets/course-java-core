package com.rakovets.course.javabasics.practice.conditionalstatements;

/**
 * Разработать программу для сервиса доставки.
 * <p>
 * Определить номер этажа дома для текущего клиента.
 */
public class Task13 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int numberFloors = 18;
        int numberApartmentsPerFloor = 10;
        int apartmentNumber = 180;

        int floorNumber = getFloorNumber(numberFloors, numberApartmentsPerFloor, apartmentNumber);
        System.out.printf("Result: %s", floorNumber);
    }

    /**
     * Определяет номер этажа дома для текущего клиента.
     *
     * @param numberFloors             количество этажей
     * @param numberApartmentsPerFloor количество квартир на этаже
     * @param apartmentNumber          номер квартиры
     * @return номер этажа
     */
    static int getFloorNumber(int numberFloors, int numberApartmentsPerFloor, int apartmentNumber) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int numberEntrance = (int) (apartmentNumber / (double)(numberFloors * numberApartmentsPerFloor));
        int diff = apartmentNumber - numberEntrance *  numberFloors * numberApartmentsPerFloor;

        if (diff > 0){
          return (int)Math.ceil( diff/(double)numberApartmentsPerFloor);
       }else{
          return (int) (apartmentNumber/(double)numberApartmentsPerFloor);
        }
    }
}
