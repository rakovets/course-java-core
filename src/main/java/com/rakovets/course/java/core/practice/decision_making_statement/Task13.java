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
        int numberFloors = 3;
        int numberApartmentsPerFloor = 5;
        int apartmentNumber = 16;

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

        int numberApartmentsPerEntrance = numberFloors * numberApartmentsPerFloor;
        int numberPreviousEntrance, numberApartmentsInPreviousEntrances, numberApartmentsInCurrentEntrance;

        if (apartmentNumber % numberApartmentsPerEntrance == 0) {
            return numberFloors;
        } else {
            numberPreviousEntrance = apartmentNumber / numberApartmentsPerEntrance;
            numberApartmentsInPreviousEntrances = numberPreviousEntrance * numberApartmentsPerEntrance;
            numberApartmentsInCurrentEntrance = apartmentNumber - numberApartmentsInPreviousEntrances;
        }

        if (numberApartmentsInCurrentEntrance % numberApartmentsPerFloor == 0) {
            return numberApartmentsInCurrentEntrance / numberApartmentsPerFloor;
        } else {
            return 1 + numberApartmentsInCurrentEntrance / numberApartmentsPerFloor;
        }
    }
}
