package com.rakovets.course.java.core.practice.oop_principles.Battle_Ground;

class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }

    @Override
    public String attackEnemy() {
        return "The 'Archer' attacks";
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(30);
    }
}
