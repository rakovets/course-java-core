package com.rakovets.course.java.core.practice.oop_principles;

public class StrongEnemy extends Enemy {
    StrongEnemy(int health) {
        super(health);
    }

    public void doubleHit(Hero hero) {
        this.attackHeroes(hero);
        this.attackHeroes(hero);
    }
}
