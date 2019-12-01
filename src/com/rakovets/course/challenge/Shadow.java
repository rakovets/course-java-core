package com.rakovets.course.challenge;

public class Shadow extends Enemy {

    int power;

    Shadow(int health, String name) {
        super(health, name);
    }

    public void takeDamage(int damage) {
        if (power <= 2) {
            this.health -= damage;
        } else {
            power = -1;
        }
        power++;
    }

    public void attackHero(Hero hero) {
        System.out.println("*Shadow атакует героя*");
        hero.health -= 15;
        if (hero.health <= 0) {
            System.out.println(hero.getName() + " died");
        }
    }
}
