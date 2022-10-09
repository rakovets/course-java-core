package com.rakovets.course.java.core.practice.oop_principles.battle_groud;

public class Werewolf extends Enemy {
    public Werewolf(int health) {
        super(health);
    }

    public int attackHero(Hero hero) {
        final int DOUBLE_ATTACK = 2;

        int damage = 85;

        System.out.println("Werewolf attacks!");
        return hero.takeDamage(damage * DOUBLE_ATTACK);
    }
}
