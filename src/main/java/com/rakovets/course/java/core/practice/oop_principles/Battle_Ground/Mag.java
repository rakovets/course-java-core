package com.rakovets.course.java.core.practice.oop_principles.Battle_Ground;

class Mag extends Hero {

    public Mag(String name) {
        super(name);
    }

    @Override
    public String attackEnemy() {
        return "The 'Mag' attacks";
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(20);
    }

}
