package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Murloc extends Enemy{
    public Murloc(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(8);
        System.out.println("MRGHLLGHGHLLGHG! Murloc attacks " + hero.getName() + "!");
    }

    public void regeneration() {
        this.takeDamage(-6);
        System.out.println("OH NO! Murloc's wounds are healing before our eyes!");
    }
}
