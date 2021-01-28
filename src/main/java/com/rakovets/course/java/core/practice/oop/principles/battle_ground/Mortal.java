package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public interface Mortal {

    default boolean isAlive() {
        return false;
    }
}
