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
    private static final double DAMAGE_COEFFICIENT_DEAD = 1.5;
    private static final double DAMAGE_COEFFICIENT_SAINT = 0.5;

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
        int totalDamage;
        int holyDamageDead = (int) Math.round(damage * DAMAGE_COEFFICIENT_DEAD);
        int holyDamageSaint = (int) Math.round(damage * DAMAGE_COEFFICIENT_SAINT);
        if (hasHolyAttribute == true) {
            switch (typeMob) {
                case "UNDEAD":
                case "ZOMBIE":
                    totalDamage = holyDamageDead;
                    break;
                case "SAINT":
                    totalDamage = holyDamageSaint;
                    break;
                default:
                    totalDamage = damage;
            }
        } else {
            totalDamage = damage;
        }
        return totalDamage;
    }
}
