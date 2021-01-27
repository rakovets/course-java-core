package com.rakovets.course.java.core.practice.oop.principles.project_battle_ground;

public class DemoClassVampires {
    public static void main(String[] args) {
        Vampires vampires = new Vampires(10);
        System.out.println(vampires.isRegenerate(vampires));
        System.out.println(vampires.getHealth());
    }
}
