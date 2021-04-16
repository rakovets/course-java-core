package com.rakovets.course.java.core.practice.oop.principles.task_about_battle;

public class Mercenary extends Enemy {

    public Mercenary(int health) {
        super(health);
    }

    public void returnHealth(Hero hero) {
        if (hero.getIndicatorHealth() < getHealth()) {
            setHealth(getHealth() + 10);
        }
    }
}
