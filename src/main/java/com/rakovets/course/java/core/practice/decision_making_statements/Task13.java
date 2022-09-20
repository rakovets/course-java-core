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
        int apartmentsPerPorch = numberFloors * numberApartmentsPerFloor;
        int porchNumber;
        int apartmentsNumberInClientsPorch;
        int floorNumber;
        if (apartmentNumber % apartmentsPerPorch != 0) {
            porchNumber = (apartmentNumber / apartmentsPerPorch) + 1;
        } else {
            porchNumber = apartmentNumber / apartmentsPerPorch;
        }
        apartmentsNumberInClientsPorch = apartmentNumber - (apartmentsPerPorch * (porchNumber - 1));
        if (apartmentsNumberInClientsPorch % numberApartmentsPerFloor != 0) {
            floorNumber = apartmentsNumberInClientsPorch / numberApartmentsPerFloor + 1;
        } else {
            floorNumber = apartmentsNumberInClientsPorch / numberApartmentsPerFloor;
        }
        return floorNumber;
    }
}
