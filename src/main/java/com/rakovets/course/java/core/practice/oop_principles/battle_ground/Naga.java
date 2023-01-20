package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Naga extends Enemy{
    public Naga(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        int damage = 4;
        hero.takeDamage(damage);
    }
}
