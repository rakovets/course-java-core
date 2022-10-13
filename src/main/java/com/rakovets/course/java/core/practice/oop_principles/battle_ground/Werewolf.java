package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Werewolf extends Enemy {
    public Werewolf(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(35);
    }

    public void transformToWolfBody() {
        this.setHealth(this.getHealth() + 15);
    }
}
