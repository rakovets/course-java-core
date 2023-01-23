package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ZombieTest {
    private static Zombie zombie;
    private static Archer archer;

    @BeforeEach
    void init() {
        zombie = new Zombie(80);
        archer = new Archer("Legolas");
    }

    @Test
    void attackHeroTest1() {
        zombie.attackHero(archer);

        Assertions.assertEquals(88, archer.getHealth());
    }

    @Test
    void attackHeroTest2() {
        zombie.attackHero(archer);
        zombie.attackHero(archer);

        Assertions.assertEquals(76, archer.getHealth());
    }

    @Test
    void undeadReincarnationTest() {
        for (int i = 0; i < 4; i++) {
            archer.attackEnemy(zombie);
        }
        do {
            zombie.undeadReincarnation();
        } while (!zombie.isAlive());

        Assertions.assertTrue(zombie.isAlive());
    }

    @Test
    void isAliveTest1() {
        archer.attackEnemy(zombie);

        Assertions.assertTrue(zombie.isAlive());
    }

    @Test
    void isAliveTest2() {
        for (int i = 0; i < 4; i++) {
            archer.attackEnemy(zombie);
        }

        Assertions.assertFalse(zombie.isAlive());
    }
}
