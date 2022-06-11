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
        byte monthNumber = 2;

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
        String profileMonthName;
        switch (monthNumber) {
            case 1:
                profileMonthName = "JANUARY";
                break;
            case 2:
                profileMonthName = "FEBRUARY";
                break;
            case 3:
                profileMonthName = "MARCH";
                break;
            case 4:
                profileMonthName = "APRIL";
                break;
            case 5:
                profileMonthName = "MAY";
                break;
            case 6:
                profileMonthName = "JUNE";
                break;
            case 7:
                profileMonthName = "JULY";
                break;
            case 8:
                profileMonthName = "AUGUST";
                break;
            case 9:
                profileMonthName = "SEPTEMBER";
                break;
            case 10:
                profileMonthName = "OCTOBER";
                break;
            case 11:
                profileMonthName = "NOVEMBER";
                break;
            case 12:
                profileMonthName = "DECEMBER";
                break;
            default:
                profileMonthName = "invalid month";
                break;
        }
        if (monthNumber >= 1 && monthNumber <= 12) {
            return profileMonthName;
        } else {
            return null;
        }
    }
}
