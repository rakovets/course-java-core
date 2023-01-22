package com.rakovets.course.java.core.practice.oop_principles.battle.ground;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(20);
        System.out.println("Archer is making a shot!");
    }

    public void firstAid(Hero hero) {
        if (hero.getHealth() <= 88) {
            hero.takeDamage(-12);
        } else if (hero.getHealth() > 88 && hero.getHealth() < 100) {
            hero.takeDamage(-(100 - hero.getHealth()));
        }
        System.out.println(this.getName() + " uses First Aid skills and heals " + hero.getName() + "!");
    }
}
