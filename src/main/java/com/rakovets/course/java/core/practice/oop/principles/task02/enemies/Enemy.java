package com.rakovets.course.java.core.practice.oop.principles.task02.enemies;

import com.rakovets.course.java.core.practice.oop.principles.task02.Mortal;
import com.rakovets.course.java.core.practice.oop.principles.task02.PoisonTouch;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroes.Hero;

public abstract class Enemy implements Mortal, PoisonTouch {
    private int health;
    private int attack;

    public Enemy(int health, int attack) {
        this.health = health;
    }

    public abstract void getDamage(int damage);

    @Override
    public abstract boolean isAlive();

    public abstract void attack(Hero hero);

    @Override
    public void poison(int poisonTouch) {

    }

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
