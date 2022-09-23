package com.rakovets.course.java.core.practice.decision_making_statements;

/**
 * Разработать программу для desktop приложения.
 * <p>
 * Help: Unicode (decimal)
 * <p>
 * Необходимо определить, какие символы вводит пользователь:
 * <ul>
 *  <li>латиница</li>
 *  <li>кириллица</li>
 *  <li>цифра</li>
 *  <li>спец. символ</li>
 * </ul>
 * <p>
 * Так же программа не должна зависеть от регистра.
 */
class Task11 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        char symbol = 'а';

        String monthName = getSymbolType(symbol);
        System.out.printf("Result: %s", monthName);
    }

    /**
     * Определяет к какому типу относится данный символ.
     *
     * @param symbol символ
     * @return <code>latin</code>/<code>cyrillic</code>/<code>digit</code>/<code>undefined</code>
     */
    static String getSymbolType(char symbol) {
        String monthName = "";

        if ((symbol >= (char) 65 && symbol <= (char) 90) || symbol >= (char) 97 && symbol <= (char) 122) {
            monthName = "latin";
        } else if (symbol >= (char) 48 && symbol <= (char) 57) {
            monthName = "digit";
        } else if (symbol >= (char) 32 && symbol <= (char) 47 ||
                symbol >= (char) 58 && symbol <= (char) 64 || symbol >= (char) 91 && symbol <= (char) 96
                || symbol >= (char) 123 && symbol <= (char) 127) {
            monthName = "undefined";
        } else {
            monthName = "cyrillic";
        }
        return monthName;
    }
}
