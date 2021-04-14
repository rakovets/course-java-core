package com.rakovets.course.java.core.practice.oop.principles.task02.enemies;

import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.enemySkills.VariableDamage;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroes.Archer;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroes.Hero;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroes.Mage;

public class Elemental extends Enemy implements VariableDamage {

    public Elemental(int health, int attack) {
        super(health,attack);
    }

    @Override
    public void getDamage(int damage) {
        setHealth(getHealth() - damage);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    @Override
    public void attack(Hero hero) {
        hero.getDamageFromEnemy(varifyDamage(hero));
    }

    @Override
    public int varifyDamage(Hero hero) {
        int damage = getAttack();
        if(hero instanceof Mage){
            damage *= 0.5;
        } else if(hero instanceof Archer){
            damage *= 2;
        }

        return damage;
    }
}
