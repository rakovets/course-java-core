package com.rakovets.course.java.core.practice.oop.principles.project_battle_ground;

public class DemoClassArcher {
    public static void main(String[] args) {
        Archer archer = new Archer("Tarus", 100);
        Mutant mutant = new Mutant(100);
        System.out.println(archer.takePowerShot(mutant));
        System.out.println(mutant.getHealth());
    }
}
