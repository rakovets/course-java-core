package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class CatsHomeApplication {
    public static void main(String[] args) {
        Cat cat = new Cat("Murka");

        System.out.println(cat.getName());
        System.out.println(cat.mew());
        System.out.println(cat.purr());
        cat.setName("lisa");
        System.out.println(cat.getName());

        Siamese siamese = new Siamese("Sim");

        System.out.println(siamese.getName());
        siamese.setName("Vera");
        System.out.println(siamese.getName());
        System.out.println(siamese.mew());
        System.out.println(siamese.purr());

        Persian persian = new Persian("Persik");

        System.out.println(persian.getName());
        persian.setName("Genz");
        System.out.println(persian.getName());
        System.out.println(persian.mew());
        System.out.println(persian.purr());

        Sphynx sphynx = new Sphynx("Fakel");

        System.out.println(sphynx.getName());
        sphynx.setName("Mecci");
        System.out.println(sphynx.getName());
        System.out.println(sphynx.mew());
        System.out.println(sphynx.purr());

        Person vadim = new Person(100);

        System.out.println(vadim.getHappiness());
        System.out.println(vadim.changeHappiness(-10));
        vadim.setHappiness(50);
        System.out.println(vadim.getHappiness());
        System.out.println(vadim.changeHappiness(20));
        System.out.println(vadim.getHappiness());

        Cat cotic = new Cat("Marta");
        Person nameJoni = new Person(200);

        System.out.println(cotic.getName());
        System.out.println(nameJoni.getHappiness());
        cotic.mew(nameJoni);
        System.out.printf("%s - Their master's happiness level has decreased to %s percent.\n\n", cat.mew(), nameJoni.getHappiness());
        cotic.purr(nameJoni);
        System.out.printf("%s -Their master's happiness level has increased to %s percent.\n\n", cat.purr(), nameJoni.getHappiness());
        siamese.mew(nameJoni);
        System.out.printf("%s - Their master's happiness level has decreased to %s percent.\n\n", siamese.mew(), nameJoni.getHappiness());

        Siamese siameseCat = new Siamese("Garfield");
        Sphynx sphynxCat = new Sphynx("Barsik");
        Persian persianCat = new Persian("Murzik");
        Person nameJon = new Person(80);

        siameseCat.mew(nameJon);
        System.out.printf("%s %s - Their master's happiness level has decreased to %s percent.\n\n", siameseCat.getName(), siameseCat.mew(), nameJon.getHappiness());
        siameseCat.purr(nameJon);
        System.out.printf("%s %s - Their master's happiness level has decreased to %s percent.\n\n", siameseCat.getName(), siameseCat.purr(), nameJon.getHappiness());
        persianCat.mew(nameJon);
        System.out.printf("%s %s - Their master's happiness level has decreased to %s percent.\n\n", persianCat.getName(), persianCat.mew(), nameJon.getHappiness());
        sphynxCat.mew(nameJon);
        System.out.printf("%s %s - Their master's happiness level has decreased to %s percent.\n\n", sphynxCat.getName(), sphynxCat.mew(), nameJon.getHappiness());
    }
}
