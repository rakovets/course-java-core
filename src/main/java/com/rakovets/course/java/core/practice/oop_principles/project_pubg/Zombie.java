package com.rakovets.course.java.core.practice.oop_principles.project_pubg;

public class Zombie extends Enemy {
    public Zombie() {
    }

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        int attackDamage = 5;
        hero.takeDamage(attackDamage);
    }

    public void resurrection() {
        int resurrectionHealthPoint = 50;
        if (!isAlive()) {
            setHealth(resurrectionHealthPoint);
        }
    }
}
