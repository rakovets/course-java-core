package com.rakovets.course.java.core.practice.oop_principles.battleground.enemies;

import com.rakovets.course.java.core.practice.oop_principles.battleground.Mortal;
import com.rakovets.course.java.core.practice.oop_principles.battleground.heroes.Hero;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    @Override
    public boolean isAlive(int health) {
        return (health <= 0) ? true : false;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void attackHero(Hero hero, int damage) {
        int heroHealth = hero.getHealth();
        int heroHealthAfterDamage = heroHealth - damage;
        hero.setHealth(heroHealthAfterDamage);
    }


}
