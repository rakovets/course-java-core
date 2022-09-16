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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String result = null;
        if (monthNumber == 1) {
            result = "JANUARY";
        } else if (monthNumber == 2) {
            result = "FEBRUARY";
        } else if (monthNumber == 3) {
            result = "MARCH";
        } else if (monthNumber == 4) {
            result = "APRIL";
        } else if (monthNumber == 5) {
            result = "MAY";
        } else if (monthNumber == 6) {
            result = "JUNE";
        } else if (monthNumber == 7) {
            result = "JULY";
        } else if (monthNumber == 8) {
            result = "AUGUST";
        } else if (monthNumber == 9) {
            result = "SEPTEMBER";
        } else if (monthNumber == 10) {
            result = "OCTOBER";
        } else if (monthNumber == 11) {
            result = "NOVEMBER";
        } else if (monthNumber == 12) {
            result = "DECEMBER";
        }
        return result;
    }
}
