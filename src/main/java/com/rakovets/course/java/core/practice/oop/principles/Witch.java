package com.rakovets.course.java.core.practice.oop.principles;

public class Witch extends Enemy implements Mortal {

    public Witch(double health) {
        super(health);
    }

    public void totalAttack(Hero hero) {
        if (!isAlive()) {
            hero.takeDamage(50);
        }
    }
}
