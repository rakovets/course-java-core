package com.rakovets.course.java.core.practice.oop_principles.battle_ground_test;

import com.rakovets.course.java.core.example.generics.model.restrict.A;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Archer;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Hero;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Mag;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Naga;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NagaTest {
    static Naga naga;

    @BeforeAll
    static void init() {
        naga = new Naga(300);
    }

    @Test
    public void attackHeroTest1() {
        Archer archer = new Archer("Kael’thas", 180);

        naga.attackHero(archer);

        Assertions.assertEquals(165, archer.getHealth());
    }

    @Test
    public void attackHeroTest2() {
        Archer archer = new Archer("Kael’thas", 270);

        naga.attackHero(archer);

        Assertions.assertEquals(255, archer.getHealth());
    }

    @Test
    public void attackHeroTest3() {
        Archer archer = new Archer("Kael’thas", 220);

        naga.attackHero(archer);

        Assertions.assertEquals(205, archer.getHealth());
    }

    @Test
    public void drinkBloodTest1() {
        Archer archer = new Archer("Kael’thas", 210);

        naga.drinkBlood(archer);

        Assertions.assertEquals(185, archer.getHealth());
        Assertions.assertEquals(325, naga.getHealth());
    }

    @Test
    public void drinkBloodTest2() {
        Archer archer = new Archer("Kael’thas", 180);
        Naga naga = new Naga(200);

        naga.drinkBlood(archer);

        Assertions.assertEquals(155, archer.getHealth());
        Assertions.assertEquals(225, naga.getHealth());
    }
}
