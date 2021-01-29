package com.rakovets.course.java.core.practice.oop.principles;

public class Warrior extends Hero {
    private int health;
    private final int MIN_HEALTH_FOR_RECOVERY = 20;
    private final int MAX_RECOVERY = 12;
    private final int MAX_HEALTH_FOR_RECOVERY = 50;
    private final int MIN_RECOVERY = 7;
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
        if (getHealth() < MIN_HEALTH_FOR_RECOVERY) {
            setHealth(health + MAX_RECOVERY);
        } else if (getHealth() >= MIN_HEALTH_FOR_RECOVERY || getHealth() < MAX_HEALTH_FOR_RECOVERY) {
            setHealth(health + MIN_RECOVERY);
        }
    }
}
