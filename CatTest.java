package com.rakovets.course.challenge.oopInheritanceAndPolymorphism;

public class CatTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Sam");
        cat.display();
        cat.mew();
        cat.purr();
        cat.setName("Tom");
        System.out.printf("%s\n", cat.getName());

        Cat siamese = new Siamese("cat2");
        siamese.display();
        siamese.mew();
        siamese.purr();

        Cat persian = new Persian("cat3");
        persian.display();
        persian.mew();
        persian.purr();

        Cat sphynx = new Sphynx("cat4");
        sphynx.display();
        sphynx.mew();
        sphynx.purr();

        Persona John = new Persona(20);
        John.display();
        cat.mew(John);
        John.display();
        cat.purr(John);

        siamese.mew(John);
        John.display();
        siamese.purr(John);
        John.display();

        persian.mew(John);
        John.display();
        persian.purr(John);
        John.display();

        sphynx.mew(John);
        John.display();
        sphynx.purr(John);
        John.display();

        sphynx.mew(John);
        sphynx.mew(John);
        sphynx.mew(John);
        sphynx.mew(John);
        sphynx.mew(John);
        sphynx.mew(John);
        John.display();


    }
}
