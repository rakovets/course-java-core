package com.rakovets.course.java.core.practice.oop_principles.battle_Ground;

public class Zombie extends Enemy {
    public Zombie(boolean isAlive, int health) {
        super(health, isAlive);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(3);
    }

    @Override
    public void skillEnemy(Hero hero) {
        final int normalDamagex3 = 9;
        hero.takeDamage(normalDamagex3);
    }
}
