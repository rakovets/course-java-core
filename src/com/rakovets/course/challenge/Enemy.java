package com.rakovets.course.challenge;

public class Enemy implements Mortal {

    int health;
    String name;

    Enemy(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public boolean isAlive() {
        if (this.health > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void attackHero(Hero hero) {
        System.out.println("*Враг атакует героя*");
        hero.health -= 10;
        if (hero.health <= 0) {
            System.out.println(hero.getName() + " died");
        }
    }
}
