package com.rakovets.course.java.core.practice.oop.principles.hero;

public class Enemy  implements Mortal{
    private int health;
    private int damageEnemy;

    public Enemy(int health,int damageEnemy) {
        this.health = health;
        this.damageEnemy = damageEnemy;
    }

    public int getEnemyHealth() {
        return health;
    }

    public int getDamageEnemy() {
        return damageEnemy;
    }

    public void setEnemyHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damаge) {
        health -= damаge;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isAlive() {
        return health > 0 ;
    }
}
