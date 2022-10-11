package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemies;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes.Hero;

public class Demon extends Enemy {
    private int chanceToUseSuperAttack;

    public Demon(double health) {
        super(health);
    }

    public Demon(String name, double health, int chanceToUseSuperAttack) {
        super(name, health);
        this.chanceToUseSuperAttack = chanceToUseSuperAttack;
    }

    @Override
    public String attackHero(Hero hero) {
        double damage = 30;
        if (hero.isAlive()) {
            hero.takeDamage(damage);
        }
        return "attacks this hero!";
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
}
