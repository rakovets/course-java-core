package oop.inheritance;

class Persian extends Cat {
    Persian(String name) {
        super(name);
    }

    public void mew(Person person) {
        person.takeHappiness(-3);
        System.out.println(" Persian cat mew : privet");
    }

    public void purr(Person person) {
        person.takeHappiness(9);
        System.out.printf("Cat  %s say hello \n", getName());
    }

}
