package com.rakovets.course.java.core.practice.oop_principles.battle.ground;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(20);
        System.out.println("Warrior attacks with sword!");
    }

    public void firstAid(Hero hero) {
        hero.takeDamage(-12);
        System.out.println(this.getName() + " uses First Aid skills and heals " + hero.getName() + "!");
    }
}
