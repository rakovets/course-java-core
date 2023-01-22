package com.rakovets.course.java.core.practice.oop_principles.project_pubg;

public class Cyborg extends Enemy{
    public Cyborg(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(10);
    }

    public void transformToDecepticon() {
        setHealth(getHealth() + 100);
    }
}
