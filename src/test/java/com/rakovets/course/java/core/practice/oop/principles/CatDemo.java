package com.rakovets.course.java.core.practice.oop.principles;

public class CatDemo {
    public static void main(String[] args) {
        Person firstPerson = new Person(100);
        firstPerson.changeHappiness(10);
        System.out.println(firstPerson.getHappiness());

        Cat myCat = new Cat("Catten");
        System.out.println(myCat.getName());
        System.out.println(myCat.mew());
        System.out.println(myCat.purr());
        myCat.mew(firstPerson);
        System.out.println(firstPerson.getHappiness());
        myCat.purr(firstPerson);
        System.out.println(firstPerson.getHappiness());

        Persian persian = new Persian("Persik");
        System.out.println(persian.mew());
        System.out.println(persian.purr());
        persian.mew(firstPerson);
        System.out.println(firstPerson.getHappiness());
        persian.purr(firstPerson);
        System.out.println(firstPerson.getHappiness());

        Sphynx sphynx = new Sphynx("Svin");
        System.out.println(sphynx.mew());
        System.out.println(sphynx.purr());
        sphynx.mew(firstPerson);
        System.out.println(firstPerson.getHappiness());
        sphynx.purr(firstPerson);
        System.out.println(firstPerson.getHappiness());

        Siamese siamese = new Siamese("Sema");
        System.out.println(siamese.mew());
        System.out.println(siamese.purr());
        siamese.mew(firstPerson);
        System.out.println(firstPerson.getHappiness());
        siamese.purr(firstPerson);
        System.out.println(firstPerson.getHappiness());

    }


}
