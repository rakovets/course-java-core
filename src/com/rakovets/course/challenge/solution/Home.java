package com.rakovets.course.challenge.solution;

public class Home {

    public static void main(String[] args) {

    Cat vasya = new Cat("Vasya");
    vasya.mew();
    vasya.poor();
    System.out.println(vasya.getName());
    vasya.setName("Vitya");
    System.out.println(vasya.getName());

    Person lexa =new Person(0);
    Persian tom = new Persian("Tom");
    Siamese sam = new Siamese("Sam");
    Sphynx gosha = new Sphynx("Gosha");

    tom.mew(lexa);
    sam.poor(lexa);
    gosha.poor(lexa);
    gosha.mew(lexa);

    System.out.println(lexa.getHappiness());

    }
}



