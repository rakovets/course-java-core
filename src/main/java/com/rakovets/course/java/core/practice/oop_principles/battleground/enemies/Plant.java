package com.rakovets.course.java.core.practice.oop_principles.battleground.enemies;

import com.rakovets.course.java.core.practice.oop_principles.battleground.heroes.Hero;

public class Plant extends Enemy {
    public Plant(int health) {
        super(health);
    }

    private int damageToHero = 20;

    public void attackHero(Hero hero) {
        int heroHealth = hero.getHealth() - damageToHero;
        hero.setHealth(heroHealth);
    }
}
