package com.rakovets.course.java.core.practice.oop.principles.task02.heroSkills;

import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Demon;
import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Elemental;
import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Enemy;

public class BowFury extends AtackSkills{
    private static final int DAMAGE = 120;

    @Override
    public int useSkill(Enemy enemy) {
        int damegeTOEnemy = DAMAGE;
        if (enemy instanceof Demon) {
            damegeTOEnemy *= 0.9;
        } else if(enemy instanceof Elemental) {
            damegeTOEnemy *= 0.8;
        }
        return damegeTOEnemy;
    }
}

