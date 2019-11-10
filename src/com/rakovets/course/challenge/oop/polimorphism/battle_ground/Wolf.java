package com.rakovets.course.challenge.oop.polimorphism.battle_ground;

public class Wolf extends Enemy {
    public Wolf(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
    }

    @Override
    public void attackHero(Hero h) {
        h.takeDamage(15);
        System.out.println("Wolf attack hero.");
    }
}
