package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MurlocTest {
    private static Murloc murloc;
    private static Archer archer;

    @BeforeEach
    void init() {
        murloc = new Murloc(80);
        archer = new Archer("Legolas");
    }

    @Test
    void attackHeroTest1() {
        murloc.attackHero(archer);

        Assertions.assertEquals(92, archer.getHealth());
    }

    @Test
    void attackHeroTest2() {
        murloc.attackHero(archer);
        murloc.attackHero(archer);

        Assertions.assertEquals(84, archer.getHealth());
    }

    @Test
    void extraHealthTest1() {
        archer.attackEnemy(murloc);
        murloc.extraHealth();

        Assertions.assertEquals(66, murloc.getHealth());
    }

    @Test
    void extraHealthTest2() {
        murloc.extraHealth();

        Assertions.assertEquals(86, murloc.getHealth());
    }

    @Test
    void isAliveTest1() {
        archer.attackEnemy(murloc);

        Assertions.assertTrue(murloc.isAlive());
    }

    @Test
    void isAliveTest2() {
        for (int i = 0; i < 4; i++) {
            archer.attackEnemy(murloc);
        }

        Assertions.assertFalse(murloc.isAlive());
    }
}
