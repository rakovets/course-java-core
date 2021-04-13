package com.rakovets.course.java.core.practice.oop.principles.task02.heroes;

import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Enemy;
import com.rakovets.course.java.core.practice.oop.principles.task02.Mortal;

public abstract class Hero implements Mortal {
    private String name;
    private int health;
    private int attack;


    public Hero(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public abstract void attackEnemy(Enemy enemy);

    public abstract void getDamageFromEnemy (int damage);

    public String getName() {
        return name;
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
