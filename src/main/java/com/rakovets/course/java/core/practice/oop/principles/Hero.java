package com.rakovets.course.java.core.practice.oop.principles;

public abstract class Hero implements Moral {
    private String name;
    private int indicatorHealth;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIndicatorHealth(int indicatorHealth) {
        this.indicatorHealth = indicatorHealth;
    }

    public int getIndicatorHealth() {
        return indicatorHealth;
    }

    public abstract int attackEnemy(Enemy enemy) ;

    @Override
    public boolean isAlive() {
        if (indicatorHealth > 0) {
            return true;
        }
        return false;
    }

    public int takeDamageFromEnemy(int damage) {
        indicatorHealth -= damage;
        if (indicatorHealth < 0) {
            indicatorHealth = 0;
        }
        return indicatorHealth;
    }
}
