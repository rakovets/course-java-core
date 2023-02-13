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
        byte monthNumber = 10;

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
        switch (monthNumber) {
            case 1: return "January".toUpperCase();
            case 2: return "February".toUpperCase();
            case 3: return "March".toUpperCase();
            case 4: return "April".toUpperCase();
            case 5: return "May".toUpperCase();
            case 6: return "June".toUpperCase();
            case 7: return "July".toUpperCase();
            case 8: return "August".toUpperCase();
            case 9: return "September".toUpperCase();
            case 10: return "October".toUpperCase();
            case 11: return "November".toUpperCase();
            case 12: return "December".toUpperCase();
        }
        return null;
    }
}
