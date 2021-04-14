package com.rakovets.course.java.core.practice.oop.principles.task02test;

import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Beast;
import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Demon;
import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Elemental;
import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Enemy;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroSkills.AtackSkills;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroSkills.FlameStrike;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroes.Hero;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroes.Warrior;

public class BattleGroundDemo {
    public static void main(String[] args) {
        AtackSkills sords = new FlameStrike();
        Hero war = new Warrior("Garroh", 500,50, sords);
        Enemy bst = new Beast(50, 40);
        Enemy el = new Elemental(100, 100);
        Enemy dm = new Demon(40,60);
        System.out.println(war.getHealth() + "\n" + bst.getHealth());
        war.attackEnemy(bst);
        System.out.println(war.getHealth() + "\n" + bst.getHealth());
        bst.attack(war);

        System.out.println(war.getHealth() + "\n" + bst.getHealth() +"\n  \n +\n");

        war.attackEnemy(dm);
        System.out.println(war.getHealth() + "\n" + dm.getHealth());



    }
}
