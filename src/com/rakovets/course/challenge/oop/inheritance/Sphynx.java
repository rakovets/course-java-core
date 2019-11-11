package oop.inheritance;

class Sphynx extends Cat {

    Sphynx(String name) {
        super(name);
    }
    public void mew(Person person) {
        person.takeHappiness(-9);
        System.out.println("Sphynx cat mew : rowrowriw");
    }

    public void purr(Person person) {
        person.takeHappiness(7);
        System.out.println("Sphynx cat perr : rtyrtyrty");
    }
}
