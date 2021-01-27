package com.rakovets.course.java.core.practice.oop.principles;

public class Goblin extends Enemy{
    public Goblin(int health) {
        super(health);
    }

    public void givePoison(Hero hero) {
        hero.takeDamage(hero.getHealth() / 2);
    }
}
