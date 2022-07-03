package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Archer extends Hero {
    Archer(String name, int health) {
        super(name, health);
    }

    public void attackEnemy(Enemy enemy, int damage) {
        if (isAlive()) {
            int archerExtraDamage = 10;
            int chanceAttackWithFalcon = (int) (Math.random() * 3);
            enemy.takeDamage(damage + archerExtraDamage);
            if (chanceAttackWithFalcon == 1) attackEnemyWithFalcon(enemy);
        }
    }

    public void attackEnemyWithFalcon(Enemy enemy) {
        int falconDamage = 21;
        enemy.takeDamage(falconDamage);
    }
}
