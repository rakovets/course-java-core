package com.rakovets.course.java.core.practice.oop_principles.battleground.heroes;

import com.rakovets.course.java.core.practice.oop_principles.battleground.enemies.Enemy;

public abstract class Hero {
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
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

    public void attackEnemy() {
        System.out.println("Герой атакует врага");
    }

    public abstract void attackEnemy(Enemy enemy);

    public abstract void takeDamage(int damage);
}
