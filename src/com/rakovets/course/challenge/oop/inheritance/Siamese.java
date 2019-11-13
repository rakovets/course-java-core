package com.rakovets.course.challenge.oop.inheritance;

class Siamese extends Cat {

    Siamese( String name) {
        super(name);
    }

    public void mew(Person person) {
        person.takeHappiness(-7);
        System.out.println("Siamese cat mew : ololo");
    }

    public void purr(Person person) {
        person.takeHappiness(8);
        System.out.println("Siamese cat perr : mrmrmrm");
    }

}
