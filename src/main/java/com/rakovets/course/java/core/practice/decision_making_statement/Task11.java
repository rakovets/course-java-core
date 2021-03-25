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
        char symbol = '{';

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
        String result = null;
        if (((int)symbol > 32 && (int)symbol<48) || ((int)symbol > 57 && (int)symbol < 65) ||
            ((int)symbol > 90 && (int)symbol < 97) || ((int)symbol > 122 && (int)symbol < 131)) {
            result = "undefined";
        }
        else if ((int)symbol > 47 && (int)symbol < 58) {
            result = "digit";
        }
        else if ((int)symbol>64&&(int)symbol<91||((int)symbol>96&&(int)symbol<123)) {
            result = "latin";
        }
        else if ((int)symbol > 1039 && (int)symbol < 1104) {
            result = "cyrillic";
        }
            return result;
        }
    }

