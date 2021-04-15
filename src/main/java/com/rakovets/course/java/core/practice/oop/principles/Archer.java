package com.rakovets.course.java.core.practice.oop.principles;

public class Archer extends Hero {
    private final int DAMAGE_ARCHER = 35;

    public Archer(String name) {
        super(name);
    }

    public int attackEnemy(Enemy enemy) {
        return enemy.takeDamage(DAMAGE_ARCHER);
    }

    public void refuseHealth(Enemy enemy) {
        if (enemy.getHealth() > 100) {
            setIndicatorHealth(getIndicatorHealth() - 20);
        }
    }
}
