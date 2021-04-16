package com.rakovets.course.java.core.practice.oop.principles.task_about_battle;

public class Mag extends Hero {
    private final int DAMAGE_MAG = 20;
    private final int LEVEL_DAMAGE_ENEMY_FOR_DEAD_MAG = 35;

    public Mag(String name) {
        super(name);
    }

    public Mag() {}

    public int attackEnemy(Enemy enemy) {
       return enemy.takeDamage(DAMAGE_MAG);
    }

    public int dead(Enemy enemy) {
        if (enemy.getDAMAGE_ENEMY() > LEVEL_DAMAGE_ENEMY_FOR_DEAD_MAG) {
            setIndicatorHealth(0);
            return getIndicatorHealth();
        }
        return getIndicatorHealth();
    }
}
