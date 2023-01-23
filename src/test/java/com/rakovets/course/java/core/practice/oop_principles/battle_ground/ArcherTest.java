package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArcherTest {
    private static Archer archer;
    private static Enemy murloc;
    private int result;

    @BeforeEach
    void init() {
        archer = new Archer("Legolas");
        murloc = new Murloc(80);
    }

    @Test
    void attackEnemyTest() {
        archer.attackEnemy(murloc);
        result = murloc.getHealth();

        Assertions.assertEquals(60, result);
    }

    @Test
    void firstAidTest1() {
        archer.firstAid(archer);
        result = archer.getHealth();

        Assertions.assertEquals(100, result);
    }

    @Test
    void firstAidTest2() {
        murloc.attackHero(archer);
        archer.firstAid(archer);
        result = archer.getHealth();

        Assertions.assertEquals(100, result);
    }

    @Test
    void firstAidTest3() {
        murloc.attackHero(archer);
        murloc.attackHero(archer);
        archer.firstAid(archer);
        result = archer.getHealth();

        Assertions.assertEquals(96, result);
    }

    @Test
    void isAliveTest1() {
        murloc.attackHero(archer);

        Assertions.assertTrue(archer.isAlive());
    }

    @Test
    void isAliveTest2() {
        for (int i = 0; i < 14; i++) {
            murloc.attackHero(archer);
        }

        Assertions.assertFalse(archer.isAlive());
    }
}
