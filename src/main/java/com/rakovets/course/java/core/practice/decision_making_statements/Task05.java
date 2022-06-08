package com.rakovets.course.java.core.practice.decision_making_statements;

/**
 * Разработать программу для игрового движка.
 * <p>
 * Игрок при регистрации вводит свою дату рождения и она хранится в формате 'dd/MM/yyyy'. В профиле игрока необходимо
 * месяц выводить не в числовом формате, а в текстовом. Определить название месяца в зависимости от номера.
 *
 * @author Dmitry Rakovets
 */
class Task05 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        byte monthNumber = 1;

        String monthName = getMonthName(monthNumber);
        System.out.printf("Result: %s", monthName);
    }

    /**
     * Возвращает название месяца, в зависимости от его порядкового номера
     *
     * @param monthNumber номер месяца
     * @return месяц на английском языке (UPPER CASE)
     */
    static String getMonthName(byte monthNumber) {
        String monthName;

        if (monthNumber == 1) {
            monthName = "JANUARY";
        } else if (monthNumber == 2) {
            monthName = "FEBRUARY";
        } else if (monthNumber == 3) {
            monthName = "MARCH";
        } else if (monthNumber == 4) {
            monthName = "APRIL";
        } else if (monthNumber == 5) {
            monthName = "MAY";
        } else if (monthNumber == 6) {
            monthName = "JUNE";
        } else if (monthNumber == 7) {
            monthName = "JULY";
        } else if (monthNumber == 8) {
            monthName = "AUGUST";
        } else if (monthNumber == 9) {
            monthName = "SEPTEMBER";
        } else if (monthNumber == 10) {
            monthName = "OCTOBER";
        } else if (monthNumber == 11) {
            monthName = "NOVEMBER";
        } else if (monthNumber == 12) {
            monthName = "DECEMBER";
        } else {
            monthName = null;
        }

        return monthName;
    }
}
