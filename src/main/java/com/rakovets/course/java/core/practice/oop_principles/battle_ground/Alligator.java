package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Alligator extends Enemy {

    public Alligator(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamageHero(15);
    }

    public String screams() {
        String cry = "";
        if (isAlive()) {
            cry = "I will finish you";
        } else {
            cry = "I will back";
        }
        return cry;
    }
}
