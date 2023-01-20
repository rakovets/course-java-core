package com.rakovets.course.java.core.practice.oop_principles.battle_ground_test;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Mag;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Naga;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Undead;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagTest {
    Mag mag = new Mag("Antonidas", 180);

    @Test
    public void attackEnemyTest1() {
        Undead undead = new Undead(300);

        int extendHealth = 292;
        mag.attackEnemy(undead);

        Assertions.assertEquals(extendHealth, undead.getHealth());
    }

    @Test
    public void attackEnemyTest2() {
        Undead undead = new Undead(200);

        int extendHealth = 192;
        mag.attackEnemy(undead);

        Assertions.assertEquals(extendHealth, undead.getHealth());
    }

    @Test
    public void attackEnemyTest3() {
        Naga naga = new Naga(380);

        int extendHealth = 372;
        mag.attackEnemy(naga);

        Assertions.assertEquals(extendHealth, naga.getHealth());
    }

    @Test
    public void healthRegenerationTest1() {
        Mag mag = new Mag("Antonidas", 10);

        int extendHealth = 40;
        mag.healthRegeneration();

        Assertions.assertEquals(extendHealth, mag.getHealth());
    }

    @Test
    public void healthRegenerationTest2() {
        Mag mag = new Mag("Antonidas", 18);

        int extendHealth = 48;
        mag.healthRegeneration();

        Assertions.assertEquals(extendHealth, mag.getHealth());
    }

    @Test
    public void healthRegenerationTest3() {
        Mag mag = new Mag("Antonidas", 5);

        int extendHealth = 35;
        mag.healthRegeneration();

        Assertions.assertEquals(extendHealth, mag.getHealth());
    }
}
