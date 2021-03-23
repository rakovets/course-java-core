package com.rakovets.course.java.core.practice.decision_making_statement;

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
        String month;
        if (monthNumber < 1 || monthNumber > 12) {
            month = null;
        } else if (monthNumber == 1) {
            month = "JANUARY";
        } else if (monthNumber == 2) {
            month = "FEBRUARY";
        } else if (monthNumber == 3) {
            month = "MARCH";
        } else if (monthNumber == 4) {
            month = "APRIL";
        } else if (monthNumber == 5) {
            month = "MAY";
        } else if (monthNumber == 6) {
            month = "JUNE";
        } else if (monthNumber == 7) {
            month = "JULY";
        } else if (monthNumber == 8) {
            month = "AUGUST";
        } else if (monthNumber == 9) {
            month = "SEPTEMBER";
        } else if (monthNumber == 10) {
            month = "OCTOBER";
        } else if (monthNumber == 11) {
            month = "NOVEMBER";
        } else {
            month = "DECEMBER";
        }
        return month;
    }
}
