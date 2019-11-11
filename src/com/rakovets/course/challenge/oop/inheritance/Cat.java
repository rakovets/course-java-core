package oop.inheritance;

public class Cat {
    private String name;


    Cat(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void mew(Person person) {
        person.takeHappiness(-2);
        System.out.println("Cat say mew");
    }

    public void purr(Person person) {
        person.takeHappiness(2);
        System.out.println("Cat do purr");
    }

}
