package com.rakovets.course.java.core.practice.operators;

/**
 * Разработать программу для фитнес приложения.
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
        int height = 186;
        int weight = 86;

        float deviationStandardWeight = calculateDeviationStandardWeight(height, weight);
        System.out.printf("Result: %f", deviationStandardWeight);
    }

    /**
     * Рассчитывает избыточность веса пользователя.
     * <ul>
     *  <li>Под избыточность веса понимается разница между текущим весом и стандартным весом для текущего роста
     * (стандартный вес = текущий рост - 110), т.н. индекс Брока</li>
     *  <li>Может быть как положительной, так и отрицательной</li>
     * </ul>
     *
     * @param height - рост
     * @param weight - вес
     */
    static float calculateDeviationStandardWeight(int height, int weight) {
        float deviationStandardWeight = weight - (height-110);
        return deviationStandardWeight;
    }
}
