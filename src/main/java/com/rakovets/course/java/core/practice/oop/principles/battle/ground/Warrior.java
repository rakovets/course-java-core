package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(25);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    @Override
    public void takeDamage(int damage) {
        this.setHealth(getHealth() - damage);
    }

    public void useShield(int damage) {
        this.setHealth((this.getHealth() - (damage - 20)));
    }
}
