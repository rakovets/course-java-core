package com.rakovets.course.java.core.practice.oop.principles;

public class Goblin extends Enemy {
    private final int DAMAGE_OF_POISON = 2;
    public Goblin(int health) {
        super(health);
    }

    public void givePoison(Hero hero) {
        hero.takeDamage(hero.getHealth() / DAMAGE_OF_POISON);
    }
}
