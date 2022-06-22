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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int unicodeNumber = (int)symbol;
        String symbolType = null;
        if (unicodeNumber >= 32 && unicodeNumber <= 47 || unicodeNumber >= 58 && unicodeNumber <= 64 || unicodeNumber >= 91 && unicodeNumber <= 96 || unicodeNumber >= 123 && unicodeNumber <= 127) {
            symbolType  = "undefined";
        } else if (unicodeNumber >= 48 && unicodeNumber <= 57) {
            symbolType = "digit";
        } else if (unicodeNumber >= 65 && unicodeNumber <= 90 || unicodeNumber >= 97 && unicodeNumber <= 122) {
            symbolType = "latin";
        } else {
            symbolType = "cyrillic";
        }
        return symbolType;
    }
}
