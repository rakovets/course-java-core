package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

public class Mage extends Hero {
    int damageFromMage = 15;
    int fireBlastDamage = 20;

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(damageFromMage);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    @Override
    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
    }

    public void fireBlast(Enemy enemy1, Enemy enemy2, Enemy enemy3) {
        enemy1.takeDamage(fireBlastDamage);
        enemy2.takeDamage(fireBlastDamage);
        enemy3.takeDamage(fireBlastDamage);
    }
}
