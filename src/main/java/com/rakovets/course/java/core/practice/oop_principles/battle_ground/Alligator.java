package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Alligator extends Enemy {
    public Alligator(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(15);
    }

    public String screams() {
        return isAlive() ? "I will finish you" : "I will back";
    }
}
