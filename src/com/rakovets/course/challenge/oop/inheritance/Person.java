package oop.inheritance;

public class Person {
    private int happiness;

    public Person(int happiness) {
        this.happiness = happiness;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void takeHappiness(int happiness) {
        System.out.printf("Person  hapines %d \n ", getHappiness());
        this.happiness += happiness;
        if (this.happiness < 0) {
            System.out.println("Dipretion!!");
        } else if (this.happiness > 100) {
            System.out.println("Congregulation you have DZEN !");
        }
    }
}