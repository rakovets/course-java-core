package com.rakovets.course.java.core.practice.oop.principles;

public class Skeleton extends Enemy {
    public Skeleton(int health) {
        super(health);
    }
    @Override
    public void attackHero(Hero hero) {
        System.out.println("Враг атакует героя");
        if (hero instanceof Archer) {
            hero.takeDamageHero(5);
        } else {
            hero.takeDamageHero(15);
        }
    }
}
