package com.rakovets.course.java.core.practice.oop.principles.project_battle_ground;

public class Mag extends Hero {

    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public String attackEnemy(Enemy enemy) {
        enemy.takeDamage(20);
        return "Mag attack " + enemy.getClass().getSimpleName() + " with 20 points of damage";
    }

    //special ability
    public String healthSpell(Hero hero) {
        if (isAlive()) {
            if (hero.getHealth() <= 5) {
                hero.takeDamage(-30);
                return "Healthspell is successful. " + hero.getClass().getSimpleName() + " is cured, + 30 health points ";
            } else {
                return "Healthspell is not available. " + hero.getClass().getSimpleName() + " has more than 5 points of health";
            }
        } else {
            return "Mag is died";
        }
    }
}
