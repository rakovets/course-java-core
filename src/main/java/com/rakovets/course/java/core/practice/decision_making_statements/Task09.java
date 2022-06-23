package com.rakovets.course.java.core.practice.decision_making_statements;

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
        int numberFloors = 5;
        int numberApartmentsPerFloor = 5;
        int apartmentNumber = 26;

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
        /** То что в условии нету параметров с количеством подъездов и количеством квартир это так и должно быть?*/
        int amountOfApartments = 100;
        int amountOfPorchs = 4;
        int amountOfApartsInThePorch;
        int porch;

        amountOfApartsInThePorch = amountOfApartments / amountOfPorchs;
        porch = apartmentNumber / amountOfApartsInThePorch;
        if (apartmentNumber%amountOfApartsInThePorch != 0) {
            porch++;
        }
        return porch;
    }
}
