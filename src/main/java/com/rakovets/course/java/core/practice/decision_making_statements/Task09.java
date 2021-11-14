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
        int numberFloors = 10;
        int numberApartmentsPerFloor = 4;
        int apartmentNumber = 11;

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
        int i=1;
        while ((apartmentNumber-(numberApartmentsPerFloor * numberFloors))> 0) {
        i++;
        apartmentNumber = apartmentNumber-numberApartmentsPerFloor * numberFloors;
        }
        return i;
    }
}
