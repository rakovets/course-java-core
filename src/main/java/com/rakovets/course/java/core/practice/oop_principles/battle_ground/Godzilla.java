package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Godzilla extends Enemy {
    public Godzilla(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(10);
    }

    public void resurrection(Enemy enemy) {
        if (!isAlive()) {
            setHealth(100);
        }
    }
}
