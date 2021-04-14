package com.rakovets.course.java.core.practice.oop.principles.task02.heroes;

import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Enemy;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroSkills.AtackSkills;

public class Mage extends Hero {

    public Mage(String name, int health, int attack, AtackSkills atackSkills){
        super(name, health,attack, atackSkills);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Your soul shall be mine!");
        enemy.getDamage(getAttack());
    }

    @Override
    public void getDamageFromEnemy(int damage) {
        super.setHealth(getHealth() - damage);

    }

    public void attackBySkill(Enemy enemy) {
        enemy.getDamage(super.getAtackSkills().useSkill(enemy));

    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
