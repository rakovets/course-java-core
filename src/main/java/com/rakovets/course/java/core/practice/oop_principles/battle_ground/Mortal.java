package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public interface Mortal {
    default boolean isAlive() {
        return false;
    }
}
