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
        char symbol = 'П';

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
        String text;
        int num = (int) symbol;
        if(num >= 32 && num <= 47 || num >= 58 && num <= 64 || num >= 91 && num <= 96 || num >= 123 && num <= 127) {
            text = "undefined";
        }
        else if(num >= 48 && num <= 57 ) {
            text = "digit";
        }
        else if(num >= 65 && num <= 90 || num >= 97 && num <= 122) {
            text = "latin";
        }
        else  {
            text = "cyrillic";
        }
        return text;
    }
}
