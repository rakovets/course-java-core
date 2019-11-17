package com.rakovets.course.challenge.polimorphism;

public class Archer extends Hero implements Mortal{
    private final int DEFAULT_DAMAGE = 15;

    Archer(String name, int health) {
        super(name, health);
    }

    public void attackEnemy(Enemy enemy){
        System.out.printf("%s is attacking the %s, damage is: " + DEFAULT_DAMAGE +"\n", getName(), enemy.getName());
        enemy.takeDamage(DEFAULT_DAMAGE);
    }

    public void superPunch(Enemy enemy){
        System.out.printf("%s used super punch, %s health division on 2\n", getName(), enemy.getName());
        enemy.setHealth(enemy.getHealth() / 2);
        System.out.printf("%s health is: " + enemy.getHealth() + "\n", enemy.getName());
    }
}
