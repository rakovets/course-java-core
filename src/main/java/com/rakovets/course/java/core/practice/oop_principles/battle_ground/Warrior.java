package com.rakovets.course.java.core.practice.oop_principles.battle_ground;
class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public String attackEnemy() {
        return "The 'Warrior' attacks";
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (enemy.getHealth() >= 0 && enemy.getHealth() < 10) {
            enemy.takeDamage(1);
        } else if (enemy.getHealth() >= 10 && enemy.getHealth() < 50) {
            enemy.takeDamage(5);
        } else if ((enemy.getHealth() >= 50 && enemy.getHealth() <= 100)) {
            enemy.takeDamage(10);
        } else {
            enemy.takeDamage(50);
        }
    }
}
