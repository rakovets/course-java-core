package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Enemy implements Mortal {
    final int HEALTH_HEAL_MAX = 100;
    int health;

    public Enemy() {
        this.health = HEALTH_HEAL_MAX;
    }

    public int takeDamage(int damage) {
        return this.health = getHealth() - damage;
    }

    @Override
    public boolean isAlive(int health) {
        return getHealth() > 0;
    }

    @Override
    public String aliveOrDead(int health) {
        return (getHealth() > 0) ?
                "It's OK! Not dead yet)" :
                "You're dead(";
    }

    public int getHealth() {
        return health;
    }

    public abstract int attackHero(Hero hero);
}
