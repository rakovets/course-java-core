package com.rakovets.course.java.core.practice.oop.principles.battle.ground.heroes;

import com.rakovets.course.java.core.practice.oop.principles.battle.ground.enemies.Enemy;

public abstract class Hero {
    private final String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public abstract void attackEnemy(Enemy enemy);
    public abstract String skills(int skill);
    public abstract void skillList();
    public abstract void skillDescription();

    public void death() {
        if (health <= 0) {
            System.out.println("Герой погиб\nGAME OVER");
        } else {
            System.out.println("Герой все еще жив");
        }
    }

    public int random(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
