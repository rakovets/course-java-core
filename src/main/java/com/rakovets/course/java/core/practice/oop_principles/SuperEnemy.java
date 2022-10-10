package com.rakovets.course.java.core.practice.oop_principles;

public class SuperEnemy extends Enemy {
    SuperEnemy(int health) {
        super(health);
    }

    public void deadHit(Hero hero) {
        hero.setHealth(0);
    }
}
