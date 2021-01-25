package com.rakovets.course.java.core.practice.oop.principles.battle.ground.tests;

public interface Mortal {

    default boolean isAlive() {
        return false;
    }
}
