package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

public class Ork extends Enemy {

    public Ork(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(30);
    }

    public void lastBlow(Hero hero) {
        if (!this.isAlive()) {
            hero.takeDamage(30);
        }
    }
}
