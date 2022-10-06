package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemies;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes.Hero;

public class Demon extends Enemy{
    private int chanceToUseSuperAttack = 2;
    public Demon(double health) {
        super(health);
    }

    public String attackHero(Hero hero) {
        double damage = 30;
        if (hero.isAlive()) {
            hero.takeDamage(damage);
        }
        return "Attacks this hero!";
    }

    public String attackWithHellfire(Hero hero) {
        double fireBuffMultiply = 2;
        double damage = 30 * fireBuffMultiply;
        if (hero.isAlive() && chanceToUseSuperAttack > 0) {
            hero.takeDamage(damage);
            this.chanceToUseSuperAttack -= 1;
        }
        return "SUPER HELLFIRE ATTACK!";
    }

    public boolean isAlive() {
        return this.getHealth() > 0;
    }
}
