package com.rakovets.course.java.core.practice.oop.principles.task_about_battle;

public class Warrior extends Hero {
    private final int DAMAGE_WARRIOR = 15;
    private final int DAMAGE_ENEMY_FOR_ASK_HELP = 10;

    public Warrior(String name) {
        super(name);
    }

    public Warrior() {}

    public int attackEnemy(Enemy enemy) {
       return enemy.takeDamage(DAMAGE_WARRIOR);
    }

    public String askForHelp(Enemy enemy) {
        if (enemy.getDAMAGE_ENEMY() > DAMAGE_ENEMY_FOR_ASK_HELP) {
            return "Help, please!!!";
        }
        return "I am OK";
    }
}
