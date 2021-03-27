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
        char symbol = 'd';

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
        if (code >= 32 && code <= 47 || code >= 58 && code <= 64 || code >= 91 && code <= 95) {
            symbolType = "undefined";
        }
        if (code >= 48 && code <= 57) {
            symbolType = "digit";
        }
        if (code >= 65 && code <= 90 || code >= 97 && code <= 122 ) {
            symbolType = "latin";
        }
        if (code >= 1040 && code <= 1103) {
            symbolType = "cyrillic";
        }
        return symbolType;
    }
}
