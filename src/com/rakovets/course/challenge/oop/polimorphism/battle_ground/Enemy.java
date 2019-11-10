package com.rakovets.course.challenge.oop.polimorphism.battle_ground;

public class Enemy implements Mortal {
    int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (isAlive()) {
            System.out.printf("\nCurrent HP of enemy: %d\n", this.health);
        } else {
            System.out.println("\nEnemy is dead.");
        }
    }

    public void attackHero(Hero h) {
        h.takeDamage(30);
        System.out.println("Enemy attack hero.");
    }

    @Override
    public boolean isAlive() {
        return ((this.health > 0) ? true : false);
    }
}
