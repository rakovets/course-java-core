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

    public void death() {
        if (health <= 0) {
            System.out.println("Герой погиб\nGAME OVER");
        } else {
            System.out.println("Герой все еще жив");
        }
    }

    public Object selectClass(int choice, String name) {
        if (choice == 1) {
            return new Warrior(name, 100);
        } else if (choice == 2) {
            return new Archer(name, 100);
        } else if (choice == 3) {
            return new Mag(name, 100);
        }
        return "Неверно выбран класс";
    }

    public int random(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public abstract String skills(int skill);
    public abstract void attackEnemy(Enemy enemy);
    public abstract void skillList();
    public abstract void skillDescription();
    public abstract void firstSkill(Enemy enemy);
    public abstract void secondSkill(Enemy enemy);
    public abstract boolean defendSkill(Enemy enemy);

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
