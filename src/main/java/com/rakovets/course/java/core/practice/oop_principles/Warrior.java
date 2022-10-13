package com.rakovets.course.java.core.practice.oop_principles;

public class Warrior extends Hero {
    final String Warrior_ATTACK_ENEMY_BUT_MISSED = "Warrior attacks enemy but missed";

    Warrior (String name) {
        super(name);
    }

    @Override
    public String attackEnemy() {
        return Warrior_ATTACK_ENEMY_BUT_MISSED;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(10);
    }
}
