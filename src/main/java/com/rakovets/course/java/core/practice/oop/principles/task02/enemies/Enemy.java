package com.rakovets.course.java.core.practice.oop.principles.task02.enemies;

import com.rakovets.course.java.core.practice.oop.principles.task02.Mortal;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroes.Hero;

public abstract class Enemy implements Mortal {
    private int health;
    private int attack;

    public Enemy(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    public abstract void getDamage(int damage);

    @Override
    public abstract boolean isAlive();

    public abstract void attack(Hero hero);

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
