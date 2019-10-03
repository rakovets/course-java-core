package com.rakovets.course.practice.methods;

import com.rakovets.course.util.StandardInputTask;

/**
 * Разработать программу для игрового движка:
 * Необходимо окрасить шкалу HP игрока в соответствующий цвет, в зависимости от процентного соотношения максимального
 * количества HP и текущего.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task03 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        int currentHealthPoint = INPUT_SCANNER.nextInt();
        int maxHealthPoint = INPUT_SCANNER.nextInt();

        getColorHealthPoint(currentHealthPoint, maxHealthPoint);
    }

    /**
     * Возвращает цвет для шкалы HP игрока, в зависимости от процентного соотношения максимального количества HP и
     * текущего. Когда меньше 25% - красный, меньше 50% - оранжевый, меньше 75% - желтый, меньше либо равно 100 -
     * зеленый.
     *
     * @param currentHealthPoint текущее количество HP игрока
     * @param maxHealthPoint     - максимальное количество HP игрока
     * @return null/'RED'/'ORANGE'/'YELLOW'/'GREEN'
     */
    static String getColorHealthPoint(int currentHealthPoint, int maxHealthPoint) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        double currentHealthPoint1 = currentHealthPoint;
        double maxHealthPointd = maxHealthPoint;
        double relolt1 = currentHealthPoint1 / maxHealthPoint * 100;
        System.out.println(relolt1);


        String resolt;
        if (relolt1 > 0 && relolt1 < 25) {
            resolt = "RED";
        } else if (relolt1 >= 25 && relolt1 < 50) {
            resolt = "ORANGE";
        } else if (relolt1 >= 50 && relolt1 < 75) {
            resolt = "YELLOW";
        } else if (relolt1 >= 75 && relolt1 <= 100) {
            resolt = "GREEN";
        } else {
            resolt = null;
        }
        return resolt;
    }
}