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
        int numberFloors = 2;
        int numberApartmentsPerFloor = 10;
        int apartmentNumber = 45;

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
        int numberApartmentsPerPorch = numberApartmentsPerFloor * numberFloors;
        int howManyPorchInApartmentNumber = (apartmentNumber / numberApartmentsPerPorch);
        int result;
        if (numberApartmentsPerPorch == apartmentNumber) {
            result = numberFloors;
        } else {
            result = (apartmentNumber - numberApartmentsPerPorch * howManyPorchInApartmentNumber) / numberApartmentsPerFloor + 1;
        }
        return result;
    }
}

