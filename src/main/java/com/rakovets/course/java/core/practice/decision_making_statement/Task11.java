package com.rakovets.course.java.core.practice.decision_making_statement;

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
        char symbol = 'E';

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
        String symbolType = "";
        int code = symbol;

        if (code >= 'a' && code <= 'z' || code >= 'A' && code <= 'Z') {
            symbolType = "latin";
        } else if (code >= 'а' && code <= 'я' || code >= 'А' && code <= 'Я') {
            symbolType = "cyrillic";
        } else if (code >= '0' && code <= '9') {
            symbolType = "digit";
        } else {
            symbolType = "undefined";
        }
        return symbolType;
    }
}
