package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Orc extends Enemy {
    private final int criticalHealthPoint = 35;

    public Orc(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        if (this.isAlive() && hero.isAlive()) {
            if (this.getHealth() < criticalHealthPoint) {
                hero.takeDamage(20);
            }
            hero.takeDamage(10);
        }
    }

    public void healDamage() {
        if (this.isAlive() && this.getHealth() < criticalHealthPoint) {
            this.setHealth(this.getHealth() + 20);
        }
    }
}

