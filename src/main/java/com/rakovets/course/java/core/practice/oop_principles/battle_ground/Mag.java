package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Mag extends Hero{
    Mag(String name, int health) {
        super(name, health);
    }

    public void attackEnemy(Enemy enemy, int damage) {
        if (isAlive()) {
            int magExtraDamage = 13;
            enemy.takeDamage(damage + magExtraDamage);
        }
    }

    public void heal() {
        int amountHealHp = 20;
        setHealth(getHealth() + amountHealHp);
    }
}
