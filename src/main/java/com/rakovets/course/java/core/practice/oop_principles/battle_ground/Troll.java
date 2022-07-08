package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Troll extends Enemy {
    final int DAMAGE_TROLL_STRIKE = 20;
    public Troll (int health) {
        super(health);
    }

    @Override
    public int attackHero(Hero hero) {
        return hero.takeDamage(DAMAGE_TROLL_STRIKE);
    }


}
