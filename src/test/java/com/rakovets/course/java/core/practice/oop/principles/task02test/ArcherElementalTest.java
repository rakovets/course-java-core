package com.rakovets.course.java.core.practice.oop.principles.task02test;

import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Elemental;
import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Enemy;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroSkills.AtackSkills;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroSkills.BowFury;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroSkills.FlameStrike;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroes.Archer;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroes.Hero;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroes.Warrior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArcherElementalTest {
    static Hero archer;
    static AtackSkills fireArts;
    static Enemy elem;
    static String archerName;
    static int archerHealth;
    static int archerAttack;
    static int elemHealth;
    static int elemAttack;


    @BeforeEach
    void beforeEach() {
        archerName = "Vasya";
        archerHealth = 100;
        archerAttack = 100;
        elemHealth = 160;
        elemAttack = 30;
        fireArts = new BowFury();
        archer = new Archer(archerName, archerHealth, archerAttack, fireArts);
        elem = new Elemental(elemHealth, elemAttack);

    }

    @Test
    void archerAttackEnemyTest() {
        archer.attackEnemy(elem);
        int actual1 = elem.getHealth();
        Assertions.assertEquals(60, actual1);
    }

    @Test
    void archerAttackBySkillTest() {
        archer.attackBySkill(elem);
        int actual = elem.getHealth();
        Assertions.assertEquals(100, actual);
    }

    @Test
    void elemAttackTest() {
        elem.attack(archer);
        int actual = archer.getHealth();
        Assertions.assertEquals(40, actual);
    }

    @Test
    void archerIsAliveTest() {
        boolean actual = archer.isAlive();
        Assertions.assertTrue(actual);
    }

    @Test
    void elemIsAliveTest() {
        boolean actual = elem.isAlive();
        Assertions.assertTrue(actual);
    }
}
