package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class CatsHomeApplication {
    public static void main(String[] args) {
        Person catOwner = new Person(50);
        Siamese simba = new Siamese("Simba");
        Persian pumba = new Persian("Pumba");
        Sphynx bald = new Sphynx("Bald");

        System.out.println(simba.mew());
        System.out.println(pumba.mew());
        System.out.println(bald.mew());

        System.out.println(catOwner.getHappiness());
        System.out.println(simba.mew(catOwner));
        System.out.println(catOwner.getHappiness());

        System.out.println(pumba.mew(catOwner));
        System.out.println(catOwner.getHappiness());

        System.out.println(bald.mew(catOwner));
        System.out.println(catOwner.getHappiness());

        catOwner.setHappiness(300);
        System.out.println("Now happiness: " + catOwner.getHappiness());

        catOwner.setHappiness(-500);
        System.out.println("Now happiness: " + catOwner.getHappiness());

        System.out.println(simba.purr(catOwner));
        System.out.println(catOwner.getHappiness());

        System.out.println(pumba.purr(catOwner));
        System.out.println(catOwner.getHappiness());

        System.out.println(bald.purr(catOwner));
        System.out.println(catOwner.getHappiness());

        System.out.println(bald.purr(catOwner));
        System.out.println(catOwner.getHappiness());
    }
}
