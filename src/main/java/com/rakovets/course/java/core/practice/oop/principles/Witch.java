package com.rakovets.course.java.core.practice.oop.principles;

public class Witch extends Enemy implements Mortal {
    public static final int ATTACK = 50;

    public Witch(double health) {
        super(health);
    }

    public void totalAttack(Hero hero) {
        if (!isAlive()) {
            hero.takeDamage(ATTACK);
        }
    }
}
