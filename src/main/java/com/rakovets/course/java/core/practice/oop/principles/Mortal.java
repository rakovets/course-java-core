package com.rakovets.course.java.core.practice.oop.principles;

public interface Mortal {

    default boolean isAlive() {
        return false;
    }
}
