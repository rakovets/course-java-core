package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Werewolf extends Enemy{
    public Werewolf(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(15);
    }

    public void inWolfBody() {
        this.setHealth(this.getHealth() + 50);
    }
}
