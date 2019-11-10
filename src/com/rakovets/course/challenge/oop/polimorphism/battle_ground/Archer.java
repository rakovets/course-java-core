package com.rakovets.course.challenge.oop.polimorphism.battle_ground;

public class Archer extends Hero {

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void takeDamage(int damageFromEnemy) {
        this.health -= damageFromEnemy;
        System.out.printf("\nCurrent HP of hero: %d\n", this.health);
    }

    @Override
    public void attacEnemy(Enemy e) {
        e.takeDamage(10);
        System.out.println("Archer attack enemy.");
    }
}
