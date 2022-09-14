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
        String whatMonth;
        switch (monthNumber) {
            case 1:
                whatMonth = "JANUARY";
                break;
            case 2:
                whatMonth = "FEBRUARY";
                break;
            case 3:
                whatMonth = "MARCH";
                break;
            case 4:
                whatMonth = "APRIL";
                break;
            case 5:
                whatMonth = "MAY";
                break;
            case 6:
                whatMonth = "JUNE";
                break;
            case 7:
                whatMonth = "JULY";
                break;
            case 8:
                whatMonth = "AUGUST";
                break;
            case 9:
                whatMonth = "SEPTEMBER";
                break;
            case 10:
                whatMonth = "OCTOBER";
                break;
            case 11:
                whatMonth = "NOVEMBER";
                break;
            case 12:
                whatMonth = "DECEMBER";
                break;
            default:
                whatMonth = null;
        }
        return whatMonth;
    }
}
