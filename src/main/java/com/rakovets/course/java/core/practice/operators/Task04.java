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
        float speed = (float) (SOUND_SPEED / 3.6);
        float time = milliseconds / 1000;
        return speed * time;
    }
}
