package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Zombie extends Enemy {
    private static final int RESURRECT = 50;

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        if (hero instanceof Archer) {
            hero.takeDamage(0);
        } else {
            hero.takeDamage(20);
        }
    }

    public void resurrect() {
        if (!isAlive()) {
            sethHealth(RESURRECT);
        }
    }
}
