package com.rakovets.course.java.core.practice.oop.principles.task02test;

import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Elemental;
import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Enemy;
import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.enemySkills.EnemyAttakSkills;
import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.enemySkills.Poison;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroSkills.AtackSkills;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroSkills.FlameStrike;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroes.Hero;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroes.Warrior;

public class BattleGroundTest {
    public static void main(String[] args) {
        AtackSkills sords = new FlameStrike();
        EnemyAttakSkills poison = new Poison();
        Hero war = new Warrior("Garroh", 500,50, sords);
        Enemy bst = new Elemental(400, 40, poison);
        System.out.println(war.getHealth() + "\n" + bst.getHealth());
        war.attackEnemy(bst);
        System.out.println(war.getHealth() + "\n" + bst.getHealth());
        bst.attack(war);
        System.out.println(war.getHealth() + "\n" + bst.getHealth());
        war.attackBySkill(bst);
        System.out.println(war.getHealth() + "\n" + bst.getHealth());

    }
}
