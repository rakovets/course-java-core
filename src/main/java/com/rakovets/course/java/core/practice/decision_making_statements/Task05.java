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
        String month = null;
        switch (monthNumber){
            case 1:
                month = "JANUARY";
                break;
            case 2:
                month = "FEBRUARY";
                break;
            case 3:
                month = "MARCH";
                break;
            case 4:
                month = "APRIL";
                break;
            case 5:
                month = "MAY";
                break;
            case 6:
                month = "JUNE";
                break;
            case 7:
                month = "JULY";
                break;
            case 8:
                month = "AUGUST";
                break;
            case 9:
                month = "SEPTEMBER";
                break;
            case 10:
                month = "OCTOBER";
                break;
            case 11:
                month = "NOVEMBER";
                break;
            case 12:
                month = "DECEMBER";
                break;
        }
        return month;
    }
}
