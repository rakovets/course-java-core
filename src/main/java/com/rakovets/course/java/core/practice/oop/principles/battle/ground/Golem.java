package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

public class Golem extends Enemy {
    int damageFromGolem = 20;

    public Golem(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(damageFromGolem);
    }
    @Override
    public void takeDamage (int damage) {
        this.setHealth((this.getHealth() - (damage / 2)));
    }
}
