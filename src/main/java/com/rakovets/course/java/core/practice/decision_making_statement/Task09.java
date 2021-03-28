package com.rakovets.course.java.core.practice.decision_making_statement;

/**
 * Разработать программу для сервиса доставки.
 * <p>
 * Определить номер подъезда дома для текущего клиента.
 */
class Task09 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int numberFloors = 1;
        int numberApartmentsPerFloor = 1;
        int apartmentNumber = 1;

        int porchNumber = getPorchNumber(numberFloors, numberApartmentsPerFloor, apartmentNumber);
        System.out.printf("Result: %s", porchNumber);
    }

    /**
     * Определяет номер подъезда дома для текущего клиента.
     *
     * @param numberFloors             количество этажей
     * @param numberApartmentsPerFloor количество квартир на этаже
     * @param apartmentNumber          номер квартиры
     * @return номер подъезда
     */
    static int getPorchNumber(int numberFloors, int numberApartmentsPerFloor, int apartmentNumber) {

        int numberApartmentsPerEntrance = numberApartmentsPerFloor * numberFloors;

        if (apartmentNumber % numberApartmentsPerEntrance == 0) {
            return apartmentNumber / numberApartmentsPerEntrance;
        } else {
            return (apartmentNumber / numberApartmentsPerEntrance + 1);
        }
    }
}
