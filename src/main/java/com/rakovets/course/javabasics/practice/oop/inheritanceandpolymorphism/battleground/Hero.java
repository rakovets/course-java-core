package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

abstract class Hero {
    public String name;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    Hero(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    abstract String attackEnemy();
}
