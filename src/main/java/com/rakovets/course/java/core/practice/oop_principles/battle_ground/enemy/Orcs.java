package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Hero;

public class Orcs extends Enemy {
    public double damageReflectionHero = 0.45;

    public Orcs(double health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        double damage = 13;
        hero.takeDamage(damage);
        double healModificator = 0.4;
        setHealth(getHealth() + damage * healModificator);
    }

    @Override
    public void takeDamage(double damage) {
        this.setHealth(getHealth() - damage * damageReflectionHero);
    }
}
