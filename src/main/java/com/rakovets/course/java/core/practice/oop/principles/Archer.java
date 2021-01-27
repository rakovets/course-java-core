package com.rakovets.course.java.core.practice.oop.principles;

public class Archer extends Hero{
    private int health;
    public Archer(String name, int health) {
        super(name, health);
        this.health = health;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(19);
    }

    @Override
    public void superPower() {
        if (getHealth() < 20) {
            setHealth(health + 11);
        } else if (getHealth() >=20 || getHealth() < 50) {
            setHealth(health + 6);
        }
    }
}
