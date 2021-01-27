package com.rakovets.course.java.core.practice.oop.principles;

public class Warrior extends Hero {
    private int health;
    public Warrior(String name, int health) {
        super(name, health);
        this.health = health;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(21);
    }

    @Override
    public void superPower() {
        if (getHealth() < 20) {
            setHealth(health + 12);
        } else if (getHealth() >=20 || getHealth() < 50) {
            setHealth(health + 7);
        }
    }
}
