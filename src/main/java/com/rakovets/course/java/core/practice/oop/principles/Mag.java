package com.rakovets.course.java.core.practice.oop.principles;

public class Mag extends Hero {
    private final int DAMEGE_MAG = 20;

    public Mag(String name) {
        super(name);
    }

    public int attackEnemy(Enemy enemy) {
       return enemy.takeDamage(DAMEGE_MAG);
    }

    public void dead(Enemy enemy) {
        if (enemy.getDAMAGE_ENEMY() > 35) {
            setIndicatorHealth(0);
        }
    }
}
