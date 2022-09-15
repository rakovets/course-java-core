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
        int floorNumber;
        int numberApartmentsPerPorch = numberFloors * numberApartmentsPerFloor;
        int numberOfPorch;
        if (apartmentNumber % numberApartmentsPerPorch != 0) {
            numberOfPorch = apartmentNumber / numberApartmentsPerPorch + 1;
        } else {
            numberOfPorch = apartmentNumber / numberApartmentsPerPorch;
        }
        int thisApartmentNumberInPorch = apartmentNumber - numberApartmentsPerPorch * (numberOfPorch - 1);
        if (thisApartmentNumberInPorch % numberApartmentsPerFloor != 0) {
            floorNumber = thisApartmentNumberInPorch / numberApartmentsPerFloor + 1;
        } else {
            floorNumber = thisApartmentNumberInPorch / numberApartmentsPerFloor;
        }
        return floorNumber;
    }
}
