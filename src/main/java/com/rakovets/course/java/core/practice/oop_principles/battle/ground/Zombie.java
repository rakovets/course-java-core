package com.rakovets.course.java.core.practice.oop_principles.battle.ground;

public class Zombie extends Enemy {
    public Zombie(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(12);
        System.out.println("Braaains!");
    }

    public void undeadReincarnation() {
        if (Math.random()*6 == 1) {
            this.setHealth(20);
        }
    }
}
