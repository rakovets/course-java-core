package com.rakovets.course.java.core.practice.oop.principles.task_about_battle;

public class Archer extends Hero {
    private final int DAMAGE_ARCHER = 35;

    public Archer(String name) {
        super(name);
    }

    public Archer() {}

    public int attackEnemy(Enemy enemy) {
        return enemy.takeDamage(DAMAGE_ARCHER);
    }

    public int refuseHealth(Enemy enemy) {
        if (enemy.getHealth() > 100) {
            setIndicatorHealth(getIndicatorHealth() - 20);
            return getIndicatorHealth();
        }
        return getIndicatorHealth();
    }
}
