package com.rakovets.course.javabasics.practice.conditionalstatements;

import com.rakovets.course.javabasics.util.StandardInputTask;

/**
 * Разработать программу для игрового движка.
 * <p>
 * После каждого боя выводится таблица статистики боя для команды. Расположение в данной таблице зависит
 * от урона нанесенного в бою. Определить вошел ли игрок в ТОП игроков своей команды.
 *
 * @author Dmitry Rakovets
 */
public class Task01 extends StandardInputTask {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int sizeTop = 15;
        int positionPlayerByDamage = 5;

        boolean topPlayer = isTopPlayer(sizeTop, positionPlayerByDamage);
        System.out.printf("Result: %b", topPlayer);
    }

    /**
     * Определяет, вошел ли игрок в ТОП игроков своей команды.
     *
     * @param sizeTop                размер квоты для ТОП игроков команды
     * @param positionPlayerByDamage позиция игрока по убыванию урона в своей команде
     * @return <ul>
     * <li>когда вошел в ТОП игроков, тогда <code>true</code></li>
     * <li>когда не вошел в ТОП игроков, тогда  <code>false</code></li>
     * </ul>
     */
    static boolean isTopPlayer(int sizeTop, int positionPlayerByDamage) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        return sizeTop >= positionPlayerByDamage;
    }
}
