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
        int floorNumber = 0;
        int numberApartmentsPerPorch = numberFloors * numberApartmentsPerFloor;

        if (apartmentNumber > numberApartmentsPerPorch) {
            while (apartmentNumber > numberApartmentsPerPorch) {
                apartmentNumber -= numberApartmentsPerPorch;
            }
            if (apartmentNumber % numberApartmentsPerFloor == 0 && apartmentNumber / numberApartmentsPerFloor != 0) {
                apartmentNumber /= numberApartmentsPerFloor;
                floorNumber = apartmentNumber + 1;
            } else {
                floorNumber = apartmentNumber / numberApartmentsPerFloor + 1;
            }
        } else if (apartmentNumber < numberApartmentsPerPorch) {
            if (apartmentNumber % numberApartmentsPerFloor == 0 && apartmentNumber / numberApartmentsPerFloor != 0) {
                apartmentNumber /= numberApartmentsPerFloor;
                floorNumber = apartmentNumber + 1;
            } else {
                floorNumber = apartmentNumber / numberApartmentsPerFloor + 1;
            }
        } else {
            floorNumber = numberFloors;
        }
        return floorNumber;
    }
}
