package com.rakovets.course.java.core.practice.oop.principles.task02.heroSkills;

import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Demon;
import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Elemental;
import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Enemy;

public class SwordRain extends AtackSkills {
    private static final int DAMAGE = 150;

    @Override
    public int useSkill(Enemy enemy) {
        int damegeTOEnemy = DAMAGE;
        if (enemy instanceof Demon) {
            damegeTOEnemy *= 0.8;
        } else if(enemy instanceof Elemental) {
            damegeTOEnemy *= 0.9;
        }
        return damegeTOEnemy;
    }
}
