package com.rakovets.course.java.core.practice.oop.principles.project_battle_ground;

public class DemoClassMutant {
    public static void main(String[] args) {
        Mutant mutant = new Mutant(100);
        Mag mag = new Mag("Sigmund", 100);
        System.out.println(mutant.doComboAttack(mag));
        System.out.println(mag.getHealth());
    }
}
