package com.rakovets.course.java.core.practice.oop_principles;

public class Archer extends  Hero {
    final int DAMAGE_FROM_ARCHER = 20;
    final String ARCHER_ATTACK_ENEMY_BUT_MISSED = "Archer attacks enemy but missed";

    Archer(String name) {
        super(name);
    }

    @Override
    public String attackEnemy() {
        return ARCHER_ATTACK_ENEMY_BUT_MISSED;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(DAMAGE_FROM_ARCHER);
    }
}
