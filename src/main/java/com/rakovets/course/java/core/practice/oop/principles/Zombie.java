package com.rakovets.course.java.core.practice.oop.principles;

public class Zombie extends Enemy {
    private int countOfLives = 0;

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        if (hero instanceof Warrior) {
            hero.takeDamageHero(15);
        } else {
            hero.takeDamageHero(5);
        }
    }

    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
        if (!isAlive() && countOfLives < 2) {
            this.setHealth(50);
            countOfLives++;
        }
    }
}
