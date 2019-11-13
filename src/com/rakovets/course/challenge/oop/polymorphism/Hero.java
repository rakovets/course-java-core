package com.rakovets.course.challenge.oop.polymorphism;

public abstract class Hero implements Mortal {
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.health = health;
        this.name = name;
        System.out.printf("Herro  Helth: %d \n ", getHealth());

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

    public boolean isAlive() {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void takeDamage(int demage) {
        setHealth(health -= demage);
        if (health > 0) {
            System.out.printf("%s----[%d%%]", getName(), getHealth());
        } else {
            System.out.printf("%s----[is dead !]", getName());
        }
    }

    public abstract void attackEnemy(Enemy enemy);

    public abstract boolean InDeath();


}

