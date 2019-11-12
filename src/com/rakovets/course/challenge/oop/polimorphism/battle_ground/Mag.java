package com.rakovets.course.challenge.oop.polimorphism.battle_ground;

public class Mag extends Hero {

    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void takeDamage(int damageFromEnemy) {
        this.health -= damageFromEnemy;
        if (isAlive()) {
            System.out.printf("\nCurrent HP of hero: %d\n", this.health);
        } else {
            System.out.println("\nMag is dead :(");
        }
    }

    @Override
    public void attacEnemy(Enemy e) {
        e.takeDamage(15);
        System.out.println("Mag attack enemy.");
    }
}
