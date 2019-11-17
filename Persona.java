package com.rakovets.course.challenge.oopInheritanceAndPolymorphism;

public class Persona {
    int happiness;

    Persona(int happiness) {
        this.happiness = happiness;
    }

    int takeHappiness(int happiness) {
        this.happiness += happiness;
        return this.happiness;
    }

    void norm() {
        norm();
        if(this.happiness >= 100) {
            this.happiness = 100;
        } else if(this.happiness <= 100) {
            this.happiness = 0;
        }
    }

    void display() {
        System.out.printf("%d\n", this.happiness);
    }

    int getHappiness() {
        return this.happiness;
    }

    void setHappiness(int happiness) {
        this.happiness = happiness;
        norm();
    }
}
