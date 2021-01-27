package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

import java.util.Random;

public class Zombue extends Enemy {

    public Zombue(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(10);
    }

    public void resurrection() {
        if (!this.isAlive()) {
            setHealth(20);
       }
    }
}
