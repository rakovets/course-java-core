package com.rakovets.course.challenge.polimorphism;

public class Mag extends Hero implements Mortal{
    private final int DEFAULT_DAMAGE = 7;
    private final int EMERGENCY_HEALTH = 25;

    Mag(String name, int health) {
        super(name, health);
    }

    public void attackEnemy(Enemy enemy){
        System.out.printf("%s is attacking the %s, damage is: " + DEFAULT_DAMAGE +"\n", getName(), enemy.getName());
        enemy.takeDamage(DEFAULT_DAMAGE);
    }

    public void heal(Hero hero){
        System.out.printf("%s is emergency %s, %s health is: " + hero.getHealth() + EMERGENCY_HEALTH + "\n", getName(), hero.getName(), hero.getName());
        hero.setHealth(hero.getHealth() + EMERGENCY_HEALTH);
    }
}