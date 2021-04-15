package com.rakovets.course.java.core.practice.oop.principles;

public class Enemy implements Mortal {

    protected int healthEnemy;

    public Enemy(int healthEnemy) {
        this.healthEnemy = healthEnemy;
    }

    public void takeDamage(int damage) {
        healthEnemy -= damage;
    }

    public void attackHero (Hero hero) {
        hero.takeDamage(10);
    }

    public int getHealthEnemy() {
        return healthEnemy;
    }

    public void setHealthEnemy(int healthEnemy) {
        this.healthEnemy = healthEnemy;
    }

    @Override
    public boolean isAlive() {
        System.out.printf("Enemy is alive!\n");
        return healthEnemy > 0;
    }
}
