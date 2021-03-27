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
        int floor;
        final int FLOORS_IN_PORCH = numberFloors * numberApartmentsPerFloor;
        if (apartmentNumber % FLOORS_IN_PORCH != 0) {
            if (apartmentNumber % numberApartmentsPerFloor == 0) {
                floor = (apartmentNumber % FLOORS_IN_PORCH) / numberApartmentsPerFloor;
            } else {
                floor = (apartmentNumber % FLOORS_IN_PORCH) / numberApartmentsPerFloor + 1;
            }
        } else {
            floor = (apartmentNumber - (apartmentNumber / FLOORS_IN_PORCH -1) * FLOORS_IN_PORCH)  / numberApartmentsPerFloor;
        }
        return floor;
    }
}
