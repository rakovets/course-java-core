package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArcherTest {

    @Test
    void archerTest() {
        Hero archer = new Archer("Archer");
        String actual = archer.attackEnemy();
        Assertions.assertEquals("Archer attacks with bow or crossbow", actual);
    }
}
