package com.rakovets.course.java.core.practice.decision_making_statements;

/**
 * Разработать программу для игрового движка.
 * <p>
 * Оружие имеет в себе атрибут святости и какой-то чистый урон. Если оружие имеет атрибут святости, то оно наносит:
 * <ul>
 *     <li>в 1.5 раза больше урона по “UNDEAD” и “ZOMBIE”</li>
 *     <li>в 2 раза меньше урона по “SAINT”</li>
 *     <li>без изменений по “ANIMAL”, “HUMANOID”, “PLANT”, “GHOST”</li>
 * </ul>
 * Определить сколько урона нанесет оружие по данному типу моба (моб - персонаж в игре управляемый компьютером).
 */
class Task08 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int damage = 100;
        String typeMob = "SAINT";
        boolean hasHolyAttribute = true;

        int totalDamage = getTotalDamage(damage, typeMob, hasHolyAttribute);
        System.out.printf("Result: %s", totalDamage);
    }

    /**
     * Определяет итоговый урон оружия для данного типу моба.
     *
     * @param damage           чистый урон оружия (без атрибута)
     * @param typeMob          тип моба
     * @param hasHolyAttribute наличие у оружия атрибута святости
     * @return итоговый урон по данному типу моба
     */
    static int getTotalDamage(int damage, String typeMob, boolean hasHolyAttribute) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        final var COEFFICIENT_FOR_UNDEAD_AND_ZOMBIE = 1.5;
        final var COEFFICIENT_FOR_SAINT = 0.5;
        final var COEFFICIENT_FOR_ANIMAL_HUMANOID_PLANT_GHOST = 1;
        int totalDamage = damage;

        if (hasHolyAttribute) {
            if (typeMob.equals("UNDEAD") || typeMob.equals("ZOMBIE")) {
                totalDamage = (int) (damage * COEFFICIENT_FOR_UNDEAD_AND_ZOMBIE);
            } else if (typeMob.equals("SAINT")) {
                totalDamage = (int) (damage * COEFFICIENT_FOR_SAINT);
            } else if (typeMob.equals("ANIMAL") || typeMob.equals("HUMANOID") || typeMob.equals("PLANT") || typeMob.equals("GHOST")) {
                totalDamage = damage * COEFFICIENT_FOR_ANIMAL_HUMANOID_PLANT_GHOST;
            }
        }
        return totalDamage;
    }
}
