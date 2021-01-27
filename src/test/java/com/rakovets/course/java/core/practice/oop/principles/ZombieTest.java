package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZombieTest {

    @Test
    void resurrect() {
        assertTrue(new Zombie(100).resurrect());
    }
}
