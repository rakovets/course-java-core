package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonTest {

        @Test
        void addHealth() {
            assertEquals(50, new Dragon(-50).addHealth());
        }
    }
