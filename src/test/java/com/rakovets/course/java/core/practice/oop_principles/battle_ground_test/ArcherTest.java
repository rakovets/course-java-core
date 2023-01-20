package com.rakovets.course.java.core.practice.oop_principles.battle_ground_test;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Archer;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Naga;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Undead;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArcherTest {
    Archer archer = new Archer("Kael’thas", 180);

    @Test
    public void attackEnemyTest1() {
        Undead undead = new Undead(300);

        int extendHealth = 291;
        archer.attackEnemy(undead);

        Assertions.assertEquals(extendHealth, undead.getHealth());
    }

    @Test
    public void attackEnemyTest2() {
        Undead undead = new Undead(200);

        int extendHealth = 191;
        archer.attackEnemy(undead);

        Assertions.assertEquals(extendHealth, undead.getHealth());
    }

    @Test
    public void attackEnemyTest3() {
        Naga naga = new Naga(380);

        int extendHealth = 371;
        archer.attackEnemy(naga);

        Assertions.assertEquals(extendHealth, naga.getHealth());
    }

    @Test
    public void attackEnemyTest4() {
        Naga naga = new Naga(250);

        int extendHealth = 241;
        archer.attackEnemy(naga);

        Assertions.assertEquals(extendHealth, naga.getHealth());
    }

    @Test
    public void aimedShotTest1() {
        Naga naga = new Naga(250);

        int extendHealth = 170;
        archer.aimedShot(naga);

        Assertions.assertEquals(extendHealth, naga.getHealth());
    }

    @Test
    public void aimedShotTest2() {
        Naga naga = new Naga(300);

        int extendHealth = 220;
        archer.aimedShot(naga);

        Assertions.assertEquals(extendHealth, naga.getHealth());
    }

    @Test
    public void aimedShotTest3() {
        Undead undead = new Undead(400);

        int extendHealth = 320;
        archer.aimedShot(undead);

        Assertions.assertEquals(extendHealth, undead.getHealth());
    }
}
