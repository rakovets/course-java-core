package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Wolf extends Enemy {
    public Wolf(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        if (this.isAlive() && hero.isAlive()) {
            if (this.getHealth() < 35) {
                hero.takeDamage(20);
            }
            hero.takeDamage(10);
        }
    }

    public void healWounds() {
        if (this.isAlive() && this.getHealth() < 15) {
            this.setHealth(this.getHealth() + 20);
        }
    }
}
