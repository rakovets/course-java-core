package com.rakovets.course.java.core.practice.oop.principles.task_about_battle;

public class Mag extends Hero {
    private final int DAMEGE_MAG = 20;

    public Mag(String name) {
        super(name);
    }

    public Mag() {}

    public int attackEnemy(Enemy enemy) {
       return enemy.takeDamage(DAMEGE_MAG);
    }

    public int dead(Enemy enemy) {
        if (enemy.getDAMAGE_ENEMY() > 35) {
            setIndicatorHealth(0);
            return getIndicatorHealth();
        }
        return getIndicatorHealth();
    }
}
