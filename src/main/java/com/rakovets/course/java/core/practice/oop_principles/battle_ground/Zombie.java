package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Zombie extends Enemy {
    public Zombie(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(12);
        System.out.println("Braaains! Zombie attacks " + hero.getName() + "!");
    }

    public void undeadReincarnation() {
        if (!this.isAlive()) {
            double random = Math.random();

            if (random > 0.0 && random <= 0.2) {
                this.setHealth(20);
                System.out.println("Zombie rises again!!!");
            }
        }
    }
}
