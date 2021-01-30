package com.rakovets.course.java.core.practice.oop.principles;

public class Archer extends Hero {
    private int health;
    private final int MIN_HEALTH_FOR_RECOVERY = 20;
    private final int MAX_RECOVERY = 11;
    private final int MAX_HEALTH_FOR_RECOVERY = 50;
    private final int MIN_RECOVERY = 6;
    private final int DAMAGE = 19;

    public Archer(String name, int health) {
        super(name, health);
        this.health = health;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(DAMAGE);
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
