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
        switch (monthNumber) {
            case 1:
                monthName = "JANUARY";
                break;
            case 2:
                monthName = "FEBRUARY";
                break;
            case 3:
                monthName = "MARCH";
                break;
            case 4:
                monthName = "APRIL";
                break;
            case 5:
                monthName = "MAY";
                break;
            case 6:
                monthName = "JUNE";
                break;
            case 7:
                monthName = "JULY";
                break;
            case 8:
                monthName = "AUGUST";
                break;
            case 9:
                monthName = "SEPTEMBER";
                break;
            case 10:
                monthName = "OCTOBER";
                break;
            case 11:
                monthName = "NOVEMBER";
                break;
            case 12:
                monthName = "DECEMBER";
                break;
            default:
                monthName = null;
        }
        return monthName;
    }
}
