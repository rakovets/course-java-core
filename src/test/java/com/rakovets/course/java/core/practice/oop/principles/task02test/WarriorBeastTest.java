package com.rakovets.course.java.core.practice.oop.principles.task02test;

import com.rakovets.course.java.core.practice.oop.principles.task01.Persian;
import com.rakovets.course.java.core.practice.oop.principles.task01.Person;
import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Beast;
import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Enemy;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroSkills.AtackSkills;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroSkills.SwordRain;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroes.Hero;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroes.Warrior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WarriorBeastTest {
    static Hero warlock;
    static AtackSkills swordMaster;
    static Enemy beast;
    static String warlockName;
    static int warlockHealth;
    static int warlockAttack;
    static  int beatsHealth;
    static  int beastAttack;



    @BeforeEach
    void beforeAll(){
        warlockName = "Vasya";
        warlockHealth = 100;
        warlockAttack = 50;
        beatsHealth = 160;
        beastAttack =30;
        swordMaster = new SwordRain();
        warlock = new Warrior(warlockName,warlockHealth,warlockAttack, swordMaster);
        beast = new Beast(beatsHealth,beastAttack);

    }

    @Test
    void warriorAttackEnemyTest() {
        warlock.attackEnemy(beast);
        int actual = beast.getHealth();
        Assertions.assertEquals(110,actual);
    }

    @Test
    void warriorAttackBySkillTest() {
        warlock.attackBySkill(beast);
        int actual = beast.getHealth();
        Assertions.assertEquals(10,actual);
    }

    @Test
    void beastAttackTest() {
        beast.attack(warlock);
        int actual = warlock.getHealth();
        Assertions.assertEquals(0,actual);
    }

    @Test
    void warriorIsAliveTest() {
        boolean actual = warlock.isAlive();
        Assertions.assertTrue(actual);
    }

    @Test
    void beastIsAliveTest() {
        boolean actual = beast.isAlive();
        Assertions.assertTrue(actual);
    }




}
