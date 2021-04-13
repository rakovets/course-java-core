package com.rakovets.course.java.core.practice.oop.principles;

import com.rakovets.course.java.core.practice.oop.principles.Cats.*;

public class CatDemo {
    public static void main(String[] args) {
        Person person = new Person(100);
        Cat cat = new Cat("Cat");
        Persian persian = new Persian("Cat");
        Siamese siamese = new Siamese("Cat");
        Sphynx sphinx = new Sphynx("Cat");
        System.out.printf("Cat name: %s\n", cat.getName());
        System.out.printf("Persian cat name: %s\n", persian.getName());
        System.out.printf("Siamese cat name: %s\n", siamese.getName());
        System.out.printf("Sphinx cat name: %s\n\n", sphinx.getName());
        cat.setName("CAT");
        persian.setName("PERS");
        siamese.setName("SIAM");
        sphinx.setName("SPIN");
        System.out.printf("Cat new name: %s\n", cat.getName());
        System.out.printf("Persian cat new name: %s\n", persian.getName());
        System.out.printf("Siamese cat new name: %s\n", siamese.getName());
        System.out.printf("Sphinx cat new name: %s\n\n", sphinx.getName());
        System.out.printf("Cat said: %s\n", cat.mew());
        System.out.printf("Persian cat said: %s\n", persian.mew());
        System.out.printf("Siamese cat said: %s\n", siamese.mew());
        System.out.printf("Sphinx cat said: %s\n\n", sphinx.mew());
        System.out.printf("Cat sound: %s\n", cat.mew());
        System.out.printf("Persian cat sound: %s\n", persian.mew());
        System.out.printf("Siamese cat sound: %s\n", siamese.mew());
        System.out.printf("Sphinx cat sound: %s\n\n", sphinx.mew());
        System.out.printf("Person happiness: %s\n", person.getHappiness());
        cat.mew(person);
        System.out.printf("Person happiness: %s\n", person.getHappiness());
        persian.mew(person);
        System.out.printf("Person happiness: %s\n", person.getHappiness());
        siamese.mew(person);
        System.out.printf("Person happiness: %s\n", person.getHappiness());
        sphinx.mew(person);
        System.out.printf("Person happiness: %s\n", person.getHappiness());
        cat.purr(person);
        System.out.printf("Person happiness: %s\n", person.getHappiness());
        persian.purr(person);
        System.out.printf("Person happiness: %s\n", person.getHappiness());
        siamese.purr(person);
        System.out.printf("Person happiness: %s\n", person.getHappiness());
        sphinx.purr(person);
        System.out.printf("Person happiness: %s\n", person.getHappiness());
    }
}


