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

		String result;
		double hundred = maxHealthPoint / 100;
		double percentage = currentHealthPoint  / hundred;
		if (percentage > 0 && percentage < 25) {
			result ="RED";
		} else if (percentage >= 25 && percentage < 50) {
			result ="ORANGE";
		} else if (percentage >= 50 && percentage < 75) {
			result ="YELLOW";
		} else if (percentage >= 75 && percentage < 101) {
			result ="GREEN";
		} else {
			result = null;
		}
		return result;
	}
}