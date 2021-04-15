package com.rakovets.course.java.core.practice.oop.principles;

public class Warrior extends Hero {
    private final int DAMAGE_WARRIOR = 15;

    public Warrior(String name) {
        super(name);
    }

    public int attackEnemy(Enemy enemy) {
       return enemy.takeDamage(DAMAGE_WARRIOR);
    }

    public String askForHelp(Enemy enemy) {
        if (enemy.getDAMAGE_ENEMY() > 10) {
            return "Help, please!!!";
        }
        return "I am OK";
    }
}
