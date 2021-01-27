package com.rakovets.course.java.core.practice.oop.principles.project_battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MutantTest {

    @Test
    void attackHero() {
        //Given
        Hero mag = new Mag("Sigmund",100);
        Mutant mutant = new Mutant(100);
        int expectedHeroHealth = 95;

        //When
        mutant.attackHero(mag);

        //Than
        Assertions.assertEquals(expectedHeroHealth, mag.getHealth());
    }
}
