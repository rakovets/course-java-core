package com.rakovets.course.java.core.practice.oop_principles;

public class Zombie extends Enemy {
    Zombie(int health) {
        super(health);
    }
    @Override
    public void attackHeroes(Hero hero) {
        hero.takeDamage(20);
    }

    public void startNewLife() {
        if (!isAlive()) {
            setHealth(100);
        }
    }
}
