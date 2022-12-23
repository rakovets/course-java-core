package com.rakovets.course.java.core.practice.operators;

/**
 * Разработать программу для метеорологической станции.
 *
 * @author Dmitry Rakovets
 */
class Task04 {
    /**
     * Скорость звука в воздушной среде 1191.6 км/ч
     */
    private static final float SOUND_SPEED = 1191.6f;

    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        float milliseconds = 2000f;

        float distance = getDistance(milliseconds);
        System.out.printf("Result: %f", distance);
    }

    /**
     * Высчитывает расстояние (в метрах) до ближайшего места удара молнии. Расстояние = скорость * время, если
     * используются одинаковые единицы CI.
     *
     * @param milliseconds время (в миллисекундах) между срабатыванием датчика света и звука
     */
    static float getDistance(float milliseconds) {
        final int timesec = 1000;
        final float speedMS = 3.6f;
        float speed = SOUND_SPEED / speedMS;
        float time = milliseconds / timesec;
        float distancemetr = speed * time;
        return distancemetr;
    }
}
