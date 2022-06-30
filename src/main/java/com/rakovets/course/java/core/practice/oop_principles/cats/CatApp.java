package com.rakovets.course.java.core.practice.oop_principles.cats;

public class CatApp {
    public static void main(String[] args) {
        Cat cat = new Cat("cat");
        Cat persian = new Persian("persian");
        Cat sphynx = new Sphynx("sphynx");
        Cat siamese = new Siamese("siamese");
        Person joe = new Person(60);

        System.out.println(cat.getName());
        cat.setName("cat tom");
        System.out.println(cat.getName());
        System.out.println(cat.mew());
        System.out.println(cat.purr());

        System.out.println(persian.getName());
        persian.setName("persian tom");
        System.out.println(persian.getName());
        System.out.println(persian.mew());
        System.out.println(persian.purr());

        System.out.println(sphynx.getName());
        sphynx.setName("sphynx tom");
        System.out.println(sphynx.getName());
        System.out.println(sphynx.mew());
        System.out.println(sphynx.purr());

        System.out.println(siamese.getName());
        siamese.setName("siamese tom");
        System.out.println(siamese.getName());
        System.out.println(siamese.mew());
        System.out.println(siamese.purr());

        cat.mew(joe);
        System.out.println(joe.getHappiness());

        cat.purr(joe);
        System.out.println(joe.getHappiness());

        persian.mew(joe);
        System.out.println(joe.getHappiness());

        persian.purr(joe);
        System.out.println(joe.getHappiness());

        sphynx.mew(joe);
        System.out.println(joe.getHappiness());

        sphynx.purr(joe);
        System.out.println(joe.getHappiness());

        siamese.mew(joe);
        System.out.println(joe.getHappiness());

        siamese.purr(joe);
        System.out.println(joe.getHappiness());

        joe.setHappiness(95);
        System.out.println(joe.getHappiness());

        joe.changeHappiness(5);
        System.out.println(joe.getHappiness());

        joe.changeHappiness(-5);
        System.out.println(joe.getHappiness());
    }
}
