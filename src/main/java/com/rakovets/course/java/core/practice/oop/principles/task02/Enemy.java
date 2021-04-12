package com.rakovets.course.java.core.practice.oop.principles.task02;

public class Enemy implements Mortal,PoisonTouch {
    private int health;
    private int attack;

    public Enemy(int health, int attack) {
        this.health = health;
    }

    public void getDamage(int damage) {
        health -= damage;
    }

    @Override
    public boolean isAlive() {

        return health > 0;
    }
    public int attackBack(){

        return attack;
    }
    @Override
    public void poison(int poisonTouch) {

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }


}
