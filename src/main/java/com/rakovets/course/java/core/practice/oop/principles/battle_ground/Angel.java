package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Angel extends Enemy {

    public Angel(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        if (damage > 20) {
            int divineHealth = getHealth() - (damage / 2);
            setHealth(divineHealth);
        }
    }

    @Override
    public void attackHero(Hero hero) {
        if (this.isAlive()) {
            hero.takeDamage(50);
        }
    }
}
