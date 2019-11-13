package com.rakovets.course.challenge.oop.polymorphism;

public class Skeleton extends Enemy {
    Skeleton(String name, int health) {
        super(name, health);
    }

    public void attackHero(Hero hero) {
        System.out.printf("%s attacks the %s  \n ", getName(), hero.getClass().getSimpleName());
        System.out.printf("%s-----[%d%%] \n ", getName(), getHealth());
        hero.takeDamage(30);
    }

    public void takeDamage(int demage) {
        setHealth(getHealth() - demage);
        System.out.printf("Skeleton health: %d \n ", getHealth());
    }
}
