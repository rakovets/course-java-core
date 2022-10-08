package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Hero;

public class Zombie extends Enemy {
    private double twoLife;

    public Zombie(double health) {
        super(health);
        this.twoLife = health;
    }

    @Override
    public void attackHero(Hero hero) {
        double damage = 6;
        hero.takeDamage(damage);
    }

    @Override
    public void takeDamage(double damage) {
        super.takeDamage(damage);
        if (this.getHealth() <= 0) {
            this.setHealth(twoLife);
            this.twoLife = 0;
        }
    }
}
