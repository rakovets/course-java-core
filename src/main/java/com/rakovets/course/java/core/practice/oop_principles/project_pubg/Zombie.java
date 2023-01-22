package com.rakovets.course.java.core.practice.oop_principles.project_pubg;

public class Zombie extends Enemy {
    public Zombie(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(5);
    }

    public void resurrection() {
        if (!isAlive()) {
            setHealth(50);
        }
    }
}
