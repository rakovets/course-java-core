package com.rakovets.course.java.core.practice.oop_principles.battle_ground;
public class Tenebrarum extends Enemy implements Mortal {
    public Tenebrarum(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        if (hero instanceof Mag) {
            hero.takeDamage(30);
        } else {
            hero.takeDamage(15);
        }
    }
}
