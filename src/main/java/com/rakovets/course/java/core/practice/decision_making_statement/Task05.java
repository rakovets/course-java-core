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
        String dayOfMounth = null;

        switch (monthNumber) {
            case 1:
                dayOfMounth = "JANUARY";
                break;
            case 2:
                dayOfMounth = "FEBRUARY";
                break;
            case 3:
                dayOfMounth = "MARCH";
                break;
            case 4:
                dayOfMounth = "APRIL";
                break;
            case 5:
                dayOfMounth = "MAY";
                break;
            case 6:
                dayOfMounth = "JUNE";
                break;
            case 7:
                dayOfMounth = "JULY";
                break;
            case 8:
                dayOfMounth = "AUGUST";
                break;
            case 9:
                dayOfMounth = "SEPTEMBER";
                break;
            case 10:
                dayOfMounth = "OCTOBER";
                break;
            case 11:
                dayOfMounth = "NOVEMBER";
                break;
            case 12:
                dayOfMounth = "DECEMBER";
                break;
        }

        return dayOfMounth;
    }
}
