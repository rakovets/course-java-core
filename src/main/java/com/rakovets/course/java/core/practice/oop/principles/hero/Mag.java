package com.rakovets.course.java.core.practice.oop.principles.hero;

public class Mag extends Hero {
    private final int DAMAGE = 50;
    private final int ARMOR_PERCENT = 5;
    public Mag(String name, int healthHero) {
        super(name, healthHero);
    }
    public int getDAMAGE() {
        return DAMAGE;
    }
    public void attackEnemy(Enemy enemy) {
        System.out.println("The Mag hero attacks");
        enemy.takeDamage(DAMAGE);
    }
    public void tookDamage(Enemy enemy){
        setHealthHero(getHealthHero()-(int)(enemy.getDamageEnemy() * ARMOR_PERCENT * 0.01f));
    }
};
