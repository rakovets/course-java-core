package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemies;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes.Hero;

public class Zombie extends Enemy{
    public Zombie(int health) {
        super(health);
    }

    public String attackHero(Hero hero) {
        int damage = 10;
        hero.takeDamage(damage);
        return "Attacks this hero!";
    }

    public boolean isAlive() {
        return this.getHealth() > 0;
    }
}
