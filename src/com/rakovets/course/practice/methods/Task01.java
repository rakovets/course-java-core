package com.rakovets.course.practice.methods;

import com.rakovets.course.util.StandardInputTask;

/**
 * Разработать программу для игрового движка:
 * После каждого боя выводится таблица статистики боя для команды. Расположение в данной таблице зависит
 * от урона нанесенного в бою. Определить вошел ли игрок в ТОП игроков своей команды.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task01 extends StandardInputTask {
	public static void main(String[] args) {
		// Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
		int sizeTeam = INPUT_SCANNER.nextInt();
		int sizeTop = INPUT_SCANNER.nextInt();
		int positionPlayerByDamage = INPUT_SCANNER.nextInt();

        isTopPlayer(sizeTeam, sizeTop, positionPlayerByDamage);
    }

    /**
     * Определяет, вошел ли игрок в ТОП игроков своей команды.
     * @param sizeTeam позиция игрока по убыванию урона в своей команде
     * @param sizeTop позиция игрока по убыванию урона в своей команде
     * @param positionPlayerByDamage позиция игрока по убыванию урона в своей команде
     * @return true когда вошел, false если не вошел
     */
	static boolean isTopPlayer(int sizeTeam, int sizeTop, int positionPlayerByDamage) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
        return false;
	}
}