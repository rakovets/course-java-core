package com.rakovets.course.challenge.oop.polimorphism.battle_ground;

public class Zombie extends Enemy {
    public Zombie(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        this.health -= damage;
        if (isAlive()) {
            System.out.printf("\nCurrent HP of enemy: %d\n", this.health);
        } else {
            System.out.println("\nEnemy is dead.");
            this.health = 50;
            System.out.println("Zombie come back with 50 HP.");
        }
    }

    @Override
    public void attackHero(Hero h) {
        h.takeDamage(20);
        System.out.println("Zombie attack hero.");
    }
}
