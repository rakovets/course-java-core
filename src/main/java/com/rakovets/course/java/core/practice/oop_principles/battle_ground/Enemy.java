package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Enemy implements Mortal {
    final int HEALTH_MAX = 100;
    private int health;

    public Enemy(int health) {
        this.health = HEALTH_MAX;
    }

    public int takeDamage(int damage) {
        return health - damage;
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
