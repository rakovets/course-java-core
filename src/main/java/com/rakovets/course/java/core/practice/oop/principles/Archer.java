package com.rakovets.course.java.core.practice.oop.principles;

public class Archer extends Hero {
    public Archer(String name, double health) {
        super(name, health);
    }

    public void attackEnemy() {
        System.out.println("Archer is attacking Enemy");
    }
    public void attackEnemy(Enemy enemy) {
        attackEnemy();
        if (getHealth() < 250) {
            enemy.takeDamage(35);
        }
        enemy.takeDamage(25);
    }

}
