package com.rakovets.course.challenge.classes;

public class Person {
    double happiness;

    Person(double happiness) {
        this.happiness = happiness;
    }

    void takeHappiness(double happiness) {
        this.happiness += happiness;
    }

    void getHappiness() {
        System.out.println(happiness + "%");
    }

    void setHappiness(double happiness) {
        this.happiness = happiness;
    }
}
