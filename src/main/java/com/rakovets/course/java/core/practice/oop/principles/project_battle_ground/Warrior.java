package com.rakovets.course.java.core.practice.oop.principles.project_battle_ground;

public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public String attackEnemy(Enemy enemy) {
        if (isAlive()) {
            enemy.takeDamage(15);
            return "Warrior attack " + enemy.getClass().getSimpleName() + " with 15 points of damage";
        } else {
            return "Warrior is died";
        }
    }
    //special ability
    public String hitHealthHammer(Enemy enemy, Hero hero) {
        if (isAlive()) {
            if (hero.getHealth() <= 10) {
                enemy.takeDamage(10);
                hero.takeDamage(-10);
                return "Power health hit is successful. Warrior has + 10 points of health."
                        + enemy.getClass().getSimpleName() + " has 10 points of damage";
            } else {
                return "Power health hit is not successful. Warrior has more than 10 points of health";
            }
        } else {
            return "Warrior is died";
        }
    }
}
