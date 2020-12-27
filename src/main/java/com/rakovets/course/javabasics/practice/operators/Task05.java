package com.rakovets.course.javabasics.practice.operators;

/**
 * Разработать программу для фитнес приложения:
 * которая расчитывает избыточность веса пользователя. Избыточность веса - это разница между текущим весом и
 * стандартным весом для текущего роста (стандартный вес = текущий рост - 110). Может быть как положительный так и
 * отрицательный.
 * Если известно:
 *
 * @param height - рост
 * @param weight - вес
 */
public class Task05 {
    public static void main(String[] args) {
        //FIXME
        // Переменные, которые можно изменять для проверки различных вариантов входных параметров
        int height = 188;
        int weight = 83;

        // Код необходимый для тестирования, не изменять
        height = (args.length == 2) ? Integer.parseInt(args[0]) : height;
        weight = (args.length == 2) ? Integer.parseInt(args[1]) : weight;

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int standardWeight = height - 110;
        int overWeight = weight - standardWeight;
        System.out.print(overWeight);
    }
}
