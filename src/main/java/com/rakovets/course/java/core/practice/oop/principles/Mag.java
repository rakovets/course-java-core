package com.rakovets.course.java.core.practice.oop.principles;

public class Mag extends Hero {
    private int health;
    public Mag(String name, int health) {
        super(name, health);
        this.health = health;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(17);
    }

    @Override
    public void superPower() {
        if (getHealth() < 20) {
            setHealth(health + 10);
        } else if (getHealth() >=20 || getHealth() < 50) {
            setHealth(health + 5);
        }
    }
}
