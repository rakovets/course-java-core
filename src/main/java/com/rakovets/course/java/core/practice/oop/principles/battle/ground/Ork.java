package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

public class Ork extends Enemy {
    int damageFromOrk = 30;

    public Ork(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(damageFromOrk);
    }

    public void lastBlow(Hero hero) {
        if (!this.isAlive()) {
            hero.takeDamage(damageFromOrk);
        }
    }
}
