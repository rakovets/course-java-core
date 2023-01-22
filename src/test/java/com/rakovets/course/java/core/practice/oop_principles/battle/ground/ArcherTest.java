package com.rakovets.course.java.core.practice.oop_principles.battle.ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArcherTest {
    static Archer archer;
    static Enemy murloc;
    int result;

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
}
