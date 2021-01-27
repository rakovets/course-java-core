package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

public class Mage extends Hero {

    public Mage(String name, int health) {
        super(name, health);

    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(15);
        //System.out.println("Mage made an attack with magical damage!");
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    @Override
    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
    }

    public void fireBlast(Enemy enemy1, Enemy enemy2, Enemy enemy3) {
        enemy1.takeDamage(20);
        enemy2.takeDamage(20);
        enemy3.takeDamage(20);
    }
}
