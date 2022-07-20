package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Warrior extends Hero {
    private int maxHealth;

    public Warrior(String name, int health, int damage) {
        super(name, health, damage);
        this.maxHealth = health;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (isAlive()) {
            if (berserkMode()) {
                enemy.takeDamage((getDamage() * 2));
            } else {
                enemy.takeDamage(getDamage());
            }
        }
    }

    @Override
    public void takeDamage(int damage) {
        if (isAlive()) {
            if (berserkMode()) {
                setHealth(getHealth() - (damage / 2));
            } else {
                setHealth(getHealth() - damage);
            }
        }
    }

    public boolean berserkMode() {
        return getHealth() < (maxHealth / 2);
    }
}
