package com.rakovets.course.challenge.oop.polymorphism;

class Archer extends Hero {
    public Archer(String name, int health) {
        super(name, health);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.printf("%s attacks the %s  \n ", getName(), enemy.getClass().getSimpleName());
        System.out.printf("%s-----[%d%%] \n ", getName(), getHealth());
        enemy.takeDamage(30);
    }

    public boolean InDeath() {
        if (this.getHealth() < 0) {
            return false;
        } else {
            return true;
        }
    }

    public void takeDamage(int demage) {
        setHealth(getHealth() - demage);
        System.out.printf("Archer  Helth: %d \n ", getHealth());
    }
}
