package com.rakovets.course.javabasics.practice.conditionalstatements;

/**
 * Разработать программу для desktop приложения.
 * <p>
 * Help: Unicode (decimal)
 * <p>
 * Необходимо определить, какие символы вводит пользователь:
 * <ul>
 *  <li>латиница</li>
 *  <li>кирилица</li>
 *  <li>цифра</li>
 *  <li>спец. символ</li>
 * </ul>
 * <p>
 * Так же программа не должна зависеть от регистра.
 */
public class Task11 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        char symbol = 'р';

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
        if (symbol >= 65 && symbol <= 90 || symbol >= 97 && symbol <= 122) {
            return "latin";
        } else if (symbol >= 192 && symbol <= 255) {
            return "cyrillic";
        } else if (symbol >= 48 && symbol <= 57) {
            return "digit";
        } else if (symbol >= 33 && symbol <= 47 || symbol >= 58 && symbol <= 64 || symbol >= 91 && symbol <= 96 || symbol >= 123 && symbol <= 126) {
            return "undefined";
        } else {
            return "cyrillic";
        }
    }
}
