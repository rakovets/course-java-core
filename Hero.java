package com.rakovets.course.challenge.oopInheritanceAndPolymorphism;

public class Hero implements Mortal {
    String name;
    private int health;

    Hero (String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }

    void attackEnemy() {
        System.out.println("Attack enemy!");
    }

    void attackEnemy(Enemy enemy) {
        System.out.println("hp:"+enemy.getHealth());
        enemy.takeDamage(10);
    }

    public String toString() {
        return super.toString();
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }
}
