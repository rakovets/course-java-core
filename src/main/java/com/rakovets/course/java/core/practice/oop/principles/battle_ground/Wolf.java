package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Wolf extends Enemy {
    public Wolf(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        if (this.isAlive()) {
            if (this.getHealth() < 15) {
                hero.takeDamage(20);
            }
            hero.takeDamage(10);
        }
    }
}
