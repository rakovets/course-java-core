package com.rakovets.course.java.core.practice.oop.principles.battle.ground.enemies;

import com.rakovets.course.java.core.practice.oop.principles.battle.ground.heroes.Hero;

public abstract class Enemy implements Mortal {
    final private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void death() {
        System.out.println("Враг повержен\nGAME WIN");
    }

    public abstract void attackHero(Hero hero);
    public abstract void attackTemplate();
    public abstract void startBattleMessage();

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
