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
        byte monthNumber = 18;

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
        String monthString = null;

        switch (monthNumber) {
            case 1:
                monthString = "JANUARY";
                break;
            case 2:
                monthString = "FEBRUARY";
                break;
            case 3:
                monthString = "MARCH";
                break;
            case 4:
                monthString = "APRIL";
                break;
            case 5:
                monthString = "MAY";
                break;
            case 6:
                monthString = "JUNE";
                break;
            case 7:
                monthString = "JULY";
                break;
            case 8:
                monthString = "AUGUST";
                break;
            case 9:
                monthString = "SEPTEMBER";
                break;
            case 10:
                monthString = "OCTOBER";
                break;
            case 11:
                monthString = "NOVEMBER";
                break;
            case 12:
                monthString = "DECEMBER";
                break;
            default:
                monthString = null;
            }
        return monthString;
    }
}
