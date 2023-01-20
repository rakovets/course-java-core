package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Mag extends Hero {
    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 8;
        enemy.takeDamage(damage);
        System.out.println("I see the future");
    }

    public void healthRegeneration() {
        int minHealthForRegeneration = 20;
        int healthRegeneration = 30;
        if (getHealth() < minHealthForRegeneration && isAlive()) {
            setHealth(getHealth() + healthRegeneration);
        }
    }
}
