package com.rakovets.course.java.core.practice.oop_principles.battle_ground_test;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.*;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.Siamese;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class WarriorTest {
    static Warrior warrior;

    @BeforeAll
    static void init() {
        warrior = new Warrior("Arthas", 250);
    }

    @Test
    public void attackEnemyTest1() {
        Undead undead = new Undead(300);

        warrior.attackEnemy(undead);

        Assertions.assertEquals(280, undead.getHealth());
    }

    @Test
    public void attackEnemyTest2() {
        Undead undead = new Undead(200);

        warrior.attackEnemy(undead);

        Assertions.assertEquals(180, undead.getHealth());
    }

    @Test
    public void attackEnemyTest3() {
        Naga naga = new Naga(380);

        warrior.attackEnemy(naga);

        Assertions.assertEquals(360, naga.getHealth());
    }

    @Test
    public void attackEnemyTest4() {
        Naga naga = new Naga(250);

        warrior.attackEnemy(naga);

        Assertions.assertEquals(230, naga.getHealth());
    }

    @Test
    public void crazyAttackEnemyTest1() {
        Naga naga = new Naga(250);

        warrior.crazyAttackEnemy(naga);

        Assertions.assertEquals(130, naga.getHealth());
    }

    @Test
    public void crazyAttackEnemyTest2() {
        Naga naga = new Naga(250);

        warrior.crazyAttackEnemy(naga);

        Assertions.assertEquals(130, naga.getHealth());
    }

    @Test
    public void crazyAttackEnemyTest3() {
        Undead undead = new Undead(300);

        warrior.crazyAttackEnemy(undead);

        Assertions.assertEquals(180, undead.getHealth());
    }
}
