package com.rakovets.course.java.core.practice.oop.principles.task02.heroes;

import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Enemy;
import com.rakovets.course.java.core.practice.oop.principles.task02.Mortal;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroSkills.AtackSkills;

public abstract class Hero implements Mortal {
    private String name;
    private int health;
    private int attack;
    private AtackSkills atackSkills;


    public Hero(String name, int health, int attack, AtackSkills atackSkills) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.atackSkills = atackSkills;
    }

    public abstract void attackEnemy(Enemy enemy);

    public abstract void getDamageFromEnemy (int damage);

    public abstract void attackBySkill(Enemy enemy);

    public String getName() {
        return name;
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

    public AtackSkills getAtackSkills() {
        return atackSkills;
    }

    public void setAtackSkills(AtackSkills atackSkills) {
        this.atackSkills = atackSkills;
    }
}
