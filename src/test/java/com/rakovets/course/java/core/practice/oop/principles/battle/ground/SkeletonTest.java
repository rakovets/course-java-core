package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SkeletonTest {

    @Test
    void addHealth() {
        assertEquals(50, new Skeleton(-50).addHealth());
    }
}
