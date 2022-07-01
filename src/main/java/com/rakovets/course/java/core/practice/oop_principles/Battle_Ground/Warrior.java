package com.rakovets.course.java.core.practice.oop_principles.Battle_Ground;

class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public String attackEnemy() {
        return "The 'Warrior' attacks";
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(10);
    }
}
