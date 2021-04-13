package com.rakovets.course.java.core.practice.oop.principles.task02.enemies.enemySkills;

import com.rakovets.course.java.core.practice.oop.principles.task02.heroes.Hero;

public class Poison extends EnemyAttakSkills {

    @Override
    public int useSkill(Hero hero) {
        return  hero.getHealth();
    }
}
