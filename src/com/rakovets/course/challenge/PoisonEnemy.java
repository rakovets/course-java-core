package com.rakovets.course.challenge;

public class PoisonEnemy extends Enemy {

    int power = -1;

    PoisonEnemy(int health, String name) {
        super(health, name);
    }

    public void attackHero(Hero hero) {
        System.out.println("*PoisonEnemy атакует героя*");
        hero.health -= 5;
        power++;
        if (power > 2) {
            System.out.println("*Критическая атака*");
            hero.health -= 20;
            power = -1;
        }
        if (hero.health <= 0) {
            System.out.println(hero.getName() + " died");
        }
    }
}
