package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    public Archer (String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (this.isAlive() && enemy.isAlive()) {
            enemy.takeDamage(20);
        }
    }

    public void useDeathShot(Enemy enemy) {
        if (this.isAlive() && enemy.isAlive()) {
            enemy.setHealth(0);
        }
    }

    public void useRainOfArrows(Enemy enemy1, Enemy enemy2) {
        if (this.isAlive() && enemy1.isAlive() && enemy2.isAlive()) {
            enemy1.takeDamage(15);
            enemy2.takeDamage(15);
        }
    }

    public void useRainOfArrows(Enemy enemy1, Enemy enemy2, Enemy enemy3) {
        if (this.isAlive() && enemy1.isAlive() && enemy2.isAlive() && enemy3.isAlive()) {
            enemy1.takeDamage(10);
            enemy2.takeDamage(10);
            enemy3.takeDamage(10);
        }
    }

}
