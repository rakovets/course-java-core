package com.rakovets.course.challenge.oop.polymorphism;

class Enemy implements Mortal {
    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
        System.out.printf("Enemy  Helth: %d \n ", getHealth());
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attackHero(Hero hero) {
        System.out.printf("%s attacks the %s  \n ", getName(), hero.getClass().getSimpleName());
        System.out.printf("%s-----[%d%%] \n ", getName(), getHealth());
        hero.takeDamage(35);
    }

    public void takeDamage(int demage) {
        setHealth(health -= demage);
        if (health > 0) {
            System.out.printf("%s----[%d%%]", getName(), getHealth());
        } else {
            System.out.printf("%s----[is dead !]", getName());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

