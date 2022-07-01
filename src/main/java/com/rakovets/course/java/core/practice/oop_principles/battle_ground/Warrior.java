package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Warrior extends Hero {
    private int copyHealth;

    public Warrior(String name, int health) {
        super(name, health);
        this.copyHealth = health;
    }

    @Override
    public void attackEnemy(Enemy enemy, int damage) {
        if (isAlive()) {
            if (berserkMode()) {
                enemy.takeDamage((damage * 2) + PERCENT_OF_DAMAGE);
            } else {
                enemy.takeDamage(damage + PERCENT_OF_DAMAGE);
            }
        } else {
            System.out.println("He is dead.");
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
        } else {
            System.out.println("He is dead.");
        }
    }

    public boolean berserkMode() {
        return getHealth() < (copyHealth / 2);
    }
}
