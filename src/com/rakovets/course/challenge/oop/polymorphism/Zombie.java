package com.rakovets.course.challenge.oop.polymorphism;

import java.util.Random;

public class Zombie extends Enemy {
    boolean isAlive;

    Zombie(String name, int health) {
        super(name, health);
    }

    public void takeDamage(int demage) {
        setHealth(getHealth() - demage);
        System.out.printf("Zombie health: %d \n ", getHealth());
        if (getHealth() > 0) {
            riseAgain();
        }
    }

    public void attackHero(Hero hero) {
        System.out.printf("%s attacks the %s  \n ", getName(), hero.getClass().getSimpleName());
        System.out.printf("%s-----[%d%%] \n ", getName(), getHealth());
        hero.takeDamage(10);
    }


    public void riseAgain() {
        Random random = new Random();
        int random1 = random.nextInt(1);
        if (random1 == 0) {
            isAlive = true;
            System.out.println("Success");
        } else {
            System.out.println("Unsuccess");
        }
    }
}
