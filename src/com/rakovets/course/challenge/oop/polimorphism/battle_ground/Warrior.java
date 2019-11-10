package com.rakovets.course.challenge.oop.polimorphism.battle_ground;

public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name, health);
    }

    public void takeDamage(int damageFromEnemy) {
        this.health -= damageFromEnemy;
        System.out.printf("\nCurrent HP of hero: %d\n", this.health);
    }

    @Override
    public void attacEnemy(Enemy e) {
        e.takeDamage(20);
        System.out.println("Warrior attack enemy.");
    }
}
