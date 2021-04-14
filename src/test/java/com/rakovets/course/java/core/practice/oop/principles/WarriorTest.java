package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarriorTest {

    @Test
    void warriorTest() {
        Hero warrior = new Warrior("Warrior");
        String actual = warrior.attackEnemy();
        Assertions.assertEquals("Warrior attacks with sword and dagger", actual);
    }
}
