package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero.Hero;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.interfaces.Mortal;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void attackHero(Hero hero) {
        hero.takeDamage(20);
    }

    public void takeDamage(int damage) {
        if (isAlive() == true) {
            this.health -= damage;
        } else {
            this.health = 0;
        }
    }

    @Override
    public boolean isAlive() {
       return this.health > 0;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
}
