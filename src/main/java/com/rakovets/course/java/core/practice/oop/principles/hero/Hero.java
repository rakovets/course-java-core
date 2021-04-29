package com.rakovets.course.java.core.practice.oop.principles.hero;

abstract class Hero {
    private String name;
    private int healthHero;

    public Hero(String name, int healthHero) {
        this.name = name;
        this.healthHero = healthHero;
    }
    public String getHeroName() {
        return name;
    }

    public int getHealthHero() {
        return healthHero;
    }

    public  void setHealthHero(int healthHero) {
        this.healthHero = healthHero;
    }

    public abstract void attackEnemy(Enemy enemy);

    public boolean isAliveHero() {
        return healthHero>0;
    }
}
