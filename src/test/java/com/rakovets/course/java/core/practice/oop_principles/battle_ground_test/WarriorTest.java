package com.rakovets.course.java.core.practice.oop_principles.battle_ground_test;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.*;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.Siamese;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarriorTest {
    Warrior warrior = new Warrior("Arthas", 250);

    @Test
    public void attackEnemyTest1() {
        Undead undead = new Undead(300);

        int extendHealth = 280;
        warrior.attackEnemy(undead);

        Assertions.assertEquals(extendHealth, undead.getHealth());
    }

    @Test
    public void attackEnemyTest2() {
        Undead undead = new Undead(200);

        int extendHealth = 180;
        warrior.attackEnemy(undead);

        Assertions.assertEquals(extendHealth, undead.getHealth());
    }

    @Test
    public void attackEnemyTest3() {
        Naga naga = new Naga(380);

        int extendHealth = 360;
        warrior.attackEnemy(naga);

        Assertions.assertEquals(extendHealth, naga.getHealth());
    }

    @Test
    public void attackEnemyTest4() {
        Naga naga = new Naga(250);

        int extendHealth = 230;
        warrior.attackEnemy(naga);

        Assertions.assertEquals(extendHealth, naga.getHealth());
    }

    @Test
    public void crazyAttackEnemyTest1() {
        Naga naga = new Naga(250);

        int extendHealth = 130;
        warrior.crazyAttackEnemy(naga);

        Assertions.assertEquals(extendHealth, naga.getHealth());
    }

    @Test
    public void crazyAttackEnemyTest2() {
        Naga naga = new Naga(250);

        int extendHealth = 130;
        warrior.crazyAttackEnemy(naga);

        Assertions.assertEquals(extendHealth, naga.getHealth());
    }

    @Test
    public void crazyAttackEnemyTest3() {
        Undead undead = new Undead(300);

        int extendHealth = 180;
        warrior.crazyAttackEnemy(undead);

        Assertions.assertEquals(extendHealth, undead.getHealth());
    }
}
