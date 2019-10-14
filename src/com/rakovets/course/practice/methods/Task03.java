package com.rakovets.course.practice.methods;

import com.rakovets.course.util.StandardInputTask;

/**
 * Разработать программу для игрового движка:
 * Необходимо окрасить шкалу HP игрока в соответствующий цвет, в зависимости от количества HP.
 * Меньше 25% - красный, меньше 50% - оранжевый, меньше 75% - желтый, в остальных случаях зеленый,
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
	 * @param currentHealthPoint текущее количество HP игрока
	 * @param maxHealthPoint - максимальное количество HP игрока
	 * @return null/'RED'/'ORANGE'/'YELLOW'/'GREEN'
	 */
	static String getColorHealthPoint(int currentHealthPoint, int maxHealthPoint) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		double traker = currentHealthPoint;
		double result = traker / maxHealthPoint * 100;

		String color;
		if (result > 0 && result < 25) {
			color = "RED";
		} else if (result >= 25 && result < 50) {
			color = "ORANGE";
		} else if (result >= 50 && result < 75) {
			color = "YELLOW";
		} else if (result >= 75 && result <= 100) {
			color = "GREEN";
		} else {
			color = null;
		}
		return color;
	}
}