package com.rakovets.course.java.core.practice.oop.principles.task02test;

import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Demon;
import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Enemy;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroSkills.AtackSkills;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroSkills.FlameStrike;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroes.Hero;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroes.Mage;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroes.Warrior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MageDemonTest {
    static Hero jaina;
    static AtackSkills fireArts;
    static Enemy demon;
    static String jainaName;
    static int jainaHealth;
    static int jainaAttack;
    static int demonHealth;
    static int demonAttack;


    @BeforeEach
    void beforeEach() {
        jainaName = "Vasya";
        jainaHealth = 100;
        jainaAttack = 100;
        demonHealth = 160;
        demonAttack = 30;
        fireArts = new FlameStrike();
        jaina = new Mage(jainaName, jainaHealth, jainaAttack, fireArts);
        demon = new Demon(demonHealth, demonAttack);

    }

    @Test
    void mageAttackEnemyTest() {
        jaina.attackEnemy(demon);
        int actual1 = demon.getHealth();
        jaina.setAttack(60);
        jaina.attackEnemy(demon);
        int actual2 = demon.getHealth();
        Assertions.assertEquals(60, actual1);
        Assertions.assertEquals(100, actual2);
    }

    @Test
    void mageAttackBySkillTest() {
        jaina.attackBySkill(demon);
        int actual = demon.getHealth();
        Assertions.assertEquals(10, actual);
    }

    @Test
    void demontAttackTest() {
        demon.attack(jaina);
        int actual = jaina.getHealth();
        Assertions.assertEquals(70, actual);
    }

    @Test
    void jainaIsAliveTest() {
        boolean actual = jaina.isAlive();
        Assertions.assertTrue(actual);
    }

    @Test
    void demonIsAliveTest() {
        boolean actual = demon.isAlive();
        Assertions.assertTrue(actual);
    }

}
