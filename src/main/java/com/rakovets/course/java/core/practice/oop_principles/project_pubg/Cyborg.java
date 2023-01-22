package com.rakovets.course.java.core.practice.oop_principles.project_pubg;

public class Cyborg extends Enemy {
    public Cyborg() {
    }

    public Cyborg(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        int attackDamage = 10;
        hero.takeDamage(attackDamage);
    }

    public void transformToDecepticon() {
        int increaseHealthPoint = 100;
        setHealth(getHealth() + increaseHealthPoint);
    }
}
