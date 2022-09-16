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
        int numberFloors = 10;
        int numberApartmentsPerFloor = 4;
        int apartmentNumber = 18;

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
        int floorNumber;
        int apartmentsPerPorch = numberFloors * numberApartmentsPerFloor;
        int porchNumber;
        if ((apartmentNumber % apartmentsPerPorch) > 0) {
            porchNumber = apartmentNumber / apartmentsPerPorch + 1;
        } else {
            porchNumber = apartmentNumber / apartmentsPerPorch;
        }
        int countApartmentsInPreviousPorches = apartmentsPerPorch * (porchNumber -1);
        if ((apartmentNumber - countApartmentsInPreviousPorches) % numberApartmentsPerFloor != 0) {
            floorNumber = (apartmentNumber - countApartmentsInPreviousPorches) / numberApartmentsPerFloor + 1;
        } else {
            floorNumber = (apartmentNumber - countApartmentsInPreviousPorches) / numberApartmentsPerFloor;
        }
        return floorNumber;
    }
}
