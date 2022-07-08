package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Witch extends Enemy {
    final int DAMAGE_WITCH_SPELL = 15;


    public Witch () {
    }

    @Override
    public int attackHero(Hero hero) {
        return hero.takeDamage(DAMAGE_WITCH_SPELL);
    }

    public int revive (Witch witch) {
       if (!witch.isAlive(witch.getHealth())) {
           health = HEALTH_HEAL_MAX;
       }
        return health;
    }
}
