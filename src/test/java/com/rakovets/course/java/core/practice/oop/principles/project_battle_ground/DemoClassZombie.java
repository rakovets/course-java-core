package com.rakovets.course.java.core.practice.oop.principles.project_battle_ground;

public class DemoClassZombie {
    public static void main(String[] args) {
        Zombie zombie = new Zombie(0);
        System.out.println(zombie.isRessurect());
        System.out.println(zombie.isAlive());
        System.out.print(zombie.getHealth());

    }
}
