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
        int numberFloors = 9;
        int numberApartmentsPerFloor = 4;
        int apartmentNumber = 68;

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
        int apartamentsPorch = numberFloors * numberApartmentsPerFloor;
        int porchNumber = 1;

        if (apartmentNumber <= apartamentsPorch) {
            return porchNumber;
        } else {
            porchNumber = (apartmentNumber - 1) / apartamentsPorch + 1;
        }
        return porchNumber;
    }
}
