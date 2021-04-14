package com.rakovets.course.java.core.practice.oop.principles;
import com.rakovets.course.java.core.practice.oop.principles.cat.*;

public class CatDemo {
    public static void main(String[] args) {
        Person firstPerson = new Person(100);
        firstPerson.changeHappiness(10);
        System.out.println("Happiness : " + firstPerson.getHappiness());

        Cat myCat = new Cat("Catten");
        System.out.println("Cat : " + myCat.getName());
        System.out.println(myCat.mew(firstPerson));
        System.out.println("Happiness : " + firstPerson.getHappiness());
        System.out.println(myCat.purr(firstPerson));
        System.out.println("Happiness : " + firstPerson.getHappiness());

        Persian persian = new Persian("Persik");
        System.out.println("Cat : " + persian.getName());
        System.out.println(persian.mew(firstPerson));
        System.out.println("Happiness : " + firstPerson.getHappiness());
        System.out.println(persian.purr(firstPerson));
        System.out.println("Happiness : " + firstPerson.getHappiness());

        Sphynx sphynx = new Sphynx("Svin");
        System.out.println("Cat : " + sphynx.getName());
        System.out.println(sphynx.mew(firstPerson));
        System.out.println("Happiness : " + firstPerson.getHappiness());
        System.out.println(sphynx.purr(firstPerson));
        System.out.println("Happiness : " + firstPerson.getHappiness());

        Siamese siamese = new Siamese("Sema");
        System.out.println("Cat : " + siamese.getName());
        System.out.println(siamese.mew(firstPerson));
        System.out.println("Happiness : " + firstPerson.getHappiness());
        System.out.println(siamese.purr(firstPerson));
        System.out.println("Happiness : " + firstPerson.getHappiness());

    }
}
