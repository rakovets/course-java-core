package com.rakovets.course.java.core.practice.oop_principles.battle.ground;

public class Boar extends Enemy {
    public Boar(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(9);
        System.out.println("Gr!");
    }

    public void charge(Hero hero) {
        hero.takeDamage(15);
        System.out.println("Boar charges at " + hero.getName() + " with insane rage!");
    }
}
