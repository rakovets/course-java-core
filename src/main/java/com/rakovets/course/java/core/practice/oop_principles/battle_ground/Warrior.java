package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Warrior extends Hero{
    Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy, int damage) {
        if (isAlive()) {
            int warriorExtraDamage = 15;
            enemy.takeDamage(damage + warriorExtraDamage);
        }
    }

    @Override
    public void takeDamage(int damage) {
        int damageDivider = 2;
        if (isAlive()) setHealth(getHealth() - damage / damageDivider);
    }
}
