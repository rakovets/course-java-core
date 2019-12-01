package com.rakovets.course.challenge;

public class HealingEnemy extends Enemy {

    int power = -1;

    HealingEnemy(int health, String name) {
        super(health, name);
    }

    public void attackHero(Hero hero) {
        System.out.println("*HealingEnemy атакует героя*");
        hero.health -= 10;
        power++;
        this.health += power;
        if (power > 19) {
            power = -1;
        }
        if (hero.health <= 0) {
            System.out.println(hero.getName() + " died");
        }
    }
}
