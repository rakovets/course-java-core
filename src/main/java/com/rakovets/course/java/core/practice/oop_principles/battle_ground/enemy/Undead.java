package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Hero;

public class Undead extends Enemy {

    public Undead(double health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        double damage = 10;
        hero.takeDamage(damage);
        double healModificator = 0.2;
        setHealth(getHealth() + damage * healModificator);
    }

    @Override
    public void takeDamage(double damage) {
        double damageReflectionHero = 0.3;
        this.setHealth(getHealth() - damage * damageReflectionHero);
    }
}
