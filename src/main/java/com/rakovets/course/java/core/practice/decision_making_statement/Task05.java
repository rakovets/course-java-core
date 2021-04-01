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
        String result = null;
        switch (monthNumber) {
            case 1:
                result = "JANUARY";
                break;
            case 2:
                result = "FEBRUARY";
                break;
            case 3:
                result = "MARCH";
                break;
            case 4:
                result = "APRIL";
                break;
            case 5:
                result = "MAY";
                break;
            case 6:
                result = "JUNE";
                break;
            case 7:
                result = "JULY";
                break;
            case 8:
                result = "AUGUST";
                break;
            case 9:
                result = "SEPTEMBER";
                break;
            case 10:
                result = "OCTOBER";
                break;
            case 11:
                result = "NOVEMBER";
                break;
            case 12:
                result = "DECEMBER";
                break;
        }
        return result;
    }
}
