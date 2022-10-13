package com.rakovets.course.java.core.practice.oop_principles;

public class Mag extends Hero {
    final String MAG_ATTACK_ENEMY_BUT_MISSED = "Mag attacks enemy but missed";

    Mag(String name) {
        super(name);
    }

    @Override
    public String attackEnemy() {
        return MAG_ATTACK_ENEMY_BUT_MISSED;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(15);
    }
}
