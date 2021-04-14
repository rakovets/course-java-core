package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagTest {

    @Test
    void magTest() {
        Hero mag = new Mag("Mag");
        String actual = mag.attackEnemy();
        Assertions.assertEquals("Mag attacks with magic", actual);
    }
}
