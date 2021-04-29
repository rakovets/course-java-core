package com.rakovets.course.java.core.practice.oop.principles.hero;

public class Warrior extends Hero{
    private final int DAMAGE = 15;
    private final int ARMOR_PERCENT = 30;

    public Warrior(String name, int healthHero) {
        super(name, healthHero);
    }

    public int getDAMAGE() {
        return DAMAGE;
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println("The Warrior hero attacks");
        enemy.takeDamage(DAMAGE);
    }

    public void tookDamage(Enemy enemy){
        setHealthHero(getHealthHero()-(int)(enemy.getDamageEnemy() * ARMOR_PERCENT * 0.01f));
    }
}
