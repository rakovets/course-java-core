package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Hero;

public class Witch extends Enemy {
    double healingHero = 1.7;

    public Witch(double health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        double damage = 7;
        hero.takeDamage(damage);
        setHealth(damage);
    }

    @Override
    public void takeDamage(double damage) {
        this.setHealth(getHealth() * healingHero - damage);
    }
}
