package com.rakovets.course.java.core.practice.oop.principles;

public class Zombie extends Enemy {

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void attackEnemy(Hero hero) {
        hero.takeDamage(-10);
    }

    public void posion(Hero hero) {
        hero.takeDamage(-20);
    }
}
