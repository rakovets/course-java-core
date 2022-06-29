package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Vampire extends Enemy {
    public Vampire(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(5);
        this.setHealth(getHealth() + 5);
    }
}
