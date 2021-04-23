package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Golem extends Enemy {
    public Golem(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        int resistDamage = getHealth() - (damage / 5);
        this.setHealth(Math.max(resistDamage, 0));
    }

    @Override
    public void attackHero(Hero hero) {
        if (this.isAlive() && hero.isAlive()) {
            hero.takeDamage(25);
        }
    }

    public void splashAttack(Hero hero1, Hero hero2, Hero hero3) {
        if (this.isAlive() && hero1.isAlive() && hero2.isAlive() && hero3.isAlive()) {
            hero1.takeDamage(25);
            hero2.takeDamage(25);
            hero3.takeDamage(25);
        }
    }
}
