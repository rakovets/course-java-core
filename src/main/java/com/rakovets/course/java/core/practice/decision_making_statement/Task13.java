package com.rakovets.course.java.core.practice.decision_making_statement;

/**
 * Разработать программу для сервиса доставки.
 * <p>
 * Определить номер этажа дома для текущего клиента.
 */
class Task13 {
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
        int apartmentsNumbersInEntrance = numberApartmentsPerFloor * numberFloors;
        System.out.println("Flats in entrance " + apartmentsNumbersInEntrance);
        int apartmentsInEntrance = (apartmentNumber/apartmentsNumbersInEntrance);
        double flatsFlourNumber = 1.0;
        if(apartmentsInEntrance > 0 && apartmentsInEntrance !=1 ) {
            flatsFlourNumber =flatsFlourNumber * (apartmentNumber % apartmentsNumbersInEntrance) / numberApartmentsPerFloor;
            System.out.println("flatsFlourNumber "+flatsFlourNumber);
            return (int) (Math.ceil(flatsFlourNumber));
        } else {
            flatsFlourNumber = flatsFlourNumber * apartmentNumber / numberApartmentsPerFloor;
            return (int) (Math.ceil(flatsFlourNumber)) ;
        }


    }
}
