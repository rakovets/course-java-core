package com.rakovets.course.java.core.practice.oop.principles.task02.heroSkills;

import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Beats;
import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Demon;
import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Elemental;
import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Enemy;

public class FlameStrike extends AtackSkills {
    private static final int DAMAGE = 300;

    @Override
    public int useSkill(Enemy enemy) {
        int damegeToEnemy = DAMAGE;
        if (enemy instanceof Demon) {
            damegeToEnemy = damegeToEnemy / 2;
        } else if(enemy instanceof Elemental) {
            damegeToEnemy *= 0.1;
        }

        return damegeToEnemy;
    }
}
