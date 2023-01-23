package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Wolf extends Enemy {
    public Wolf(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(7);
        System.out.println("Rrrr!!! Wolf bites " + hero.getName() + "!");
    }

    public Wolf howl() {
        Wolf summonedWolf = new Wolf(25);
        System.out.println("Wolfs howls! He's calling a friend!");
        return summonedWolf;
    }
}
