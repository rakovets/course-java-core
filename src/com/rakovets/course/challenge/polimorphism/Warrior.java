package com.rakovets.course.challenge.polimorphism;

public class Warrior extends Hero implements Mortal{
    private final int DEFAULT_DAMAGE = 19;

    Warrior(String name, int health) {
        super(name, health);
    }

    public void attackEnemy(Enemy enemy){
        System.out.printf("%s is attacking the %s, damage is: " + DEFAULT_DAMAGE +"\n", getName(), enemy.getName());
        enemy.takeDamage(DEFAULT_DAMAGE);
    }

    public void superWarriorPunch(Enemy enemy){
        System.out.printf("%s used super punch\n", getName());
        enemy.setHealth(DEFAULT_DAMAGE * 2);
        System.out.printf("%s health is: " + enemy.getHealth() + "\n", enemy.getName());
    }
}
