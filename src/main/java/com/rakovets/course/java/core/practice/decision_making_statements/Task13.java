package com.rakovets.course.java.core.practice.decision_making_statements;

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
        int numberFloors = 9;
        int numberApartmentsPerFloor = 4;
        int apartmentNumber = 68;

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
        double floorNumber = 0;
        int floorNumberSumm = 0;
        int porchNumber = 0;
        int apartmentsInThePorch = numberFloors * numberApartmentsPerFloor;
        if (apartmentNumber % apartmentsInThePorch != 0) {
            porchNumber = apartmentNumber / apartmentsInThePorch + 1;
        } else {
            porchNumber = apartmentNumber / apartmentsInThePorch;
        }
        floorNumberSumm = (apartmentNumber - apartmentsInThePorch * (porchNumber - 1));
        if (floorNumberSumm % numberApartmentsPerFloor != 0) {
            floorNumber = floorNumberSumm / numberApartmentsPerFloor + 1;
        } else {
            floorNumber = floorNumberSumm / numberApartmentsPerFloor;
        }
        return (int) floorNumber;
    }
}
