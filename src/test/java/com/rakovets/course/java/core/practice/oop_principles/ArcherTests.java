package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArcherTests {
    Archer archer = new Archer("Bob");

    @Test
    public void testArcher(){
        Assertions.assertEquals("Bob", archer.getName());
    }

    @Test
    public void testArcherAttackEnemy() {
        archer.attackEnemy();
        System.out.println("Archer attacks enemy");
    }
}
