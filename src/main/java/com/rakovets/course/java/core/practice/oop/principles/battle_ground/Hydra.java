package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Hydra extends Enemy {
    public Hydra(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        int thickFat = getHealth() - (damage / 3);
        setHealth(thickFat);
    }

    @Override
    public void attackHero(Hero hero) {
        if (this.isAlive()) {
            hero.takeDamage(20);
        }
    }

    public void attackHero(Hero hero1, Hero hero2, Hero hero3) {
        if (this.isAlive()) {
            hero1.takeDamage(20);
            hero2.takeDamage(20);
            hero3.takeDamage(20);
        }
    }
}
